import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import javax.xml.soap.Node;

import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

import java.io.File;
import java.nio.file.Files;



public class DBVisitor extends SQLBaseVisitor<String>{
	
	private ArrayList<String> mensajes, columnas, datos, tablaCols, listaConstraints;
	private XMLFile archivoXML;
	private String pathBase;
	private String nombreBD = "", showNombre, nombreTabla;
	private boolean exitoCarpeta;
	String contenido;	
	ArrayList<ArrayList<String>> data;
	
	public ArrayList<String> getColumnas() {
		return columnas;
	}

	public void setColumnas(ArrayList<String> columnas) {
		this.columnas = columnas;
	}

	public ArrayList<ArrayList<String>> getData() {
		return data;
	}

	public void setData(ArrayList<ArrayList<String>> data) {
		this.data = data;
	}

	public ArrayList<String> getMensajes() {
		return mensajes;
	}

	public void setMensajes(ArrayList<String> mensajes) {
		this.mensajes = mensajes;
	}
	
	public String getNombreBD() {
		return nombreBD;
	}

	public void setNombreBD(String nombreBD) {
		this.nombreBD = nombreBD;
	}
	
	public String getShowNombre() {
		return showNombre;
	}

	public void setShowNombre(String showNombre) {
		this.showNombre = showNombre;
	}

	public String visitTodo(SQLParser.TodoContext ctx){
		// Se crean los atributos
		showNombre = "";
		mensajes = new ArrayList<String>();
		columnas = new ArrayList<String>();
		datos = new ArrayList<String>();
		data = new ArrayList<ArrayList<String>>();
		boolean success = crearCarpeta("BaseDeDatos");
		pathBase = "BaseDeDatos\\";		
		if (!success) {
		    System.out.println("Ya existe la carpeta");
		    archivoXML = new XMLFile("MetadataBaseDeDatos", pathBase);
		}else{
			archivoXML = new XMLFile("MetadataBaseDeDatos", pathBase);
		}
		
		return super.visitTodo(ctx);
		
	}
	
	public String visitCreateDB(SQLParser.CreateDBContext ctx){
		String nuevaBD = ctx.ID().getText();		
		exitoCarpeta = crearCarpeta(pathBase+nuevaBD);
		archivoXML = new XMLFile("Metadata."+nuevaBD, pathBase+"\\"+nuevaBD+"\\");
		// Si se crea la carpeta es que no existe la base de datos
		if (exitoCarpeta){
			// Se agrega a la metadata
			archivoXML = new XMLFile("MetadataBaseDeDatos", pathBase);
			columnas.clear();
			columnas.add("nombre");
			columnas.add("cantidadTablas");
			datos.clear();
			datos.add(nuevaBD);
			datos.add("0");
			archivoXML.add("BaseDeDatos", columnas, datos);
		}else{
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Ya existe la base de datos <"+nuevaBD+">");
			return "_error_";
		}
		return "";
	}
	
	public String visitDropDB(SQLParser.DropDBContext ctx){
		String borrarBD = ctx.ID().getText();
		File folder = new File(pathBase+"\\"+borrarBD);
		if (folder.exists()){
			deleteFolder(folder);
			borrarBD(borrarBD);
		}else{		
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No existe la base de datos <"+borrarBD+">");
			return "_error_";
		}		
		return "";
	}
	
	
	
	public String visitAlterDB(SQLParser.AlterDBContext ctx){
		String nombreViejo = ctx.ID(0).getText();
		String nuevoNombre = ctx.ID(1).getText();
		// Se cambia el nombre en la metadata, el nombre de la carpeta y en su archivo JSON interno				
		File f = new File(pathBase+"\\"+nombreViejo);
		File f2 = new File(pathBase+"\\"+nuevoNombre);
		if (f2.exists()){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"La base de datos <"+nuevoNombre+"> ya existe");
			return "_error_";
		}else if (! f.exists()){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No existe la base de datos <"+nombreViejo+">");
			return "_error_";
		}else{
			// Se cambia el nombre en la metadata			
			archivoXML = new XMLFile("metadataBaseDeDatos", pathBase);
			cambiarNombreBD(nuevoNombre,nombreViejo);
			// cambiamos el nombre de la carpeta			
			f.renameTo(new File(pathBase+"\\"+nuevoNombre));
			// Cambiamos el JSON interno
			archivoXML = new XMLFile("Metadata."+nombreViejo, pathBase+"\\"+nuevoNombre+"\\");
			archivoXML.cambiarNombre("Metadata."+nuevoNombre);
		}
		
