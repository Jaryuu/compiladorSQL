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
	
	public void cambiarColumna(String cambiar, String nuevo, String viejo){
		NodeList list = rootElement.getElementsByTagName("BaseDeDatos");
		 
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
	
	public void cambiarNombre(String nuevo){
		NodeList nodes = doc.getElementsByTagName(nombre);
		for (int i = 0; i < nodes.getLength(); i++) {
			doc.renameNode(nodes.item(i), null, nuevo);
		}
		createFile();
		pathReal = path+"\\"+nuevo+".XML";
		archivo.renameTo(new File(pathReal));
	}
}
