import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 


import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XMLFile {
	private String nombre, path, pathReal, nombreInterno;
	private File archivo;	
	private DocumentBuilderFactory docFactory;
	private DocumentBuilder docBuilder;
	private Document doc;
	private Element rootElement;
	
	// El path es la carpeta donde se encuentra el archivo
	public XMLFile(String nombre,  String path){
		this.nombre = nombre;
		this.path = path;
		pathReal = path+"\\"+nombre+".XML";
		// Se revisa si ya existe el archivo o se crea
		try{
			archivo = new File(pathReal);
			if (! archivo.exists()){
				// Si no existe el archivo se crea un XML nuevo
				docFactory = DocumentBuilderFactory.newInstance();
				docBuilder = docFactory.newDocumentBuilder();				
				doc = docBuilder.newDocument();
				rootElement = doc.createElement(nombre);
				doc.appendChild(rootElement);		
				
				// Lo hacemos un archivo
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(new File(pathReal));
				transformer.transform(source, result);
			}else{
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				doc = dBuilder.parse(archivo);
				doc.getDocumentElement().normalize();
				rootElement =doc.getDocumentElement();
			}
		}catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
	    }
	}
	
	public void add(String tipo, ArrayList<String> columnas, ArrayList<String> contenido){
		// Si hay menos contenido que columnas se llenan de null
		while (columnas.size()>contenido.size()){
			contenido.add("null");
		}
		try{
			Element interno = doc.createElement(tipo);
			rootElement.appendChild(interno);
			Element temp;
			for (int i=0; i<columnas.size(); i++){
				temp = doc.createElement(columnas.get(i));			
				temp.appendChild(doc.createTextNode(contenido.get(i)));
				interno.appendChild(temp);
			}
			
			// Lo ponemos en el .XML
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(pathReal));
			transformer.transform(source, result);
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
	    }
	}
	
	public void addTagConstraint(String nombre){
		Element eLemt = elementoPorNombre("tabla", "nombreTabla", nombre);
		eLemt.appendChild(doc.createElement("constraints"));
		createFile();
	}
	
	public Element getRootElement() {
		return rootElement;
	}

	public void setRootElement(Element rootElement) {
		this.rootElement = rootElement;
	}
	
	public File getArchivo() {
		return archivo;
	}

	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}

	public void createFile(){
		try{
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(pathReal));
			transformer.transform(source, result);
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void cambiarColumna(String cambiar, String nuevo, String viejo, String tipo){
		NodeList list = rootElement.getElementsByTagName(tipo);
		 
		for (int i = 0; i < list.getLength(); i++) {
			org.w3c.dom.Node nodo =  list.item(i);
			if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
	           Element eElement = (Element) nodo;
	           if (eElement.getElementsByTagName(cambiar).item(0).getTextContent().equals(viejo)){
	        	   eElement.getElementsByTagName(cambiar).item(0).setTextContent(nuevo);
	           }
			}
		}
		createFile();		
	}
	
	// Recibe una lista de nodos y mira si hay foreing key y mira si hay referencia a una tabla
	public boolean referenciaFK(String tabla, NodeList list){
		boolean hay = false;
		for (int i=0; i<list.getLength(); i++){
			org.w3c.dom.Node nodo =  list.item(i);
			if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
	           Element eElement = (Element) nodo;
	           if (eElement.getElementsByTagName("itemFK").item(1).getTextContent().startsWith(tabla+".")){
	        	   hay = true;
	        	   return hay;
	           }
			}
		}
		return hay;
	}
	
	public void cambiarFKRefTB(String viejaTabla, String nuevaTabla){
		ArrayList<String> adentrar = new ArrayList<String>();
		adentrar.add("tabla");
		adentrar.add("constraints");
		adentrar.add("itemFK");
		ArrayList<NodeList> listasNodos = lookupNodeList(null,adentrar, 0);
		for (int x=0; x<listasNodos.size(); x++){
			NodeList list = listasNodos.get(x);
			for (int y=0; y<list.getLength(); y++){
				org.w3c.dom.Node nodo =  list.item(y);
				if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
		           Element eElement = (Element) nodo;
		           if (eElement.getElementsByTagName("referencia").item(0).getTextContent().startsWith(viejaTabla+".")){
		        	   String referencia = eElement.getElementsByTagName("referencia").item(0).getTextContent();
		        	   referencia = referencia.replace(viejaTabla+".", nuevaTabla+".");		
		        	   eElement.getElementsByTagName("referencia").item(0).setTextContent(referencia);
		           }
				}
			}
		}
		createFile();
	}
	
	// Este m�todo agrega las columnas, nombre y tipo de dato, tama�o en caso de char
	public void agregarListaColumnas(String nombreTabla, ArrayList<String> nombres, ArrayList<String> datos){
		// En la metadata de la base de datos buscamos
		Element lista, temp, eTabla = null;
		// Buscamos la tabla en el xml
		NodeList list = rootElement.getElementsByTagName("tabla");
		 
		for (int i = 0; i < list.getLength(); i++) {
			org.w3c.dom.Node nodo =  list.item(i);
			if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
	           Element eElement = (Element) nodo;
	           if (eElement.getElementsByTagName("nombreTabla").item(0).getTextContent().equals(nombreTabla)){
	        	   eTabla = eElement;
	        	   break;
	           }
			}
		}
		
		for (int i=0; i<nombres.size(); i++){
			lista = doc.createElement("columna");
			eTabla.appendChild(lista);
			// Agregamos el nombre
			temp = doc.createElement("nombreColumna");			
			temp.appendChild(doc.createTextNode(nombres.get(i)));
			lista.appendChild(temp);
			// Agregamos el tipo
			temp = doc.createElement("tipoDato");		
			if (datos.get(i).startsWith("char(")){
				String tama�o = datos.get(i).substring(5, datos.get(i).length()-1);
				temp.appendChild(doc.createTextNode("char"));
				lista.appendChild(temp);
				temp = doc.createElement("tama�o");
				temp.appendChild(doc.createTextNode(tama�o));
			}else{
				temp.appendChild(doc.createTextNode(datos.get(i)));
			}
			lista.appendChild(temp);
		}
		createFile();
		
	}
	
	public void agregarConstraint(String nombreTabla, String tipo, String nombreConstraint, ArrayList<String> datos){
		Element lista, temp;
		// Buscamos la tabla en el xml
		NodeList list = rootElement.getElementsByTagName("tabla");
		 
		for (int i = 0; i < list.getLength(); i++) {
			org.w3c.dom.Node nodo =  list.item(i);
			if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
	           Element eElement = (Element) nodo;
	           if (eElement.getElementsByTagName("nombreTabla").item(0).getTextContent().equals(nombreTabla)){
	        	   // Le agrego primary key
	        	   eElement = (Element) eElement.getElementsByTagName("constraints").item(0);	        	   
	        	   Element elementoPK = doc.createElement("primaryKey");	        	   
	        	   // Agregamos primary key
	        	   eElement.appendChild(elementoPK);
	        	   // A esto le agregamos el nombre y las columnas
	        	   Element temporal = doc.createElement("nombrePK");
	        	   temporal.appendChild(doc.createTextNode(nombreConstraint));
	        	   elementoPK.appendChild(temporal);
	        	   for (int j=0; j<datos.size(); j++){
	        		   temporal = doc.createElement("idColumna");
	        		   temporal.appendChild(doc.createTextNode(datos.get(j)));
	        		   elementoPK.appendChild(temporal);
	        	   }
	        	   createFile();
	        	   break;
	           }
			}
		}		
	}
	
	public void agregarConstraint(String nombreTabla, String tipo, String nombreConstraint, ArrayList<String> datos1, ArrayList<String> datos2){
		Element lista, temp;
		// Buscamos la tabla en el xml
		NodeList list = rootElement.getElementsByTagName("tabla");		
		 
		for (int i = 0; i < list.getLength(); i++) {
			org.w3c.dom.Node nodo =  list.item(i);
			if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
	           Element eElement = (Element) nodo;
	           if (eElement.getElementsByTagName("nombreTabla").item(0).getTextContent().equals(nombreTabla)){
	        	   // Le agrego primary key
	        	   eElement = (Element) eElement.getElementsByTagName("constraints").item(0);	        	   
	        	   Element elementoFK = doc.createElement("foreignKey");	        	   
	        	   // Agregamos primary key
	        	   eElement.appendChild(elementoFK);
	        	   // El nombre y la referencia van adentro de itemFK	        	   
	        	   // A esto le agregamos el nombre, las columnas y las referencias
	        	   Element temporal = doc.createElement("nombreFK");
	        	   temporal.appendChild(doc.createTextNode(nombreConstraint));
	        	   elementoFK.appendChild(temporal);
	        	   for (int j=0; j<datos1.size(); j++){
	        		   Element itemFK = doc.createElement("itemFK");
	        		   temporal = doc.createElement("idColumna");
	        		   Element temporal2 = doc.createElement("referencia");
	        		   temporal.appendChild(doc.createTextNode(datos1.get(j)));
	        		   temporal2.appendChild(doc.createTextNode(datos2.get(j)));
	        		   itemFK.appendChild(temporal);
	        		   itemFK.appendChild(temporal2);
	        		   elementoFK.appendChild(itemFK);
	        	   }
	        	   createFile();
	        	   break;
	           }
			}
		}
		
	}
	
	public void agregarConstraint(String nombreTabla, String tipo, String nombreConstraint, String expression){
		Element lista, temp;
		// Buscamos la tabla en el xml
		NodeList list = rootElement.getElementsByTagName("tabla");		
		 
		for (int i = 0; i < list.getLength(); i++) {
			org.w3c.dom.Node nodo =  list.item(i);
			if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
	           Element eElement = (Element) nodo;
	           if (eElement.getElementsByTagName("nombreTabla").item(0).getTextContent().equals(nombreTabla)){
	        	   // Le agrego primary key
	        	   eElement = (Element) eElement.getElementsByTagName("constraints").item(0);	        	   
	        	   Element elementoCK = doc.createElement(tipo);	        	   
	        	   // Agregamos primary key
	        	   eElement.appendChild(elementoCK);
	        	   // El nombre y la referencia van adentro de itemFK	        	   
	        	   // A esto le agregamos el nombre, las columnas y las referencias
	        	   Element temporal = doc.createElement("nombreCheck");
	        	   temporal.appendChild(doc.createTextNode(nombreConstraint));
	        	   elementoCK.appendChild(temporal);
	        	   temporal = doc.createElement("expresion");
	        	   temporal.appendChild(doc.createTextNode(expression));
	        	   elementoCK.appendChild(temporal);
	        	   createFile();
	        	   break;
	           }
			}
		}
	}
	
	public Element elementoPorNombre(String tipo, String nombreCoso, String nombre){
		Element eTabla = null;
		NodeList list = rootElement.getElementsByTagName(tipo);
		 
		for (int i = 0; i < list.getLength(); i++) {
			org.w3c.dom.Node nodo =  list.item(i);
			if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
	           Element eElement = (Element) nodo;
	           if (eElement.getElementsByTagName(nombreCoso).item(0).getTextContent().equals(nombre)){
	        	   eTabla = eElement;
	        	   return eTabla;
	           }
			}
		}
		return eTabla;
	}
	
	// Funcion que busa un nodo que hasta el ultimo elemento de adentrar cumpla con que atributo tiene el valor de dato
	public org.w3c.dom.Node buscarNodo(ArrayList<String> adentrar, String atributo, String dato){
		ArrayList<NodeList> nodos = lookupNodeList(null, adentrar, 0);
		org.w3c.dom.Node node = null;
		for (int i=0; i<nodos.size(); i++){
			NodeList nodosActual = nodos.get(i);
			for (int j=0; j<nodosActual.getLength(); j++){
				node =  nodosActual.item(j);
				if (node.getNodeType() == Node.ELEMENT_NODE) {	           
		           Element eElement = (Element) node;
		           if (dato.equals(eElement.getElementsByTagName(atributo).item(0).getTextContent())){
		        	   return  node;
		           }		           
				}
			}
		}
		return node;
	}
	
	// Para ver si en una tabla existe la columna
	public boolean existeCol(String nombreTabla, String nombreCol){
		boolean existe = false;
		NodeList list = rootElement.getElementsByTagName("tabla");
		 
		for (int i = 0; i < list.getLength(); i++) {
			org.w3c.dom.Node nodo =  list.item(i);
			if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
	           Element eElement = (Element) nodo;
	           if (nombreTabla.equals(eElement.getElementsByTagName("nombreTabla").item(0).getTextContent())){
	        	   NodeList listInterna = eElement.getElementsByTagName("columna");
	        	   for (int j = 0; j<listInterna.getLength(); j++){
	        		   org.w3c.dom.Node nodoInterno =  listInterna.item(j);
	        		   Element eElementInterno = (Element) nodoInterno;
	        		   if (nombreCol.equals(eElementInterno.getElementsByTagName("nombreColumna").item(0).getTextContent())){
	        			   return true;
	        		   }
	        	   }
	        	   
	           }
			}
		}
		return existe;
	}
	
	public String tipoCol(String nombreTabla, String nombreCol){
		String tipo="None";
		NodeList list = rootElement.getElementsByTagName("tabla");
		for (int i = 0; i < list.getLength(); i++) {
			org.w3c.dom.Node nodo =  list.item(i);
			if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
	           Element eElement = (Element) nodo;
	           if (nombreTabla.equals(eElement.getElementsByTagName("nombreTabla").item(0).getTextContent())){
	        	   NodeList listInterna = eElement.getElementsByTagName("columna");
	        	   for (int j = 0; j<listInterna.getLength(); j++){
	        		   org.w3c.dom.Node nodoInterno =  listInterna.item(j);
	        		   Element eElementInterno = (Element) nodoInterno;
	        		   if (nombreCol.equals(eElementInterno.getElementsByTagName("nombreColumna").item(0).getTextContent())){
	        			   tipo=eElementInterno.getElementsByTagName("tipoDato").item(0).getTextContent();
	        			   if(tipo.equals("char")){
	        				   tipo+="("+eElementInterno.getElementsByTagName("tama�o").item(0).getTextContent()+")";
	        			   }
	        			   return tipo;
	        		   }
	        	   }
	        	   
	           }
			}
		}
		return "None";
	}
	
	// Funcion que obtiene la lista de nodos de algo adentro del archivo XML
	public ArrayList<NodeList> lookupNodeList(ArrayList<NodeList> llevo, ArrayList<String> adentrar, int indice){
		ArrayList<NodeList> devolverNodeList = new ArrayList<NodeList>();
		if (indice==0){
			devolverNodeList.add(rootElement.getElementsByTagName(adentrar.get(0)));
			return lookupNodeList(devolverNodeList, adentrar, indice+1);
		}else if (indice<adentrar.size()){	
			for (int j=0; j<llevo.size(); j++){
				NodeList list = llevo.get(j);
				for (int i = 0; i < list.getLength(); i++) {			
					org.w3c.dom.Node nodo =  list.item(i);						
					if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
			           Element eElement = (Element) nodo;			           
			           NodeList tempList = eElement.getElementsByTagName(adentrar.get(indice));
			           devolverNodeList.add(tempList);
					}
				}
			}
			indice++;
			return lookupNodeList(devolverNodeList, adentrar, indice);
		}else{
			return llevo;
		}		
	}
	
	// Metodo que borra un nodo del XML
	// Revisa que el atributo, sea igualar y si lo es borra el nodo
	public void eliminarNodo(ArrayList<String> adentrar, String atributo, String igualar){		
		ArrayList<NodeList> listasNodos = lookupNodeList(null, adentrar, 0);
		for (int x=0; x<listasNodos.size(); x++){
			NodeList list = listasNodos.get(x);
			for (int i = 0; i < list.getLength(); i++) {			
				org.w3c.dom.Node nodo =  list.item(i);						
				if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
		           Element eElement = (Element) nodo;	
		           if (igualar.equals(eElement.getElementsByTagName(atributo).item(0).getTextContent())){		        	   
		        	   nodo.getParentNode().removeChild(nodo);
		        	   createFile();
		        	   break;
		           }
				}
			}
		}
	}
	
	// Metodo que borra un nodo del XML
	// Revisa que el atributo, sea igualar y si lo es borra el nodo
	public void eliminarNodo(NodeList list, String atributo, String igualar){
		for (int i = 0; i < list.getLength(); i++) {			
			org.w3c.dom.Node nodo =  list.item(i);						
			if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
	           Element eElement = (Element) nodo;	
	           if (igualar.equals(eElement.getElementsByTagName(atributo).item(0).getTextContent())){	
	        	   nodo.getParentNode().removeChild(nodo);
	        	   createFile();
	        	   break;
	           }
			}
		}
	}
	
	public boolean revFKRefTB(String nombreTabla){
		ArrayList<String> adentrar = new ArrayList<String>();
		adentrar.add("tabla");
		adentrar.add("constraints");
		adentrar.add("itemFK");
		ArrayList<NodeList> listasNodos = lookupNodeList(null,adentrar, 0);
		for (int x=0; x<listasNodos.size(); x++){
			NodeList list = listasNodos.get(x);
			for (int y=0; y<list.getLength(); y++){
				org.w3c.dom.Node nodo =  list.item(y);
				if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
		           Element eElement = (Element) nodo;
		           if (eElement.getElementsByTagName("referencia").item(0).getTextContent().startsWith(nombreTabla+".")){
		        	   return true;
		           }
				}
			}
		}
		return false;
	}
	
	public boolean revConstraintCol(String nombreTabla, String nombreCol){
		NodeList listaNodos = rootElement.getElementsByTagName("tabla");
		for (int x=0; x<listaNodos.getLength(); x++){
			org.w3c.dom.Node nodoTabla =  listaNodos.item(x);
			if (nodoTabla.getNodeType() == Node.ELEMENT_NODE){
				Element tElement = (Element) nodoTabla;
				NodeList list = tElement.getElementsByTagName("constraints");
				
				for (int y=0; y<list.getLength(); y++){
					org.w3c.dom.Node nodo =  list.item(y);
					if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
			           Element eElement = (Element) nodo;
			           if (nombreTabla.equals(tElement.getElementsByTagName("nombreTabla").item(0).getTextContent())){
				           // Para primary keys de la misma tabla
			        	   NodeList listPK = eElement.getElementsByTagName("primaryKey");
				           for (int z=0; z<listPK.getLength(); z++){
				        	   org.w3c.dom.Node nodoPK =  listPK.item(z);
								if (nodoPK.getNodeType() == Node.ELEMENT_NODE) {	           
						           Element eElementPK = (Element) nodoPK;
					        	   if (eElementPK.getElementsByTagName("idColumna").item(0).getTextContent().equals(nombreCol)){
						        	   return true;
						           }
								}
				           }
				           // Para foreign keys de la misma tabla
				           NodeList listFK = eElement.getElementsByTagName("foreignKey");
				           for (int z=0; z<listFK.getLength(); z++){
				        	   org.w3c.dom.Node nodoFK =  listFK.item(z);
								if (nodoFK.getNodeType() == Node.ELEMENT_NODE) {	           
						           Element eElementFK = (Element) nodoFK;
					        	   NodeList listFKInterna = eElementFK.getElementsByTagName("itemFK");
					        	   for (int w=0; w<listFKInterna.getLength(); w++){
					        		   org.w3c.dom.Node nodoFKInterno =  listFKInterna.item(w);
										if (nodoFKInterno.getNodeType() == Node.ELEMENT_NODE) {	           
								           Element eElementFKInterno = (Element) nodoFKInterno;
								           if (eElementFKInterno.getElementsByTagName("idColumna").item(0).getTextContent().equals(nombreCol)){
								        	   return true;
								           }
										}
					        	   }
								}
				           }
						}else{
							// Foreign key pero como referencia 
							NodeList listFK = eElement.getElementsByTagName("foreignKey");
				           for (int z=0; z<listFK.getLength(); z++){
				        	   org.w3c.dom.Node nodoFK =  listFK.item(z);
								if (nodoFK.getNodeType() == Node.ELEMENT_NODE) {	           
						           Element eElementFK = (Element) nodoFK;
					        	   NodeList listFKInterna = eElementFK.getElementsByTagName("itemFK");
					        	   for (int w=0; w<listFKInterna.getLength(); w++){
					        		   org.w3c.dom.Node nodoFKInterno =  listFKInterna.item(w);
										if (nodoFKInterno.getNodeType() == Node.ELEMENT_NODE) {	           
								           Element eElementFKInterno = (Element) nodoFKInterno;
								           if (eElementFKInterno.getElementsByTagName("referencia").item(0).getTextContent().equals(nombreTabla+"."+nombreCol)){
								        	   return true;
								           }
										}
					        	   }
								}
				           }
						}
			           
			          
			           // Para check		           
					}
				}
			}
		}
		return false;
	}
	
	public ArrayList<String> listarColumnas(String tabla){
		ArrayList<String> columnas = new ArrayList<String> ();
		ArrayList<String> adentrar = new ArrayList<String>();
		adentrar.add("tabla");
		ArrayList<NodeList> listasNodos = lookupNodeList(null,adentrar, 0);
		for (int x=0; x<listasNodos.size(); x++){
			NodeList list = listasNodos.get(x);
			for (int y=0; y<list.getLength(); y++){
				org.w3c.dom.Node nodo =  list.item(y);
				if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
		           Element eElement = (Element) nodo;
		           if (eElement.getElementsByTagName("nombreTabla").item(0).getTextContent().startsWith(tabla)){
		        	   NodeList listaColumnas = eElement.getElementsByTagName("columna");
		        	   for (int z=0; z<listaColumnas.getLength(); z++){
		        		   org.w3c.dom.Node nodoCol =  listaColumnas.item(z);
		        		   if (nodo.getNodeType() == Node.ELEMENT_NODE) {
		        			   Element eElementCol = (Element) nodoCol;
		        			   columnas.add(eElementCol.getElementsByTagName("nombreColumna").item(0).getTextContent());
		        		   }		    		           
		        	   }
		           }
				}
			}
		}
		return columnas;
	}
	
	public boolean eliminarConstraint(String nombreTabla, String idC){
		NodeList listaNodos = rootElement.getElementsByTagName("tabla");
		for (int x=0; x<listaNodos.getLength(); x++){
			org.w3c.dom.Node nodoTabla =  listaNodos.item(x);
			if (nodoTabla.getNodeType() == Node.ELEMENT_NODE){
				Element tElement = (Element) nodoTabla;
				NodeList list = tElement.getElementsByTagName("constraints");				
				for (int y=0; y<list.getLength(); y++){
					org.w3c.dom.Node nodo =  list.item(y);
					if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
			           Element eElement = (Element) nodo;
			           if (nombreTabla.equals(tElement.getElementsByTagName("nombreTabla").item(0).getTextContent())){
				           // Para primary keys de la misma tabla
			        	   NodeList listPK = eElement.getElementsByTagName("primaryKey");
				           for (int z=0; z<listPK.getLength(); z++){
				        	   org.w3c.dom.Node nodoPK =  listPK.item(z);
								if (nodoPK.getNodeType() == Node.ELEMENT_NODE) {	           
						           Element eElementPK = (Element) nodoPK;
					        	   if (eElementPK.getElementsByTagName("nombrePK").item(0).getTextContent().equals(idC)){
						        	   eliminarNodo(listPK, "nombrePK", idC);
					        		   return true;
						           }
								}
				           }
				           // Para foreign keys de la misma tabla
				           NodeList listFK = eElement.getElementsByTagName("foreignKey");
				           for (int z=0; z<listFK.getLength(); z++){
				        	   org.w3c.dom.Node nodoFK =  listFK.item(z);
								if (nodoFK.getNodeType() == Node.ELEMENT_NODE) {	           
						           Element eElementFK = (Element) nodoFK;
						           if (eElementFK.getElementsByTagName("nombreFK").item(0).getTextContent().equals(idC)){
						        	   eliminarNodo(listFK, "nombreFK", idC);
					        		   return true;
						           }
								}
				           }
						}
					}
				}
			}
		}
		return false;
	}

	public void cambiarNombre(String nuevo){
		NodeList nodes = doc.getElementsByTagName(nombre);
		for (int i = 0; i < nodes.getLength(); i++) {
			doc.renameNode(nodes.item(i), null, nuevo);
		}
		createFile();
		pathReal = path+"\\"+nuevo+".XML";
		archivo.renameTo(new File(pathReal));
	}
	
	public ArrayList<String> showDatabases(){
		NodeList list = rootElement.getElementsByTagName("BaseDeDatos");
		ArrayList<String> databases = new ArrayList<String>();
		for (int i = 0; i < list.getLength(); i++) {
			org.w3c.dom.Node nodo =  list.item(i);
			if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
	           Element eElement = (Element) nodo;
	           databases.add(eElement.getElementsByTagName("nombre").item(0).getTextContent());
			}
		}
		return databases;
	}
	
}