		return "";
	}
	
	
	
	
	@Override
	public String visitShowDB(SQLParser.ShowDBContext ctx) {
		archivoXML = new XMLFile("MetadataBaseDeDatos", pathBase);
		ArrayList<String> databases = archivoXML.showDatabases();
		columnas.clear();
		columnas.add("Database Name");		
		data.clear();
		for(int i=0;i<databases.size();i++){
			ArrayList<String> tupla = new ArrayList<String>();
			tupla.add(databases.get(i));
			data.add(tupla);
		}
		showNombre = "Databases";
		return "";
	}

	@Override
	public String visitUseDB(SQLParser.UseDBContext ctx) {
		nombreBD = ctx.ID().getText();
		File folder = new File(pathBase+"\\"+nombreBD);
		if (!folder.exists()){
			nombreBD = "";
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No existe la base de datos <"+nombreBD+">");
			return "_error_";
		}		
		return "";
	}
	
	public String visitShowTB(SQLParser.ShowTBContext ctx) {
		data.clear();
		columnas.clear();
		datos.clear();
		if(nombreBD.equals("")){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No se ha especificado una base de datos a utilizar");
			return "_error_";
		}
		else{		
			showNombre = nombreBD+": Tables";
			columnas.add("NombreTabla");
			columnas.add("CantRegistros");
			archivoXML = new XMLFile("Metadata."+nombreBD, pathBase+"\\"+nombreBD+"\\");
			NodeList list = archivoXML.getRootElement().getElementsByTagName("tabla");
			org.w3c.dom.Node nodo;
			ArrayList<String> nuevoDato;
			for (int i = 0; i < list.getLength(); i++) {
				nodo =  list.item(i);
				if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
					Element eElement = (Element) nodo;
					datos.add(eElement.getElementsByTagName("nombreTabla").item(0).getTextContent());
					datos.add(eElement.getElementsByTagName("cantidadRegistros").item(0).getTextContent());
					
					//Por que no solo agregar datos a data? because f u that's why (y porque data se vacia)
					ArrayList<String> datosCopia = new ArrayList<String>();
					for (int j=0;j<datos.size();j++){
						datosCopia.add(datos.get(j));
					}
					data.add(datosCopia);
					
					datos.clear();
				}
			}
			
		}
		return "";
	}
	
	public String visitCreateTB(SQLParser.CreateTBContext ctx){
		data.clear();
		columnas.clear();
		datos.clear();
		if(nombreBD.equals("")){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No se ha especificado una base de datos a utilizar");
			return "_error_";
		}
		else{	
			nombreTabla = ctx.ID(0).getText();
			String pathCarpeta = pathBase+"\\"+nombreBD;
			// Revisamos si ya existe la tabla, revisando si existe el XML de la tabla
			File arch = new File(pathCarpeta+"\\"+nombreTabla+".XML");
			if (arch.exists()){
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"La tabla <"+nombreTabla+"> ya existe en <"+nombreBD+">");
				return "_error_";
			}
			// Modificamos la metadata principal, agregando uno a la cantidad de tablas
			archivoXML = new XMLFile("MetadataBaseDeDatos", pathBase);
			NodeList list = archivoXML.getRootElement().getElementsByTagName("BaseDeDatos");			
			int cantidadTablas;
			for (int i = 0; i < list.getLength(); i++) {
				org.w3c.dom.Node nodo =  list.item(i);
				if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
		           Element eElement = (Element) nodo;
		           if (eElement.getElementsByTagName("nombre").item(0).getTextContent().equals(nombreBD)){
		        	   cantidadTablas = Integer.parseInt(eElement.getElementsByTagName("cantidadTablas").item(0).getTextContent())+1;
		        	   eElement.getElementsByTagName("cantidadTablas").item(0).setTextContent(""+cantidadTablas);		        	   
		           }
				}
			}
			archivoXML.createFile();
			
			// Modificamos la metadata dentro de esta base de datos
			archivoXML = new XMLFile("Metadata."+nombreBD, pathCarpeta);
			// Primero agregamos el nombre y su cantidad de registros que empieza en 0
			columnas.add("nombreTabla");
			columnas.add("cantidadRegistros");
			datos.add(nombreTabla);
			datos.add("0");
			archivoXML.add("tabla", columnas, datos);		
			
			// Ahora agregamos columnas y sus tipos a la metadata de la tabla
			// Listamos los nombres y los tipos de las columnas, a partir de id1 revisamos todos
			ArrayList<String> nombres = new ArrayList();
			ArrayList<String> tipoDato = new ArrayList();
			for (int x=1; x<ctx.ID().size(); x++){
				String idActual = ctx.ID(x).getText();
				nombres.add(idActual);
				// Visitamos el tipo
				String tipoActual = visit(ctx.tipo(x-1));
				tipoDato.add(tipoActual);
			}		
			datos.clear();
			// Para poder tener los nombres en una lista visible para todos los metodos
			datos = nombres;			
			archivoXML.agregarListaColumnas(nombreTabla, nombres, tipoDato);
			
			// Agregamos la tag de constraints
			archivoXML.addTagConstraint(nombreTabla);	
			
			// Visitamos lo demas
			visit(ctx.constraints());
			
			// Creamos el archivo XML para esta tabla
			archivoXML = new XMLFile(nombreTabla, pathCarpeta);			
		}
		return "";
	}
	
	// En datos vienen los ids de las columnas
	// En archivoXML esta la metadata de la base de datos en uso
	public String visitConstraints(SQLParser.ConstraintsContext ctx){	
		// hacemos un arraylist con los nombres de las constraints
		listaConstraints = archivoXML.listarConstraintsTabla(nombreTabla);
		// En nombre tabla llevamos el nombre de la tabla y nombreBD llevamos el nombre de la base de datos
		for (int y=0; y<ctx.constraint().size(); y++){
			visit(ctx.constraint(y));
		}
		return "";
	}
	
	// En datos vienen los ids de las columnas
	public String visitCPK(SQLParser.CPKContext ctx){
		ArrayList<String> ids = new ArrayList();
		String nombreC = ctx.ID(0).getText();
		if (listaConstraints.contains(nombreC)){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Ya existe la constraint <"+nombreC+">");
			return "_error_";
		}
		for (int y=1; y<ctx.ID().size();y++){
			// Revisamos que existan todos los ids ya en la tabla, a traves de datos
			if (! datos.contains(ctx.ID(y).getText())){
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"La tabla <"+nombreTabla+"> no tiene la columna <"+ctx.ID(y).getText()+">");
				return "_error_";
			}
			ids.add(ctx.ID(y).getText());
		}
		listaConstraints.add(nombreC);
		// Los agregamos al constraints
		archivoXML.agregarConstraint(nombreTabla, "primaryKey", nombreC, ids);
		return "";
	}
	
	// En datos vienen los ids de las columnas
	public String visitCFK(SQLParser.CFKContext ctx){
		// Se revisa si se tiene la mista cantidad de ids referencias, ids
		if (ctx.ID().size() != ctx.references().ID().size()){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No se tiene la misma cantidad de ids de las columnas de la tabla y de las referencias");
			return "_error_";
		}
		ArrayList<String> colIds = new ArrayList();
		String nombreC = ctx.ID(0).getText();
		// Revisamos que no exista una constraint con el mismo nombre
		if (listaConstraints.contains(nombreC)){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Ya existe la constraint <"+nombreC+">");
			return "_error_";
		}
		
		for (int y=1; y<ctx.ID().size();y++){
			// Revisamos que existan las columnas
			if (! datos.contains(ctx.ID(y).getText())){
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"La tabla <"+nombreTabla+"> no tiene la columna <"+ctx.ID(y).getText()+">");
				return "_error_";
			}
			colIds.add(ctx.ID(y).getText());
		}
		ArrayList<String> referencias = new ArrayList();
		String idTablaRef = ctx.references().ID(0).getText();
		// Revisamos que exista la tabla en esta base de datos
		File existe = new File(pathBase+"\\"+nombreBD+"\\"+idTablaRef+".XML");
		if (! existe.exists()){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No existe la tabla <"+idTablaRef+">");
			return "_error_";
		}
		
		for (int y=1; y<ctx.references().ID().size();y++){
			String idAct = ctx.references().ID(y).getText();
			if (! archivoXML.existeCol(idTablaRef, idAct)){
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No existe la columna <"+idAct+"> en tabla <"+idTablaRef+">");
				return "_error_";
			}
			else{
				if(!archivoXML.tipoCol(idTablaRef,idAct).equals(archivoXML.tipoCol(nombreTabla,colIds.get(y-1)))){
					if (archivoXML.tipoCol(idTablaRef,idAct).startsWith("char")){
						mensajes.add("la columna <"+idAct+"> en tabla <"+idTablaRef+"> no tiene el mismo tamaño de char que la columna <"+colIds.get(y-1)+">");
						return "_error_";	
					}
					else{
						mensajes.add("la columna <"+idAct+"> en tabla <"+idTablaRef+"> no tiene el mismo tipo que la columna <"+colIds.get(y-1)+">");
						return "_error_";	
					}
				}
			}
			referencias.add(idTablaRef+"."+idAct);
		}
		listaConstraints.add(nombreC);
		// Los agregamos al constraints
		archivoXML.agregarConstraint(nombreTabla, "foreignKey", nombreC, colIds, referencias);		
		return "";
	}
	
	public String visitCCheck(SQLParser.CCheckContext ctx){
		// Esto se va a guardar check-nombreCheck-stringCheck
		if (visit(ctx.exp()).equals("_error_")){			
			return "__error__";
		}		
		String stringCheck = ctx.exp().getText();
		String nombre = ctx.ID().getText();
		if (listaConstraints.contains(nombre)){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Ya existe la constraint <"+nombre+">");
			return "_error_";
		}else{
			listaConstraints.add(nombre);
		}
		archivoXML.agregarConstraint(nombreTabla, "check", nombre, stringCheck);
		return "";
	}
	
	public String visitExp(SQLParser.ExpContext ctx){
		return "";
	}
	
	public String visitReferences(SQLParser.ReferencesContext ctx){
		return super.visitReferences(ctx);
	}
	
	public String visitTipoFloat(SQLParser.TipoFloatContext ctx) {
		return "float";
	}

	
	public String visitTipoInt(SQLParser.TipoIntContext ctx) {
		return "int";
	}

	public String visitTipoDate(SQLParser.TipoDateContext ctx) {
		return "date";
	}

	public String visitTipoChar(SQLParser.TipoCharContext ctx) {
		return "char("+ctx.NUM().getText()+")";
	}
	
	public String visitRenameTB(SQLParser.RenameTBContext ctx){
		// Ya se eligio la base de datos
		if(nombreBD.equals("")){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No se ha especificado una base de datos a utilizar");
			return "_error_";
		}
		else{
			String idTabla = ctx.ID(0).getText();
			String nuevoNombre = ctx.ID(1).getText();
			String pathCarpeta = pathBase+"\\"+nombreBD;
			// Revisamos que exista la tabla
			File f = new File(pathCarpeta+"\\"+idTabla+".XML");
			if (! f.exists()){
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No existe la tabla <"+idTabla+">");
				return "_error_";
			}
			// Cambiamos el nombre del archivo de la tabla
			archivoXML = new XMLFile(idTabla, pathCarpeta);
			archivoXML.cambiarNombre(nuevoNombre);
			// Cambiamos el nombre en la metadata de la base de datos
			archivoXML = new XMLFile("Metadata."+nombreBD, pathCarpeta);
			archivoXML.cambiarColumna("nombreTabla", nuevoNombre, idTabla, "tabla");
			// Cambiamos el nombre en todos los constraints donde se hace referencia a la tabla			
			archivoXML.cambiarFKRefTB(idTabla, nuevoNombre);
		}
		return "";
	}
	
	public String visitDropTB(SQLParser.DropTBContext ctx){
		if(nombreBD.equals("")){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No se ha especificado una base de datos a utilizar");
			return "_error_";
		}
		nombreTabla = ctx.ID().getText();
		String pathCarpeta = pathBase+"\\"+nombreBD;
		// Revisamos que exista la tabla
		File tempF = new File(pathCarpeta+"\\"+nombreTabla+".XML");
		if (! tempF.exists()){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "No existe la tabla <"+nombreTabla+">");
			return "_error_";
		}		
		// Revisamos que no se menciona en alguna fk
		archivoXML = new XMLFile("Metadata."+nombreBD, pathCarpeta);
		if (archivoXML.revFKRefTB(nombreTabla)){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Se hace referencia de <"+nombreTabla+"> en alguna constraint");
			return "_error_";
		}
		// Una vez revisamos que no se haga referencia a esa tabla se borra de la metadata	
		ArrayList<String> adentrar = new ArrayList<String> ();
		adentrar.add("tabla");
		archivoXML.eliminarNodo(adentrar, "nombreTabla", nombreTabla);
		// Se borra el archivo de la tabla
		if (tempF.exists()){
			tempF.delete();
		}		
		return "";
	}
	
	public String visitAlterTB(SQLParser.AlterTBContext ctx){
		// Ya se eligio base de datos a usar
		if(nombreBD.equals("")){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No se ha especificado una base de datos a utilizar");
			return "_error_";
		}else{
			nombreTabla = ctx.ID().getText();
			String pathCarpeta = pathBase +"\\"+nombreBD;
			File f = new File(pathCarpeta+"\\"+nombreTabla+".XML");
			// existe la tabla
			if (! f.exists()){
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "No existe la tabla <"+nombreTabla+">");
				return "_error_";
			}	
			archivoXML = new XMLFile("Metadata."+nombreBD, pathCarpeta);
			// Visitamos table action
			for (int i=0; i<ctx.tableAction().size(); i++){
				visit(ctx.tableAction(i));
			}
			return "";
		}			
	}
	
	public String visitAddColumnTB(SQLParser.AddColumnTBContext ctx){
		String nombreColumna = ctx.ID().getText();
		// Obtenemos todas las columnas de esa tabla
		tablaCols = archivoXML.listarColumnas(nombreTabla);
		if (tablaCols.contains(nombreColumna)){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Ya existe la columna <"+nombreColumna+">");
			return "_error_";
		}		
		tablaCols.add(ctx.ID().getText());
		datos.clear();
		datos = tablaCols;
		ArrayList<String> informacion = new ArrayList<String>();
		ArrayList<String> tipoDato = new ArrayList<String>();
		informacion.add(nombreColumna);
		String tipoActual = visit(ctx.tipo());	
		tipoDato.add(tipoActual);
		archivoXML.agregarListaColumnas(nombreTabla, informacion, tipoDato);
		// Visitamos las constraints
		visit(ctx.constraints());
		return "";
	}
	
	public String visitAddConstraintTB(SQLParser.AddConstraintTBContext ctx){
		// Obtenemos todas las columnas de esa tabla
		tablaCols = archivoXML.listarColumnas(nombreTabla);
		datos.clear();
		datos = tablaCols;
		// Listamos las constraints
		listaConstraints = archivoXML.listarConstraintsTabla(nombreTabla);
		visit(ctx.constraint());
		return "";
	}
	
	public String visitDropColumnTB(SQLParser.DropColumnTBContext ctx){
		String nombreColumna = ctx.ID().getText();
		// Revisamos que exista la columna
		if (! archivoXML.listarColumnas(nombreTabla).contains(nombreColumna)){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "La columna <"+nombreColumna+"> no existe en la tabla <"+nombreTabla+">");			
			return "_error_";
		}
		if (archivoXML.revConstraintCol(nombreTabla, nombreColumna)){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "La columna <"+nombreColumna+"> se usa de referencia en una constraint de la base de datos");			
			return "_error_";
		}
		// Una vez revisamos que no se haga referencia a esa tabla se borra de la metadata	
		ArrayList<String> adentrar = new ArrayList<String> ();		
		adentrar.add("tabla");
		Element tElement = (Element)  archivoXML.buscarNodo(adentrar, "nombreTabla", nombreTabla);
		archivoXML.eliminarNodo(tElement.getElementsByTagName("columna"), "nombreColumna", nombreColumna);
		return "";
	}
	
	public String visitDropConstraintTB(SQLParser.DropConstraintTBContext ctx){
		String idC = ctx.ID().getText();
		if (! archivoXML.eliminarConstraint(nombreTabla, idC)){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "La constraint <"+idC+"> no existe en la tabla <"+nombreTabla+">");			
			return "_error_";
		}
		return "";
	}
	
	public String visitShowColums(SQLParser.ShowColumsContext ctx){
		String pathCarpeta = pathBase+"\\"+nombreBD;
		archivoXML = new XMLFile("Metadata."+nombreBD, pathCarpeta);
		nombreTabla = ctx.ID().getText();
		columnas.clear();
		data.clear();
		columnas.add("nombreColumna");
		columnas.add("tipoDato");
		columnas.add("primaryKey");
		columnas.add("foreignKey");
		columnas.add("referenciaFK");
		columnas.add("check");
		columnas.add("expresion");
		tablaCols = archivoXML.listarColumnas(nombreTabla);
		ArrayList<ArrayList<String>> listaConstraintsPK = archivoXML.listarConstraintsEspecificosTabla(nombreTabla,"primaryKey");
		ArrayList<ArrayList<String>> listaConstraintsFK = archivoXML.listarConstraintsEspecificosTabla(nombreTabla,"foreignKey");
		ArrayList<ArrayList<String>> listaConstraintsCHK = archivoXML.listarConstraintsEspecificosTabla(nombreTabla,"check");
		//Agregar data
		for (int i=0;i<tablaCols.size();i++){
			//Agregar PK si es
			ArrayList<String> tupla = new ArrayList<String>();
			String tipoDato = archivoXML.tipoCol(nombreTabla,tablaCols.get(i));
			String PK="";
			String FK="";
			String FKref="";
			String check="";
			String expresion="";
			//Primary keys
			for (int j=0;j<listaConstraintsPK.get(1).size();j++){
				if(tablaCols.get(i).equals(listaConstraintsPK.get(1).get(j))){
					PK = listaConstraintsPK.get(0).get(j);
				}
			}
			//Foreign Keys
			for (int j=0;j<listaConstraintsFK.get(1).size();j++){
				if(tablaCols.get(i).equals(listaConstraintsFK.get(1).get(j))){
					FK = listaConstraintsFK.get(0).get(j);
					FKref = listaConstraintsFK.get(2).get(j);
				}
			}
			//Check
			for (int j=0;j<listaConstraintsCHK.get(1).size();j++){
				if(listaConstraintsCHK.get(1).get(j).contains(tablaCols.get(i))){
					check = listaConstraintsCHK.get(0).get(j);
					expresion = listaConstraintsCHK.get(1).get(j);
				}
			}
			tupla.add(tablaCols.get(i));
			tupla.add(tipoDato);
			tupla.add(PK);
			tupla.add(FK);
			tupla.add(FKref);
			tupla.add(check);
			tupla.add(expresion);
			data.add(tupla);
		}
		return "";
	}
	
	public boolean crearCarpeta(String nombre){
		File f = new File(nombre);		
		return f.mkdir();
	}
	
	
	public static void deleteFolder(File folder) {
	    File[] files = folder.listFiles();
	    if(files!=null) { //some JVMs return null for empty dirs
	        for(File f: files) {
	            if(f.isDirectory()) {
	                deleteFolder(f);
	            } else {
	                f.delete();
	            }
	        }
	    }
	    folder.delete();
	    
	}
	
	public String mensajesToString(){
		String devolver="";
		for (int i=0; i<mensajes.size(); i++){
			devolver += mensajes.get(i);
			if (i<mensajes.size()-1){
				devolver+="\n";
			}
		}
		return devolver;
	}
	
	// Para borrar de la metadata el nombre de la base de datos
	public void borrarBD(String nombre){
		archivoXML = new XMLFile("MetadataBaseDeDatos", pathBase);
		NodeList list = archivoXML.getRootElement().getElementsByTagName("BaseDeDatos");
		 
		for (int i = 0; i < list.getLength(); i++) {
			org.w3c.dom.Node nodo =  list.item(i);
			if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
	           Element eElement = (Element) nodo;
	           if (eElement.getElementsByTagName("nombre").item(0).getTextContent().equals(nombre)){
	        	   archivoXML.getRootElement().removeChild(nodo);
	           }
			}
		}
		archivoXML.createFile();
	}

	// Para cambiar el nombre de la base de datos en la metadata
	public void cambiarNombreBD(String nuevo, String viejo){
		archivoXML = new XMLFile("MetadataBaseDeDatos", pathBase);
		archivoXML.cambiarColumna("nombre", nuevo, viejo, "BaseDeDatos");
		archivoXML.createFile();
	}
	
	public void agregarMensaje(int linea, int charPos, String mensaje){
		try{
			String mensajeActual = linea+":"+charPos+"-->"+mensaje;
			mensajes.add(mensajeActual);
		}catch (Exception e){
			//Algo
		}
	}
}
