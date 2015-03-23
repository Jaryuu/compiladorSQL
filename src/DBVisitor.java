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



public class DBVisitor extends SQLBaseVisitor<String>{
	
	private ArrayList<String> mensajes, columnas, datos;
	private XMLFile archivoXML;
	private String pathBase;
	private String nombreBD = "", showNombre;
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
			// Se crea el JSON de metadata			
			System.out.println("Se cre� la carpeta BaseDeDatos");
		}
		
		return super.visitTodo(ctx);
		
	}
	
	public String visitCreateDB(SQLParser.CreateDBContext ctx){
		String nuevaBD = ctx.ID().getText();		
		exitoCarpeta = crearCarpeta(pathBase+nuevaBD);
		archivoXML = new XMLFile(nuevaBD, pathBase+"\\"+nuevaBD+"\\");
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
			System.out.println(datos);
			archivoXML.add("BaseDeDatos", columnas, datos);
		}else{
			mensajes.add("Ya existe la base de datos <"+nuevaBD+">");
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
			System.out.println(folder.getAbsolutePath());
			mensajes.add("No existe la base de datos <"+borrarBD+">");
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
			mensajes.add("La base de datos <"+nuevoNombre+"> ya existe");
		}else if (! f.exists()){
			mensajes.add("No existe la base de datos <"+nombreViejo+">");
		}else{
			// Se cambia el nombre en la metadata			
			archivoXML = new XMLFile("metadataBaseDeDatos", pathBase);
			cambiarNombreBD(nuevoNombre,nombreViejo);
			// cambiamos el nombre de la carpeta			
			f.renameTo(new File(pathBase+"\\"+nuevoNombre));
			// Cambiamos el JSON interno
			archivoXML = new XMLFile(nombreViejo, pathBase+"\\"+nuevoNombre+"\\");
			archivoXML.cambiarNombre(nuevoNombre);
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
			System.out.println(folder.getAbsolutePath());
			mensajes.add("No existe la base de datos <"+nombreBD+">");
		}		
		return "";
	}
	
	
	@Override
	public String visitShowTB(SQLParser.ShowTBContext ctx) {
		data.clear();
		columnas.clear();
		datos.clear();
		if(nombreBD.equals("")){
			mensajes.add("No se ha especificado una base de datos a utilizar");
		}
		else{		
			showNombre = nombreBD+": Tables";
			columnas.add("NombreTabla");
			columnas.add("CantRegistros");
			archivoXML = new XMLFile(nombreBD, pathBase+"\\"+nombreBD+"\\");
			NodeList list = archivoXML.getRootElement().getElementsByTagName("Tabla");
			org.w3c.dom.Node nodo;
			ArrayList<String> nuevoDato;
			for (int i = 0; i < list.getLength(); i++) {
				nodo =  list.item(i);
				if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
					Element eElement = (Element) nodo;
					datos.add(eElement.getElementsByTagName("nombreTabla").item(0).getTextContent());
					datos.add(eElement.getElementsByTagName("cantRegistros").item(0).getTextContent());
					
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
		archivoXML.cambiarColumna("nombre", nuevo, viejo);
		archivoXML.createFile();
	}
}
