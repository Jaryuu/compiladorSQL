/* Universidad del Valle de Guatemala
 Abril de 2015
 Julio Ayala - 12362
 Ricardo Zepeda - 12311
 Bases de datos
 DBVisitor.java es donde se visita el arbol sintactico y se ejecutan las acciones semanticas al visitar cada nodo. 
*/



import java.io.*;
import java.text.ParseException;
import java.util.*;

import javax.xml.soap.Node;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

import java.io.File;
import java.nio.file.Files;



public class DBVisitor extends SQLBaseVisitor<String>{
	
	private ArrayList<String> mensajes, columnas, datos, tablaCols, listaConstraints, datosTipos;
	private XMLFile archivoXML ;
	private String pathBase;
	private String nombreBD = "", showNombre, nombreTabla="";
	private boolean exitoCarpeta, insertandoDatos;
	private boolean evaluandoExp = false;
	String contenido;	
	int contadorInserts, contadorUpdates, contadorDeletes;
	ArrayList<ArrayList<String>> data;
	SQLParser.ExpContext contextExp;
	ArrayList<String> expIds;
	private XMLFile archivoXMLTabla = new XMLFile();
	//Para el select
	private boolean isSelect=false;
	ArrayList<String> listaTablas;
	private boolean bVerbose = false;
	
	
	public ArrayList<String> getExpIds() {
		return expIds;
	}

	public void setExpIds(ArrayList<String> expIds) {
		this.expIds = expIds;
	}

	public String getNombreTabla() {
		return nombreTabla;
	}

	public void setNombreTabla(String nombreTabla) {
		this.nombreTabla = nombreTabla;
	}

	public String getPathBase() {
		return pathBase;
	}

	public void setPathBase(String pathBase) {
		this.pathBase = pathBase;
	}

	public SQLParser.ExpContext getContextExp() {
		return contextExp;
	}

	public void setContextExp(SQLParser.ExpContext contextExp) {
		this.contextExp = contextExp;
	}

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

	
	
	public boolean getEvaluandoExp() {
		return evaluandoExp;
	}

	public void setEvaluandoExp(boolean evaluandoExp) {
		this.evaluandoExp = evaluandoExp;
	}

	public XMLFile getArchivoXML() {
		return archivoXML;
	}

	public void setArchivoXML(XMLFile archivoXML) {
		this.archivoXML = archivoXML;
	}
	
	public boolean isbVerbose() {
		return bVerbose;
	}

	public void setbVerbose(boolean bVerbose) {
		this.bVerbose = bVerbose;
	}

	public String visitTodo(SQLParser.TodoContext ctx){
		// Se crean los atributos
		showNombre = "";
		mensajes = new ArrayList<String>();
		columnas = new ArrayList<String>();
		datos = new ArrayList<String>();
		data = new ArrayList<ArrayList<String>>();
		datosTipos = new ArrayList<String>();
		boolean success = crearCarpeta("BaseDeDatos");
		pathBase = "BaseDeDatos\\";		
		insertandoDatos = false;
		contadorInserts=0;
		contadorUpdates=0;
		contadorDeletes=0;
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa si ya existe la carpeta donde se guarda toda la informacion");
		}
		if (!success) {
		    //System.out.println("Ya existe la carpeta");
			// Vebose
			if (bVerbose){
				System.out.println("Se crea la carpeta y la metadata de todas las bases de datos");
			}
		    archivoXML = new XMLFile("MetadataBaseDeDatos", pathBase);
		}else{
			archivoXML = new XMLFile("MetadataBaseDeDatos", pathBase);
		}
		
		boolean error = false;
		for (int visitarNum=0; visitarNum<ctx.getChildCount(); visitarNum++){
			String strVisitar = visit(ctx.getChild(visitarNum));
			if (strVisitar != null && strVisitar.equals("_error_")){
				error = true;
				break;
			}
		}
		
		if (contadorInserts>0){
			mensajes.add("INSERT ("+contadorInserts+") con exito");
		}
		
		if (contadorUpdates>0){
			mensajes.add("UPDATE ("+contadorUpdates+") con exito");
		}
		if (contadorDeletes>0){
			mensajes.add("DELETE ("+contadorDeletes+") con exito");
		}		
		if (error ){
			return "_error_";
		}else{
			return "";
		}
		
	}
	
	public String visitCasiTodo(SQLParser.CasitodoContext ctx){
		for (int visitarNum=0; visitarNum<ctx.getChildCount(); visitarNum++){
			String strVisitar = visit(ctx.getChild(visitarNum));
			if (strVisitar.equals("_error_")){
				return "_error_";
			}
		}
		return "";
	}

	
	public String visitCreateDB(SQLParser.CreateDBContext ctx){
		String nuevaBD = ctx.ID().getText();		
		exitoCarpeta = crearCarpeta(pathBase+nuevaBD);
		archivoXML = new XMLFile("Metadata."+nuevaBD, pathBase+"\\"+nuevaBD+"\\");
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que la base de datos <"+nuevaBD+"> exista");
		}
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
			// Vebose
			if (bVerbose){
				System.out.println("Se crea el archivo MetadataBaseDeDatos, con nombre y cantidad tablas");
			}
		}else{
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Ya existe la base de datos <"+nuevaBD+">");
			return "_error_";
		}
		return "";
	}
	
	public String visitDropDB(SQLParser.DropDBContext ctx){
		String borrarBD = ctx.ID().getText();
		File folder = new File(pathBase+"\\"+borrarBD);
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa exista la carpeta de la base de datos <"+borrarBD+">");
		}
		if (folder.exists()){
			// Vebose
			if (bVerbose){
				System.out.println("Se borra todos los archivos de la base de datos <"+borrarBD+">");
			}
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
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa exista base de datos <"+nombreViejo+">");
			System.out.println("Se revisa no exista base de datos <"+nuevoNombre+">");
		}
		if (f2.exists()){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"La base de datos <"+nuevoNombre+"> ya existe");
			return "_error_";
		}else if (! f.exists()){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No existe la base de datos <"+nombreViejo+">");
			return "_error_";
		}else{
			// Se cambia el nombre en la metadata					
			archivoXML = new XMLFile("MetadataBaseDeDatos", pathBase);
			cambiarNombreBD(nuevoNombre,nombreViejo);
			// cambiamos el nombre de la carpeta				
			f.renameTo(new File(pathBase+"\\"+nuevoNombre));
			// Cambiamos el XML interno
			// Vebose
			if (bVerbose){
				System.out.println("Se cambia el nombre de la base de datos <"+nombreViejo+">");
				System.out.println("Se cambia el nombre del archivo a <"+nuevoNombre+">");
				System.out.println("Se cambia el nombre del archivo de la metadata");
			}
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
		// Vebose
		if (bVerbose){
			System.out.println("Se cargan los datos de las bases de datos>");
		}
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
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que exista la base de datos <"+nombreBD+">");
		}
		if (!folder.exists()){			
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No existe la base de datos <"+nombreBD+">");
			nombreBD = "";
			return "_error_";
		}		
		return "";
	}
	
	public String visitShowTB(SQLParser.ShowTBContext ctx) {
		data.clear();
		columnas.clear();
		datos.clear();
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que se haya elegido base de datos");
		}
		if(nombreBD.equals("")){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No se ha especificado una base de datos a utilizar");
			return "_error_";
		}
		else{		
			showNombre = nombreBD+": Tables";
			columnas.add("NombreTabla");
			columnas.add("CantRegistros");
			// Vebose
			if (bVerbose){
				System.out.println("Se cargan los datos de las tablas de la base de datos <"+nombreBD+">");
			}
			archivoXML = new XMLFile("Metadata."+nombreBD, pathBase+"\\"+nombreBD+"\\");
			NodeList list = archivoXML.getRootElement().getElementsByTagName("tabla");
			org.w3c.dom.Node nodo;
			for (int i = 0; i < list.getLength(); i++) {
				nodo =  list.item(i);
				if (nodo.getNodeType() == Node.ELEMENT_NODE) {	           
					Element eElement = (Element) nodo;
					datos.add(eElement.getElementsByTagName("nombreTabla").item(0).getTextContent());
					datos.add(eElement.getElementsByTagName("cantidadRegistros").item(0).getTextContent());
					
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
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que ya se haya elegido base de datos");
		}
		if(nombreBD.equals("")){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No se ha especificado una base de datos a utilizar");
			return "_error_";
		}
		else{	
			nombreTabla = ctx.ID(0).getText();
			String pathCarpeta = pathBase+"\\"+nombreBD;
			// Revisamos si ya existe la tabla, revisando si existe el XML de la tabla
			// Vebose
			if (bVerbose){
				System.out.println("Se revisa si exista la tabla <"+nombreTabla+">");
			}
			File arch = new File(pathCarpeta+"\\"+nombreTabla+".XML");
			if (arch.exists()){
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"La tabla <"+nombreTabla+"> ya existe en <"+nombreBD+">");
				return "_error_";
			}
			// Vebose
			if (bVerbose){
				System.out.println("Se modifica la metadata principal, agregando 1 a la cantidad de tablas");
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
			// Vebose
			if (bVerbose){
				System.out.println("Se modifica la metadata de la base de datos <"+nombreBD+">, agregando la tabla <"+nombreTabla+">");
			}
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
				tipoDato.add(tipoActual.toLowerCase());
			}		
			datos.clear();
			// Vebose
			if (bVerbose){
				System.out.println("Se agregan las columnas y los tipos de las columnas a la metadata");
			}
			// Para poder tener los nombres en una lista visible para todos los metodos
			datos = nombres;			
			archivoXML.agregarListaColumnas(nombreTabla, nombres, tipoDato);
			
			// Agregamos la tag de constraints
			archivoXML.addTagConstraint(nombreTabla);	
			
			// Visitamos lo demas
			if (visit(ctx.constraints()).equals("_error_")){
				return "_error_";
			}
			
			// Creamos el archivo XML para esta tabla
			if (bVerbose){
				System.out.println("Se crea el archivo para la tabla");
			}
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
			String strVisit = visit(ctx.constraint(y));
			if (strVisit.equals("_error_")){
				return "_error_";
			}
		}
		return "";
	}
	
	// En datos vienen los ids de las columnas
	// listaConstraints viene los nombres de las constraints
	public String visitCPK(SQLParser.CPKContext ctx){
		ArrayList<String> ids = new ArrayList();
		String nombreC = ctx.ID(0).getText();
		if (bVerbose){
			System.out.println("Se revisa si ya existe la constraint <"+nombreC+">");
		}
		if (listaConstraints.contains(nombreC)){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Ya existe la constraint <"+nombreC+">");
			return "_error_";
		}
		for (int y=1; y<ctx.ID().size();y++){
			if (bVerbose){
				System.out.println("Se revisa que ya exista la columna <"+ctx.ID(y).getText()+">");
			}
			// Revisamos que existan todos los ids ya en la tabla, a traves de datos
			if (! datos.contains(ctx.ID(y).getText())){
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"La tabla <"+nombreTabla+"> no tiene la columna <"+ctx.ID(y).getText()+">");
				return "_error_";
			}
			ids.add(ctx.ID(y).getText());
		}
		listaConstraints.add(nombreC);		
		if (archivoXML.countRegistros(nombreTabla)>0){
			// Revisamos los datos actuales de la tabla para que la pk no sea conflictiva
			// Revisamos que no sea null			
			archivoXMLTabla = new XMLFile(nombreTabla, pathBase+"\\"+nombreBD);
			ArrayList<String> idColsPK = ids;		
			ArrayList<ArrayList<String>> tmpQuery = archivoXMLTabla.queryColumns(idColsPK);
			// Verbose
			if (bVerbose){
				System.out.println("Revisamos la data ya ingresada");
				System.out.println("Revisamos que no haya datos null");
				System.out.println("Revisamos que no se repita");
			}			
			
			for (int x=0; x<tmpQuery.size(); x++){				
				if (tmpQuery.get(x).contains("null")){
					agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"Las columnas <"+idColsPK.toString()+"> no deben ser null");
					return "_error_";
				}else{
					ArrayList<String> tuplaPK = new ArrayList<String>();
					for (int y=0; y<tmpQuery.get(x).size(); y++){
						tuplaPK.add(tmpQuery.get(x).get(y));
					}
					// Revisamos que no se repita
					if (x+1<tmpQuery.size()){
						if (tmpQuery.subList(x+1, tmpQuery.size()).contains(tuplaPK)){
							agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"Las columnas <"+idColsPK.toString()+"> deben tener valores unicos, la llave primaria <"+tuplaPK.toString()+"> ya existe");
							return "_error_";
						}
					}
				}
			}
		}
		
		// Vebose
		if (bVerbose){
			System.out.println("Se agrega la primary key <"+nombreC+">");
		}
		// Los agregamos al constraints
		archivoXML.agregarConstraint(nombreTabla, "primaryKey", nombreC, ids);
		return "";
	}
	
	// En datos vienen los ids de las columnas
	// En nombre tabla va el nombre de la tabla
	public String visitCFK(SQLParser.CFKContext ctx){
		// Se revisa si se tiene la mista cantidad de ids referencias, ids
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que haya la misma cantidad de ids de la tabla que de ids de las referencias");
		}
		if (ctx.ID().size() != ctx.references().ID().size()){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No se tiene la misma cantidad de ids de las columnas de la tabla y de las referencias");
			return "_error_";
		}
		ArrayList<String> colIds = new ArrayList();
		String nombreC = ctx.ID(0).getText();
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que no exista la constraint <"+nombreC+">");
		}
		// Revisamos que no exista una constraint con el mismo nombre
		if (listaConstraints.contains(nombreC)){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Ya existe la constraint <"+nombreC+">");
			return "_error_";
		}
		
		for (int y=1; y<ctx.ID().size();y++){
			// Revisamos que existan las columnas
			// Vebose
			if (bVerbose){
				System.out.println("Se revisa que exista la columna <"+ctx.ID(y).getText()+"> en la tabla <"+nombreTabla+">");
			}
			if (! datos.contains(ctx.ID(y).getText())){
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"La tabla <"+nombreTabla+"> no tiene la columna <"+ctx.ID(y).getText()+">");
				return "_error_";
			}
			colIds.add(ctx.ID(y).getText());
		}
		ArrayList<String> referencias = new ArrayList<String>();
		String idTablaRef = ctx.references().ID(0).getText();
		
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que exista la tabla <"+idTablaRef+"> en la base de datos en uso");
		}
		// Revisamos que exista la tabla en esta base de datos
		File existe = new File(pathBase+"\\"+nombreBD+"\\"+idTablaRef+".XML");
		if (! existe.exists()){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No existe la tabla <"+idTablaRef+">");
			return "_error_";
		}
		// Que haya referencias
		if (ctx.references().ID().size()<=1){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No se hace referencia a ninguna tabla");
			return "_error_";
		}
		
		ArrayList<String> listaPks = archivoXML.listaColsPK(idTablaRef);
		for (int y=1; y<ctx.references().ID().size();y++){
			String idAct = ctx.references().ID(y).getText();
			
			// Vebose
			if (bVerbose){
				System.out.println("Se revisa que exista la columna <"+idAct+"> en la tabla <"+idTablaRef+">");
			}
			
			if(!listaPks.contains(idAct)){
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"La columna <"+idAct+"> en tabla <"+idTablaRef+"> no es Primary Key");
				return "_error_";
			}
			
			if (! archivoXML.existeCol(idTablaRef, idAct)){
				// Que exista la columna
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No existe la columna <"+idAct+"> en tabla <"+idTablaRef+">");
				return "_error_";
			}
			else{
				// Vebose
				if (bVerbose){
					System.out.println("Revisa que el tipo de dato sea el mismo entre <"+idTablaRef+"."+idAct+","+nombreTabla+"."+colIds.get(y-1)+">");
				}
				if(!archivoXML.tipoCol(idTablaRef,idAct).equals(archivoXML.tipoCol(nombreTabla,colIds.get(y-1)))){
					if (archivoXML.tipoCol(idTablaRef,idAct).startsWith("char")){
						mensajes.add("la columna <"+idAct+"> en tabla <"+idTablaRef+"> no tiene el mismo tamaño de char que la columna <"+colIds.get(y-1)+">");
						return "_error_";	
					}else{
						mensajes.add("la columna <"+idAct+"> en tabla <"+idTablaRef+"> no tiene el mismo tipo que la columna <"+colIds.get(y-1)+">");
						return "_error_";	
					}
				}
			}
			referencias.add(idTablaRef+"."+idAct);
		}
		listaConstraints.add(nombreC);
			
		// Revisamos que no sea conflictiva la constraint
		// Revisamos los datos de la tabla actual
		if (archivoXML.countRegistros(nombreTabla)>0){
			// Verbose
			if (bVerbose){
				System.out.println("Revisamos la data ya ingresada en la tabla <"+nombreTabla+">");
				System.out.println("Revisamos que no haya datos null");
				System.out.println("Revisamos que no se repita");
			}
			for (int w=0; w<colIds.size(); w++){			
				// Revisamos los datos actuales de la tabla para que la pk no sea conflictiva
				// Revisamos que no sea null
				archivoXMLTabla = new XMLFile(nombreTabla, pathBase+"\\"+nombreBD);
				ArrayList<String> idCol = new ArrayList<String>();
				idCol.add(colIds.get(w));
				ArrayList<ArrayList<String>> tmpQuery = archivoXMLTabla.queryColumns(idCol);
				for (int x=0; x<tmpQuery.size(); x++){
					if (tmpQuery.get(x).contains("null")){
						agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"Las columnas <"+idCol.toString()+"> no deben ser null");
						return "_error_";
					}else{
						ArrayList<String> tuplaPK = new ArrayList<String>();
						for (int y=0; y<tmpQuery.get(x).size(); y++){
							tuplaPK.add(tmpQuery.get(x).get(y));
						}
						// Revisamos que no se repita
						if (x+1<tmpQuery.size()){
							if (tmpQuery.subList(x+1, tmpQuery.size()).contains(tuplaPK)){
								agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"Las columnas <"+idCol.toString()+"> deben tener valores unicos, la llave <"+tuplaPK.toString()+"> ya existe");
								return "_error_";
							}
						}
					}
				}
			}
		}
		String tempNombreTabla = nombreTabla;		
		// Revisamos las referencias		
		for (int w=0; w<referencias.size(); w++){
			String refIgual = referencias.get(w);
			String[] tbCol = refIgual.split("\\.");
			nombreTabla = tbCol[0];
			String nombreCol = tbCol[1];
			if (archivoXML.countRegistros(nombreTabla)>0){
				// Revisamos los datos actuales de la tabla para que la pk no sea conflictiva
				// Revisamos que no sea null
				// Verbose
				if (bVerbose){
					System.out.println("Revisamos que no haya datos null en la tabla <"+nombreTabla+">");
					System.out.println("Revisamos que no se repita en la tabla <"+nombreTabla+">");
				}
				archivoXMLTabla = new XMLFile(nombreTabla, pathBase+"\\"+nombreBD);
				ArrayList<String> idCol = new ArrayList<String>();
				idCol.add(nombreCol);
				ArrayList<ArrayList<String>> tmpQuery = archivoXMLTabla.queryColumns(idCol);
				for (int x=0; x<tmpQuery.size(); x++){
					if (tmpQuery.get(x).contains("null")){
						agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"Las columnas <"+idCol.toString()+"> no deben ser null");
						return "_error_";
					}else{
						ArrayList<String> tuplaPK = new ArrayList<String>();
						for (int y=0; y<tmpQuery.get(x).size(); y++){
							tuplaPK.add(tmpQuery.get(x).get(y));
						}
						// Revisamos que no se repita
						if (x+1<tmpQuery.size()){
							if (tmpQuery.subList(x+1, tmpQuery.size()).contains(tuplaPK)){
								agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"Las columnas <"+idCol.toString()+"> deben tener valores unicos, la llave primaria <"+tuplaPK.toString()+"> ya existe");
								return "_error_";
							}
						}
					}
				}
			}
		}
		nombreTabla = tempNombreTabla;
		
		// Verbose
		if (bVerbose){
			System.out.println("Se agrega la foreign key <"+nombreC+">");
		}
		// Los agregamos al constraints
		archivoXML.agregarConstraint(nombreTabla, "foreignKey", nombreC, colIds, referencias);		
		return "";
	}
	
	public String visitCCheck(SQLParser.CCheckContext ctx){
		// Esto se va a guardar check-nombreCheck-stringCheck TODO
		if (visit(ctx.exp()).equals("_error_")){			
			return "__error__";
		}
		String pathCarpeta = pathBase+"\\"+nombreBD;
		if (!archivoXMLTabla.getNombre().equals(nombreTabla)){
			archivoXMLTabla = new XMLFile(nombreTabla, pathCarpeta);
		}
		
		
		int a = ctx.start.getStartIndex();
	    int b = ctx.stop.getStopIndex();
	    Interval interval = new Interval(a,b);	
		String stringCheck = ctx.start.getInputStream().getText(interval);
		String nombre = ctx.ID().getText();
		// Verbose
		if (bVerbose){
			System.out.println("Se revisa que no exista la constraint <"+nombre+">");
		}
		if (listaConstraints.contains(nombre)){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Ya existe la constraint <"+nombre+">");
			return "_error_";
		}else{
			listaConstraints.add(nombre);
		}
		
		ArrayList<String> colsTabla = archivoXML.listarColumnas(nombreTabla);
		ArrayList<ArrayList<String>> query = archivoXMLTabla.queryColumns(colsTabla);
		for(int i=0;i<query.size();i++){
//			System.out.println(query.get(i));
			if(!checkTupla(query.get(i),colsTabla,ctx.exp())){
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "La tupla <"+query.get(i).toString()+"> no cumple con la expresion del check<"+ctx.exp().getText()+">");
				return "_error_";
			}
		}
		
		
		
		
		
		// Verbose
		if (bVerbose){			
			System.out.println("Se guarda el string del check en la metadata");	
			System.out.println("Se agrega el check <"+nombre+">");
		}
		archivoXML.agregarConstraint(nombreTabla, "check", nombre, stringCheck);
		
		return "";
	}
	
	public String visitExp(SQLParser.ExpContext ctx){
		contextExp = ctx;
		expIds = new ArrayList<String>();
		return visit(ctx.expr());
		
	}
	
	
	
	//Todos los exp (revision de tipo)
	
	@Override
	public String visitExpGL(SQLParser.ExpGLContext ctx) {
		String returnExp4 = visit(ctx.exp4());
		String returnExpUni = visit(ctx.unifactor());
		if (returnExp4.equals("_error_") || returnExpUni.equals("_error_")){
			return "_error_";
		}
		if (evaluandoExp){
			float fExp4 = 0.0f, fExpUni = 0.0f;
			try{
				fExp4 = Float.parseFloat(returnExp4);
				fExpUni = Float.parseFloat(returnExpUni);
				if (ctx.relationalExpGL().getText().equals("<")){
					if (fExp4 < fExpUni){
						return "true";
					}
					else{
						return "false";
					}
				}
				else if (ctx.relationalExpGL().getText().equals(">")){
					
					if (fExp4 > fExpUni){
						return "true";
					}
					else{
						return "false";
					}
				}
				else if (ctx.relationalExpGL().getText().equals("<=")){
					if (fExp4 <= fExpUni){
						return "true";
					}
					else{
						return "false";
					}
				}
				else if (ctx.relationalExpGL().getText().equals(">=")){
					if (fExp4 >= fExpUni){
						return "true";
					}
					else{
						return "false";
					}
				}
			}
			catch(Exception e){
				if (ctx.relationalExpGL().getText().equals("<")){
					if (returnExp4.compareTo(returnExpUni)<0){
						return "true";
					}
					else{
						return "false";
					}
				}
				else if (ctx.relationalExpGL().getText().equals(">")){
					
					if (returnExp4.compareTo(returnExpUni)>0){
						return "true";
					}
					else{
						return "false";
					}
				}
				else if (ctx.relationalExpGL().getText().equals("<=")){
					if (returnExp4.compareTo(returnExpUni)<=0){
						return "true";
					}
					else{
						return "false";
					}
				}
				else if (ctx.relationalExpGL().getText().equals(">=")){
					if (returnExp4.compareTo(returnExpUni)>=0){
						return "true";
					}
					else{
						return "false";
					}
				}
			}
			
			
			return "";
		}
		else{
			if (returnExpUni.equals(returnExp4) || returnExpUni.equals("null") || (returnExpUni.equals("int") && returnExp4.equals("float")) || (returnExpUni.equals("float") && returnExp4.equals("int"))){
				return "boolean";
			}
			else{
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Expresion <"+ctx.getText()+"> no coincide en tipos");
				return "_error_";
			}
		}
		
	}

	@Override
	public String visitExpNotOr(SQLParser.ExpNotOrContext ctx) {
		String strVisitar = "";
		for (int visitarNum=0; visitarNum<ctx.getChildCount(); visitarNum++){
			strVisitar = visit(ctx.getChild(visitarNum));
			if (strVisitar.equals("_error_")){
				return "_error_";
			}
		}
		return strVisitar;
		//return super.visitExpNotOr(ctx);
	}

	@Override
	public String visitExpNotGl(SQLParser.ExpNotGlContext ctx) {
		String strVisitar = "";
		for (int visitarNum=0; visitarNum<ctx.getChildCount(); visitarNum++){
			strVisitar = visit(ctx.getChild(visitarNum));
			if (strVisitar.equals("_error_")){
				return "_error_";
			}
		}
		return strVisitar;
		//return super.visitExpNotGl(ctx);
	}

	@Override
	public String visitExpNotEq(SQLParser.ExpNotEqContext ctx) {
		String strVisitar = "";
		for (int visitarNum=0; visitarNum<ctx.getChildCount(); visitarNum++){
			strVisitar = visit(ctx.getChild(visitarNum));
			if (strVisitar.equals("_error_")){
				return "_error_";
			}
		}
		return strVisitar;
		//return super.visitExpNotEq(ctx);
	}

	@Override
	public String visitExpOr(SQLParser.ExpOrContext ctx) {
		String returnExp2 = visit(ctx.exp2());
		String returnExp3 = visit(ctx.exp3());
		if (returnExp2.equals("_error_") || returnExp3.equals("_error_")){
			return "_error_";
		}
		
		if(evaluandoExp){
			if (returnExp2.equals("true") || returnExp3.equals("true")){
				return "true";
			}
			else{
				return "false";
			}
		}
		else{
			if (returnExp2.equals("boolean") && returnExp3.equals("boolean")){
				return "boolean";
			}
			else{			
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Expresion <"+ctx.getText()+"> no coincide en tipos");
				return "_error_";
			}
		}
		
	}

	@Override
	public String visitExpNotAnd(SQLParser.ExpNotAndContext ctx) {
		String strVisitar = "";
		for (int visitarNum=0; visitarNum<ctx.getChildCount(); visitarNum++){
			strVisitar = visit(ctx.getChild(visitarNum));
			if (strVisitar.equals("_error_")){
				return "_error_";
			}
		}
		return strVisitar;
		//return super.visitExpNotAnd(ctx);
	}

	@Override
	public String visitExpID(SQLParser.ExpIDContext ctx) {
		String pathCarpeta = pathBase+"\\"+nombreBD;
		if (!archivoXML.getNombre().equals("Metadata."+nombreBD)){
			archivoXML = new XMLFile("Metadata."+nombreBD, pathCarpeta);
		}
		//Revisar tipo del ID
		//TODO smth
		String colType = "";
		if(ctx.ID().size()==1){
			
			if (ctx.ID(0).getText().equals("null")){
				return "null";
			}
			if(!isSelect){
				colType = archivoXML.tipoCol(nombreTabla, ctx.ID(0).getText());
			}
			else{
				colType="None";
				int cantReg=0;
				for(int i=0;i<listaTablas.size();i++){
					if(!archivoXML.tipoCol(listaTablas.get(i), ctx.ID(0).getText()).equals("None")){
						cantReg++;
						colType = archivoXML.tipoCol(listaTablas.get(i), ctx.ID(0).getText());
					}
				}
				if (cantReg>1){
					agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "la columna <"+ctx.getText()+"> aparece mas de una vez en las tablas consultadas y es ambiguo");
					return "_error_";
				}
				
			}
			if(colType.startsWith("char")){
				colType = "char";
			}
			
			expIds.add(ctx.ID(0).getText());
			
			
		}
		else{
			colType = archivoXML.tipoCol(ctx.ID(0).getText(), ctx.ID(1).getText());
			expIds.add(ctx.ID(0).getText()+"."+ctx.ID(1).getText());
			if(colType.startsWith("char")){
				colType = "char";
			}
		}
		
		if (colType.equals("None")){			
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "la columna <"+ctx.getText()+"> no existe");
			return "_error_";
		}
		else{
			return colType;
		}
		
	}

	@Override
	public String visitExpAnd(SQLParser.ExpAndContext ctx) {
		String returnExpr = visit(ctx.expr());
		String returnExp2 = visit(ctx.exp2());
		
		if (returnExpr.equals("_error_") || returnExp2.equals("_error_")){
			return "_error_";
		}
		
		if(evaluandoExp){
			if (returnExpr.equals("true") && returnExp2.equals("true")){
				return "true";
			}
			else{
				return "false";
			}
		}
		else{
			if (returnExpr.equals("boolean") && returnExp2.equals("boolean")){
				//idk
				return "boolean";
			}
			else{
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Expresion  <"+ctx.getText()+"> no coincide en tipos");
				return "_error_";
			}
		}
		
	}

	@Override
	public String visitExpNotFactor(SQLParser.ExpNotFactorContext ctx) {
		String returnTypeFactor = visit(ctx.factor());		
		
		//TODO Esto creo que esta malo
		if (evaluandoExp){
			return "-"+returnTypeFactor;
		}
		else{
			if (returnTypeFactor.equals("int") || returnTypeFactor.equals("float")){
				return returnTypeFactor;
			}
			else{
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Expresion <"+ctx.getText()+"> no tiene tipo int o float");
				return "_error_";
			}
		}
		
	}

	@Override
	public String visitExpEq(SQLParser.ExpEqContext ctx) {
		
		String returnExp3 = visit(ctx.exp3());
		String returnExp4 = visit(ctx.exp4());
		if(evaluandoExp){
			if (ctx.relationalExpEq().getText().equals("=")){
				//parseo
				float fExp4 = 0.0f, fExp3 = 0.0f;
				try{
					fExp3 = Float.parseFloat(returnExp3);
					fExp4 = Float.parseFloat(returnExp4);
					return String.valueOf(fExp3==fExp4);
				}
				catch(Exception e){
					return String.valueOf(returnExp3.equals(returnExp4));
				}
				
				
			}
			else{
				float fExp4 = 0.0f, fExp3 = 0.0f;
				try{
					fExp3 = Float.parseFloat(returnExp3);
					fExp4 = Float.parseFloat(returnExp4);
					return String.valueOf(fExp3!=fExp4);
				}
				catch(Exception e){
					return String.valueOf(!returnExp3.equals(returnExp4));
				}
			}
		}
		
		else{
			//TODO parseo implicito de int<-->float
			if (returnExp3.equals(returnExp4) || returnExp4.equals("null") || (returnExp3.equals("int") && returnExp4.equals("float")) || (returnExp3.equals("float") && returnExp4.equals("int"))){
				return "boolean";
			}
			else{
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Expresion <"+ctx.getText()+"> no coincide en tipos");
				return "_error_";
			}
		}
		
		
	}

	@Override
	public String visitExpFactor(SQLParser.ExpFactorContext ctx) {
		String strVisitar = "";
		for (int visitarNum=0; visitarNum<ctx.getChildCount(); visitarNum++){
			strVisitar = visit(ctx.getChild(visitarNum));
			if (strVisitar.equals("_error_")){
				return "_error_";
			}
		}
		return strVisitar;
//		return super.visitExpFactor(ctx);
	}

	@Override
	public String visitExpParentheses(SQLParser.ExpParenthesesContext ctx) {
		return visit(ctx.exp());
	}

	@Override
	public String visitExpLiteral(SQLParser.ExpLiteralContext ctx) {
		String strVisitar = "";
		for (int visitarNum=0; visitarNum<ctx.getChildCount(); visitarNum++){
			strVisitar = visit(ctx.getChild(visitarNum));
			if (strVisitar.equals("_error_")){
				return "_error_";
			}
		}
		return strVisitar;
//		return super.visitExpLiteral(ctx);
	}
	
	
	//hasta aqui exp//
	
	public String visitReferences(SQLParser.ReferencesContext ctx){
		for (int visitarNum=0; visitarNum<ctx.getChildCount(); visitarNum++){
			String strVisitar = visit(ctx.getChild(visitarNum));
			if (strVisitar.equals("_error_")){
				return "_error_";
			}
		}
		return "";
//		return super.visitReferences(ctx);
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
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que ya se haya elegido base de datos");
		}
		// Ya se eligio la base de datos
		if(nombreBD.equals("")){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No se ha especificado una base de datos a utilizar");
			return "_error_";
		}
		else{
			String idTabla = ctx.ID(0).getText();
			String nuevoNombre = ctx.ID(1).getText();
			String pathCarpeta = pathBase+"\\"+nombreBD;
			// Vebose
			if (bVerbose){
				System.out.println("Se revisa que exista la tabla <"+idTabla+">");
			}
			// Revisamos que exista la tabla
			File f = new File(pathCarpeta+"\\"+idTabla+".XML");
			if (! f.exists()){
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No existe la tabla <"+idTabla+">");
				return "_error_";
			}
			// Vebose
			if (bVerbose){
				System.out.println("Se cambia el nombre del archivo de la tabla <"+idTabla+">");
				System.out.println("Se cambia el nombre en la metadata de la base de datos <"+nombreBD+">");
				System.out.println("Se cambia el nombre el nombre en las constraints que tenian referencia a esta tabla");
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
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que ya se haya elegido base de datos");
		}
		if(nombreBD.equals("")){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No se ha especificado una base de datos a utilizar");
			return "_error_";
		}
		nombreTabla = ctx.ID().getText();
		String pathCarpeta = pathBase+"\\"+nombreBD;
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que exista la tabla <"+nombreTabla+">");
		}
		// Revisamos que exista la tabla
		File tempF = new File(pathCarpeta+"\\"+nombreTabla+".XML");
		if (! tempF.exists()){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "No existe la tabla <"+nombreTabla+">");
			return "_error_";
		}		
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que la tabla <"+nombreTabla+"> no se mencione en alguna foreign key");
		}
		// Revisamos que no se menciona en alguna fk
		archivoXML = new XMLFile("Metadata."+nombreBD, pathCarpeta);
		if (archivoXML.revFKRefTB(nombreTabla)){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Se hace referencia de <"+nombreTabla+"> en alguna constraint");
			return "_error_";
		}
		// Vebose
		if (bVerbose){
			System.out.println("Se borra la tabla <"+nombreTabla+"> de la metadata");
			System.out.println("Se borra el archivo de la tabla <"+nombreTabla+">");
		}
		// Una vez revisamos que no se haga referencia a esa tabla se borra de la metadata	
		ArrayList<String> adentrar = new ArrayList<String> ();
		adentrar.add("tabla");
		archivoXML.eliminarNodo(adentrar, "nombreTabla", nombreTabla);
		// Vebose
		if (bVerbose){
			System.out.println("Se resta a la cantidad de tablas de la base de datos");
		}
		ArrayList<String> adentrar2 = new ArrayList<String>();
		adentrar2.add("tabla");
		archivoXML.restarAtributo(adentrar2, "nombreTabla", nombreTabla, "cantidadRegistros", 1);		
		// Se borra el archivo de la tabla
		if (tempF.exists()){
			tempF.delete();
		}		
		return "";
	}
	
	public String visitAlterTB(SQLParser.AlterTBContext ctx){
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que ya se haya elegido una base de datos");
		}
		// Ya se eligio base de datos a usar
		if(nombreBD.equals("")){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No se ha especificado una base de datos a utilizar");
			return "_error_";
		}else{
			nombreTabla = ctx.ID().getText();
			String pathCarpeta = pathBase +"\\"+nombreBD;
			File f = new File(pathCarpeta+"\\"+nombreTabla+".XML");
			// Vebose
			if (bVerbose){
				System.out.println("Se revisa que exista la tabla <"+nombreTabla+">");
			}
			// existe la tabla
			if (! f.exists()){
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "No existe la tabla <"+nombreTabla+">");
				return "_error_";
			}									
			archivoXML = new XMLFile("Metadata."+nombreBD, pathCarpeta);
			
			// Llenamos las listas que se usan
			datos = archivoXML.listarColumnas(nombreTabla);
			listaConstraints = archivoXML.listarConstraintsTabla(nombreTabla);
			
			// Visitamos table action
			for (int i=0; i<ctx.tableAction().size(); i++){
				if (visit(ctx.tableAction(i)).equals("_error_")){
					return "_error_";
				}
			}
			return "";
		}			
	}
	
	public String visitAddColumnTB(SQLParser.AddColumnTBContext ctx){
		String nombreColumna = ctx.ID().getText();
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que no haya una columna con el mismo nombre");
		}
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
		tipoDato.add(tipoActual.toLowerCase());
		// Vebose
		if (bVerbose){
			System.out.println("Se agrega la columna <"+ nombreColumna+"> a la tabla <"+nombreTabla+">");
		}
		archivoXML.agregarListaColumnas(nombreTabla, informacion, tipoDato);
		// Visitamos las constraints
		if (visit(ctx.constraints()).equals("_error_")){
			return "_error_";
		}
		return "";
	}
	
	public String visitAddConstraintTB(SQLParser.AddConstraintTBContext ctx){
		// Vebose
		if (bVerbose){
			System.out.println("Se obtienen las columnas de la tabla <"+nombreTabla+">");
			System.out.println("Se obtienen las constraints de la tabla <"+nombreTabla+">");
		}
		// Obtenemos todas las columnas de esa tabla
		tablaCols = archivoXML.listarColumnas(nombreTabla);
		datos.clear();
		datos = tablaCols;
		// Listamos las constraints
		listaConstraints = archivoXML.listarConstraintsTabla(nombreTabla);
		if (visit(ctx.constraint()).equals("_error_")){
			return "_error_";
		}
		return "";
	}
	
	public String visitDropColumnTB(SQLParser.DropColumnTBContext ctx){
		String nombreColumna = ctx.ID().getText();
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que exista la columna <"+nombreColumna+">");
		}
		// Revisamos que exista la columna
		if (! archivoXML.listarColumnas(nombreTabla).contains(nombreColumna)){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "La columna <"+nombreColumna+"> no existe en la tabla <"+nombreTabla+">");			
			return "_error_";
		}
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa si se menciona la columna en alguna constraint");
		}
		if (archivoXML.revConstraintCol(nombreTabla, nombreColumna)){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "La columna <"+nombreColumna+"> se usa de referencia en una constraint de la base de datos");			
			return "_error_";
		}
		// Vebose
		if (bVerbose){
			System.out.println("Se borra la columna de la metadata");
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
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que exista la constraint <"+idC+">");
		}
		if (! archivoXML.eliminarConstraint(nombreTabla, idC)){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(), "La constraint <"+idC+"> no existe en la tabla <"+nombreTabla+">");			
			return "_error_";
		}
		return "";
	}

	public String visitShowColums(SQLParser.ShowColumsContext ctx){
		if(nombreBD.equals("")){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No se ha especificado una base de datos a utilizar");
			return "_error_";
		}else{
			String pathCarpeta = pathBase+"\\"+nombreBD;
			archivoXML = new XMLFile("Metadata."+nombreBD, pathCarpeta);
			nombreTabla = ctx.ID().getText();
			// Vebose
			if (bVerbose){
				System.out.println("Se revisa que exista la tabla <"+nombreTabla+">");
			}
			// Revisamos que exista la tabla
			File f = new File(pathCarpeta+"\\"+nombreTabla+".XML");
			if (! f.exists()){
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No existe la tabla <"+nombreTabla+">");
				return "_error_";
			}
			// Vebose
			if (bVerbose){
				System.out.println("Se carga la data de la tabla <"+nombreTabla+">");
			}
			columnas.clear();
			data.clear();
			columnas.add("nombreColumna");
			columnas.add("tipoDato");
			columnas.add("primaryKey");
			columnas.add("foreignKey");
			columnas.add("referenciaFK");
			columnas.add("check");
			columnas.add("expresion");
			data = getTableMetadata();
			return "";
		}
	}
	
	public String visitData(SQLParser.DataContext ctx){		
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que ya se haya elegido una base de datos");
		}
		// Se revisa que ya se haya elegido una base de datos a utilizar
		if(ctx.query()== null && nombreBD.equals("")){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No se ha especificado una base de datos a utilizar");
			return "_error_";
		}else{			
			for (int visitarNum=0; visitarNum<ctx.getChildCount(); visitarNum++){
				String strVisitar = visit(ctx.getChild(visitarNum));
				if (strVisitar.equals("_error_")){
					return "_error_";
				}
			}
			return "";
		}
	}
	
	public String visitInsert(SQLParser.InsertContext ctx){
		nombreTabla = ctx.ID(0).getText();
		String pathCarpeta = pathBase+"\\"+nombreBD;
		
		// Revisamos que exista la tabla
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que ya exista la tabla <"+nombreTabla+">");
		}
		File f = new File(pathCarpeta+"\\"+nombreTabla+".XML");
		if (! f.exists()){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No existe la tabla <"+nombreTabla+">");
			return "_error_";
		}
		
		// Colocamos en una lista los nombres de las columnas		
		columnas=new ArrayList<String>();
		ArrayList<String> columnasReales = new ArrayList<String>();
		ArrayList<String> tiposReales  = new ArrayList<String>();
		ArrayList<ArrayList<String>> temporal = new ArrayList<ArrayList<String>>();
		
		if (!archivoXML.getNombre().equals("Metadata."+nombreBD)){
			archivoXML = new XMLFile("Metadata."+nombreBD, pathCarpeta);
		}
		
		
		if (ctx.ID().size()>1){
			for (int x=1; x<ctx.ID().size(); x++){
				// Vebose
				if (bVerbose){
					System.out.println("Se revisa que exista la columna <"+ ctx.ID(x).getText()+">");
				}
				// Revisamos que exista la columna mencionada
				if (archivoXML.existeCol(nombreTabla, ctx.ID(x).getText())){
					// Revisamos que no se repita la columna
					// Vebose
					if (bVerbose){
						System.out.println("Se revisa que no se haya mencionado la columna <"+ ctx.ID(x).getText()+">");
					}
					if (columnas.contains(ctx.ID(x).getText())){
						agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"Se menciona dos veces la columna <"+ctx.ID(x).getText()+">");
						return "_error_";
					}
					columnas.add(ctx.ID(x).getText());					
				}else{
					agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No existe la columna <"+ctx.ID(x).getText()+">");
					return "_error_";
				}				
			}			
			// Vebose
			if (bVerbose){
				System.out.println("Se colocan los tipos de las columnas");
			}
			// Se colocan los tipos de las columnas
			columnasReales = archivoXML.listarColumnas(nombreTabla);				
			tiposReales = archivoXML.listarTiposTabla(columnas, nombreTabla);
		}else{
			// Vebose
			if (bVerbose){
				System.out.println("Se colocan todas las columnas");
			}
			// Si no se especifican las columnas se colocan todas las columnas
			temporal = archivoXML.listarColumnasYTipos(nombreTabla);	
			columnasReales = archivoXML.listarColumnas(nombreTabla); //TST
			columnas = temporal.get(0);
			tiposReales = temporal.get(1);
		}		

		// En datos colocamos los valores y en datosTipos colocamos el tipo de cada dato
		datos = new ArrayList<String>();
		datosTipos =new ArrayList<String>();
		insertandoDatos = true;
		for (int x=0; x<ctx.formatValue().size(); x++){
			// Aqui se llena datos y datosTipos			
			if (visit(ctx.formatValue(x)).equals("_error_")){
				return "_error_";
			}
		}
		insertandoDatos = false;			
		
		
		
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa el tipo de la columna se va a agregar <>");
		}
		// Comprobar que el tipo de la columna sea el mismo que se va a agregar
		int x=0;
		while (x<datosTipos.size() && x<tiposReales.size()){
			String tipoAgregar = datosTipos.get(x);
			String tipoReal = tiposReales.get(x);	
			if (tipoAgregar.startsWith("char(") && tipoReal.startsWith("char(")){
				if (tamanoChar(tipoAgregar)>tamanoChar(tipoReal)){
					// Si el dato a agregar pasa el tamano maximo hay error
					agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"La cantidad de caracters es mayor a la permitida");
					return "_error_";
				}
			}else if(tipoAgregar.equals("float") && tipoReal.equals("int")){
				// Vebose
				if (bVerbose){
					System.out.println("Transformacion automatica de float a int");
				}
				// Se puede hacer conversion automatica, float a int
				datos.set(x, floatAInt(datos.get(x)));
				datosTipos.set(x, "int");
			}else if (tipoAgregar.equals("int") && tipoReal.equals("float")){
				// Vebose
				if (bVerbose){
					System.out.println("Transformacion automatica de int a float");
				}
				// Conversion automatica de int a float
				datos.set(x, intAFloat(datos.get(x)));
				datosTipos.set(x, "float");
			}
			else if(! tipoAgregar.equals(tipoReal) && !tipoAgregar.equalsIgnoreCase("null")){
				// Si son diferentes los tipos y no son char(NUM) hay error
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"La columna <"+columnas.get(x)+"> no es de tipo: "+tipoAgregar);
				return "_error_";
			}
			x++;
		}	
		

		// Revisamos las constraints
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que la primary key no sea null");
		}
		// La primary key no puede ser null
		ArrayList<ArrayList<String>> metaTabla = getTableMetadata();
		
		if (!archivoXMLTabla.getNombre().equals(nombreTabla)){
			archivoXMLTabla = new XMLFile(nombreTabla, pathCarpeta);
		}
		
		
		ArrayList<String> idColsPK = archivoXML.listaColsPK(nombreTabla);		
		datos = organizarDatos(columnasReales, columnas, datos);
		ArrayList<String> tuplaPK = new ArrayList<String>();
		for (x=0; x<idColsPK.size(); x++){
			String idColPk = idColsPK.get(x);
			int indiceCol = columnasReales.indexOf(idColPk);
			if (datos.get(indiceCol).equals("null")){
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"La columna <"+idColPk+"> no puede ser null");
				return "_error_";
			}
			else{
				tuplaPK.add(datos.get(indiceCol));
			}
		}
		
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que la primary key sea unica");
		}
		//Revisar que el PK sea unico		
		ArrayList<ArrayList<String>> tmpQuery = archivoXMLTabla.queryColumns(idColsPK);
		if(tuplaPK.size()>0 && tmpQuery.contains(tuplaPK)){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"Las columnas <"+idColsPK.toString()+"> deben tener valores unicos, la llave primaria <"+tuplaPK.toString()+"> ya existe");
			return "_error_";
		}
		
		// Vebose
		if (bVerbose){
			System.out.println("Se revisan que el insert no haga conflicto con las llaves foraneas");
		}
		//Revisar llaves foraneas  (0,3,4 en metaTabla)
		ArrayList<String> idColsFK = new ArrayList<String>();
		for(int i=0;i<columnasReales.size();i++){
			for(int j=0;j<metaTabla.size();j++){
				//Verificar si esa columna tiene FK
				if (columnasReales.get(i).equals(metaTabla.get(j).get(0)) && !metaTabla.get(j).get(4).equals("")){
					String col = columnasReales.get(i);
					int indiceCol = columnasReales.indexOf(col);
					ArrayList<String> dato = new ArrayList<String>();
					dato.add(datos.get(indiceCol));
					String referenciaCompleta = metaTabla.get(j).get(4);
					String[] ref = referenciaCompleta.split("\\.");
					String refTabla = ref[0];
					ArrayList<String> refColumna = new ArrayList<String>();
					refColumna.add(ref[1]);
					XMLFile archivoXMLRef = new XMLFile(refTabla, pathCarpeta);
					ArrayList<ArrayList<String>> tmpQueryFK = archivoXMLRef.queryColumns(refColumna);
					
					if (!tmpQueryFK.contains(dato)){
						agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine()," <"+metaTabla.get(j).get(4)+"> no contiene el valor <"+dato+">");
						return "_error_";
						
					}
					
					
				}
			}
		}
		
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que el insert no tenga conflicto con el check");
		}
		//CHECK 0,5,6 en metaTabla
		ArrayList<String> checkExpressions = new ArrayList<String>();
		
		for (int i=0;i<metaTabla.size();i++){
			if (!checkExpressions.contains(metaTabla.get(i).get(6)) && !metaTabla.get(i).get(6).equals("")){
				checkExpressions.add(metaTabla.get(i).get(6));
			}
		}
		
		evaluandoExp=true;
		
		ArrayList<String> sortedDatos = new ArrayList<String>();
		ArrayList<String> sortedColumns = new ArrayList<String>();
		int min=0;
		for (int k=0;k<columnasReales.size();k++){
			if(columnasReales.get(k).length()<=min){
				sortedColumns.add(columnasReales.get(k));
				min=columnasReales.get(k).length();
			}
			else{
				sortedColumns.add(0,columnasReales.get(k));
			}
		}
		
		for (int k=0;k<sortedColumns.size();k++){
			sortedDatos.add(datos.get(columnasReales.indexOf(sortedColumns.get(k))));
		}
		
		
		for(int j=0;j<checkExpressions.size();j++){
			String chexp =  checkExpressions.get(j);
			for (int k=0;k<sortedColumns.size();k++){
				if (chexp.contains(sortedColumns.get(k))){
					
					chexp = chexp.replace(sortedColumns.get(k), sortedDatos.get(k));
				}
			}
			
			ANTLRInputStream input = new ANTLRInputStream(chexp);
			SQLLexer lexer = new SQLLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			SQLParser parser = new SQLParser(tokens);
			ParseTree tree = parser.exp();  // parse exp; start a program
			DBVisitor visitor = new DBVisitor();
			visitor.setNombreBD(nombreBD);
			visitor.setPathBase(pathBase);
			visitor.setNombreTabla(nombreTabla);
			visitor.visit(tree);
			
			contextExp = visitor.getContextExp();
			if (visitExp(contextExp).equals("false")){
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine()," <"+contextExp.getText()+"> no cumple la condicion <"+checkExpressions.get(j)+">");
				return "_error_";
			}
		}
		evaluandoExp=false;
		
		
		// Vebose
		if (bVerbose){
			System.out.println("Se le suma a la cantidad de registros");
		}
		// Le sumamos uno a la cantidad de registros
		ArrayList<String> adentrar = new ArrayList<String>();
		adentrar.add("tabla");
		archivoXML.sumar1Atributo(adentrar, "nombreTabla", nombreTabla, "cantidadRegistros");
		// Ahora insertamos al archivo de la tabla la tupla
		if (!archivoXMLTabla.getNombre().equals(nombreTabla)){
			archivoXMLTabla = new XMLFile(nombreTabla, pathCarpeta);
		}
		archivoXMLTabla.add("tupla", columnasReales, datos);
		contadorInserts++;
		return "";
	}
	
	
	public String visitUpdate(SQLParser.UpdateContext ctx){
		nombreTabla = ctx.ID().getText();
		String pathCarpeta = pathBase+"\\"+nombreBD;
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que ya exista la tabla <"+nombreTabla+">");
		}
		File f = new File(pathCarpeta+"\\"+nombreTabla+".XML");
		if (! f.exists()){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No existe la tabla <"+nombreTabla+">");
			return "_error_";
		}
		
		archivoXML = new XMLFile("Metadata."+nombreBD, pathCarpeta);		
		
		ArrayList<String> columnasAsignacion = new ArrayList<String>();
		ArrayList<String> columnasTabla = archivoXML.listarColumnas(nombreTabla);
		
		datos = new ArrayList<String>();
		datosTipos =new ArrayList<String>();
		
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que las columnas sean de la tabla");
			System.out.println("Se revisa que las columnas no se repitan");
		}
		insertandoDatos = true;
		for(int i = 0; i<ctx.asignacion().size(); i++){
			if(!columnasTabla.contains(ctx.asignacion().get(i).ID().getText())){
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine()," <"+ctx.asignacion().get(i).ID().getText()+"> no es una columna de la tabla <"+nombreTabla+">");
				return "_error_";
			}
			if(columnasAsignacion.contains(ctx.asignacion().get(i).ID().getText())){
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine()," <"+ctx.asignacion().get(i).ID().getText()+"> la columna no se puede especificar dos veces");
				return "_error_";
			}
			columnasAsignacion.add(ctx.asignacion().get(i).ID().getText());
			String superVisit = visit(ctx.asignacion().get(i).literal().formatValue());
			if (superVisit.equals("_error_")){
				return "_error_";
			}
		}
		
		insertandoDatos = false;			
		
		ArrayList<String> tiposReales = archivoXML.listarTiposTabla(columnasAsignacion, nombreTabla);
		
		// Comprobar que el tipo de la columna sea el mismo que se va a agregar
		// Vebose
		if (bVerbose){
			System.out.println("Se comprueba que el tipo que se va a agregar sea el mismo que el de la columna");
		}
		int x=0;
		while (x<datosTipos.size() && x<tiposReales.size()){
			String tipoAgregar = datosTipos.get(x);
			String tipoReal = tiposReales.get(x);	
			if (tipoAgregar.startsWith("char(") && tipoReal.startsWith("char(")){
				if (tamanoChar(tipoAgregar)>tamanoChar(tipoReal)){
					// Si el dato a agregar pasa el tamano maximo hay error
					agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"La cantidad de caracters es mayor a la permitida");
					return "_error_";
				}
			}else if(tipoAgregar.equals("float") && tipoReal.equals("int")){
				// Se puede hacer conversion automatica, float a int
				datos.set(x, floatAInt(datos.get(x)));
				datosTipos.set(x, "int");
			}else if (tipoAgregar.equals("int") && tipoReal.equals("float")){
				// Conversion automatica de int a float
				datos.set(x, intAFloat(datos.get(x)));
				datosTipos.set(x, "float");
			}else if(! tipoAgregar.equals(tipoReal)){
				// Si son diferentes los tipos y no son char(NUM) hay error
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"La columna <"+columnasAsignacion.get(x)+"> no es de tipo: "+tipoAgregar);
				return "_error_";
			}
			x++;
		}
		
		
		// Revisamos las constraints
		// Vebose
		if (bVerbose){
			System.out.println("Se revisa que la primary key no sea null");
			System.out.println("Se revisa que la primary key sea unica");
		}
		// La primary key no puede ser null
		ArrayList<ArrayList<String>> metaTabla = getTableMetadata();
		if (!archivoXMLTabla.getNombre().equals(nombreTabla)){
			archivoXMLTabla = new XMLFile(nombreTabla, pathCarpeta);
		}
		ArrayList<String> idColsPK = archivoXML.listaColsPK(nombreTabla);		
		datos = organizarDatos(columnasAsignacion, columnasAsignacion, datos);
		ArrayList<String> tuplaPK = new ArrayList<String>();
		for (x=0; x<idColsPK.size(); x++){
			String idColPk = idColsPK.get(x);
			if (columnasAsignacion.contains(idColPk)){
				int indiceCol = columnasAsignacion.indexOf(idColPk);
				if (datos.get(indiceCol).equals("null")){
					agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"La columna <"+idColPk+"> no puede ser null");
					return "_error_";
				}
				else{
					tuplaPK.add(datos.get(indiceCol));
				}
			}
			
		}

		//Revisar que el PK sea unico
		ArrayList<ArrayList<String>> tmpQuery = archivoXMLTabla.queryColumns(idColsPK);
		if(tmpQuery.contains(tuplaPK)){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"Las columnas <"+idColsPK.toString()+"> deben tener valores unicos, la llave primaria <"+tuplaPK.toString()+"> ya existe");
			return "_error_";
		}
		
		if (bVerbose){
			System.out.println("Se revisa que la foreign key no sea null");
			System.out.println("Se revisa que la foreign key sea unica");
		}
		//Revisar llaves foraneas  (0,3,4 en metaTabla)
		for(int i=0;i<columnasAsignacion.size();i++){
			for(int j=0;j<metaTabla.size();j++){
				//Verificar si esa columna tiene FK
				if (columnasAsignacion.get(i).equals(metaTabla.get(j).get(0)) && !metaTabla.get(j).get(4).equals("")){
					String col = columnasAsignacion.get(i);
					int indiceCol = columnasAsignacion.indexOf(col);
					String dato = datos.get(indiceCol);
					String referenciaCompleta = metaTabla.get(j).get(4);
					String[] ref = referenciaCompleta.split("\\.");
					String refTabla = ref[0];
					ArrayList<String> refColumna = new ArrayList<String>();
					refColumna.add(ref[1]);
					XMLFile archivoXMLRef = new XMLFile(refTabla, pathCarpeta);
					ArrayList<ArrayList<String>> tmpQueryFK = archivoXMLRef.queryColumns(refColumna);
					if (!tmpQueryFK.contains(dato)){
						agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine()," <"+metaTabla.get(j).get(4)+"> no contiene el valor <"+dato+">");
						return "_error_";
					}
					
				}
			}
		}
		
		if (bVerbose){
			System.out.println("Se revisa que la informacion cumpla con el check");
		}
		//CHECK 0,5,6 en metaTabla
		ArrayList<String> checkExpressions = new ArrayList<String>();
		
		for (int i=0;i<metaTabla.size();i++){
			if (!checkExpressions.contains(metaTabla.get(i).get(6)) && !metaTabla.get(i).get(6).equals("")){
				checkExpressions.add(metaTabla.get(i).get(6));
			}
		}
		
		evaluandoExp=true;
		//Ordenar columnas para el replace
		ArrayList<String> sortedDatos = new ArrayList<String>();
		ArrayList<String> sortedColumns = new ArrayList<String>();
		int min=0;
		for (int k=0;k<columnasAsignacion.size();k++){
			if(columnasAsignacion.get(k).length()<=min){
				sortedColumns.add(columnasAsignacion.get(k));
				min=columnasAsignacion.get(k).length();
			}
			else{
				sortedColumns.add(0,columnasAsignacion.get(k));
			}
		}
		
		for (int k=0;k<sortedColumns.size();k++){
			sortedDatos.add(datos.get(columnasAsignacion.indexOf(sortedColumns.get(k))));
		}
		
		
		for(int j=0;j<checkExpressions.size();j++){
			String chexp =  checkExpressions.get(j);
			for (int k=0;k<sortedColumns.size();k++){
				if (chexp.contains(sortedColumns.get(k))){
					
					chexp = chexp.replace(sortedColumns.get(k), sortedDatos.get(k));
				}
			}
			
			ANTLRInputStream input = new ANTLRInputStream(chexp);
			SQLLexer lexer = new SQLLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			SQLParser parser = new SQLParser(tokens);
			ParseTree tree = parser.exp();  // parse exp; start a program
			DBVisitor visitor = new DBVisitor();
			visitor.setNombreBD(nombreBD);
			visitor.setPathBase(pathBase);
			visitor.setNombreTabla(nombreTabla);
			visitor.visit(tree);
			SQLParser.ExpContext checkContext = visitor.getContextExp();
			if (visitExp(checkContext).equals("false")){
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine()," <"+checkContext.getText()+"> no cumple la condicion <"+checkExpressions.get(j)+">");
				return "_error_";
			}
		}
		evaluandoExp=false;
		//Termina revision de check
		
		//TODO lo alegre
		int filasAfectadas = 0;
		SQLParser.ExpContext exp = null;
		boolean esTodo = false;
		try{
			exp = ctx.exp();
		}
		catch (Exception e){
		}
		if(exp==null){
			esTodo = true;
		}
		

		ArrayList<ArrayList<String>> queryTabla = archivoXMLTabla.queryColumns(columnasTabla);
		//
		ArrayList<ArrayList<String>> modificados = new ArrayList<ArrayList<String>>();
		if (esTodo){
			modificados = queryTabla;
		}
		else{
			visit(exp);
			for(int j=0;j<queryTabla.size();j++){
				if (checkTupla(queryTabla.get(j), columnasTabla, exp)){
					modificados.add(queryTabla.get(j));
				}
			}
		}
		//columnas = columnasTabla;
		//data = modificados;
		
		ArrayList<ArrayList<String>> nuevos = new ArrayList<ArrayList<String>>();
		
		
		
		for(int i=0;i<modificados.size();i++){
			ArrayList<String> tuplaVieja = modificados.get(i);
			ArrayList<String> tuplaNueva = new ArrayList<String>();
			
			for(int k=0;k<tuplaVieja.size();k++){
				tuplaNueva.add(tuplaVieja.get(k));
			}
			
			for(int j=0;j<datos.size();j++){
				tuplaNueva.set(columnasTabla.indexOf(columnasAsignacion.get(j)), datos.get(j));
			}
			nuevos.add(tuplaNueva);
		}
		
		//revisar que lo que se inserta no sean PKs repetidas
		if(nuevos.size()>1){
			for(int j=0;j<columnasAsignacion.size();j++){
				if(idColsPK.contains(columnasAsignacion.get(j))){
					agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine()," <"+columnasAsignacion.get(j)+"> es una llave primaria y hay mas de un elemento que cumple la condicion.");
					return "_error_";
				}
			}
		}
		
		
		//TODO revisar que lo que se inserta sea fk (en caso sea)
		
		
		for(int i=0;i<nuevos.size();i++){
			archivoXMLTabla.updateTupla(columnasTabla,modificados.get(i),nuevos.get(i));
		}
		contadorUpdates = nuevos.size(); 
		return "";
	}
	
	public String visitQuery(SQLParser.QueryContext ctx){
		listaTablas = new ArrayList<String>();
		archivoXML = new XMLFile("Metadata."+nombreBD, pathBase+"\\"+nombreBD+"\\");
		ArrayList<String> tablasDB = archivoXML.showTables();
		for(int i=0;i<ctx.ID().size();i++){
			if (tablasDB.contains(ctx.ID(i).getText())){
				listaTablas.add(ctx.ID(i).getText());
			}
			else{
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine()," <"+ctx.ID(i).getText()+"> no es una tabla de la base de datos.");
				return "_error_";
			}
		}
		ArrayList<ArrayList<ArrayList<String>>> crossProd = crossProduct(listaTablas);
		
		ArrayList<ArrayList<String>> columns = crossProd.get(0);
		ArrayList<ArrayList<String>> query = crossProd.get(1);
		//Organizar las columns (con tabla.columna), la tabla repetidas dice que columnas se repiten, para que si aparecen en el where, se genere un error
		ArrayList<String> colsQuery = new ArrayList<String>();
		ArrayList<String> colsPunto = new ArrayList<String>();
		ArrayList<String> repetidas = new ArrayList<String>();
		for(int i=0;i<columns.size();i++){
			for(int j=0;j<columns.get(i).size();j++){
				colsPunto.add(listaTablas.get(i)+"."+columns.get(i).get(j));
				boolean contieneDoble = false;
				for(int k=0;k<columns.size();k++){
					if (i!=k){
						if(columns.get(k).contains(columns.get(i).get(j))){
							contieneDoble=true;
							if (!repetidas.contains(columns.get(i).get(j))){
								repetidas.add(columns.get(i).get(j));
							}
							
						}
					}
				
				}
				if (contieneDoble){
					colsQuery.add(listaTablas.get(i)+"."+columns.get(i).get(j));
				}
				else{
					colsQuery.add(columns.get(i).get(j));
				}
				
			}
		}		
		/////// Revisar el SELECT columnas
		ArrayList<String> colsSelect = new ArrayList<String>();
		if (ctx.column().size()==0 || ctx.getChild(1).getText().equals("*")){
			colsSelect = colsQuery;
		}
		for (int i=0; i<ctx.column().size();i++){
			String columna = ctx.column(i).getText();				
			if(repetidas.contains(columna)){
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine()," <"+columna+"> es una columna que se encuentra en mas de una tabla, la consulta es ambigua.");
				return "_error_";
			}
			if(colsQuery.contains(columna)){
				colsSelect.add(columna);
			}
			else if(colsPunto.contains(columna)){
				colsSelect.add(columna);
			}
			else{
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine()," <"+columna+"> es una columna que no se encuentra en el listado de tablas proveidas.");
				return "_error_";
			}
		}
		///////////
		SQLParser.ExpContext exp = null;
		boolean expTodo = false;
		try{
			exp = ctx.exp();
		}
		catch (Exception e){
		}
		if(exp==null){
			expTodo = true;
		}
			
		//Where
		ArrayList<ArrayList<String>> modificados = new ArrayList<ArrayList<String>>();
		if (expTodo){
			for(int j=0;j<query.size();j++){
				ArrayList<String> tuplaFiltro = new ArrayList<String>();
				for(int k=0;k<colsSelect.size();k++){
					if(colsQuery.contains(colsSelect.get(k))){
						tuplaFiltro.add(query.get(j).get(colsQuery.indexOf(colsSelect.get(k))));
					}
					else{
						tuplaFiltro.add(query.get(j).get(colsPunto.indexOf(colsSelect.get(k))));
					}
				}
				
				modificados.add(tuplaFiltro);
			}
		}
		else{
			isSelect=true;
			visit(ctx.exp());
			isSelect=false;
			for(int j=0;j<query.size();j++){
				if (checkTuplaSelect(query.get(j), colsQuery, colsPunto, ctx.exp())){
					ArrayList<String> tuplaFiltro = new ArrayList<String>();
					for(int k=0;k<colsSelect.size();k++){
						if(colsQuery.contains(colsSelect.get(k))){
							tuplaFiltro.add(query.get(j).get(colsQuery.indexOf(colsSelect.get(k))));							
						}
						else{
							tuplaFiltro.add(query.get(j).get(colsPunto.indexOf(colsSelect.get(k))));
						}
					}
					
					modificados.add(tuplaFiltro);
				}
			}
		}
			
		//Order By
		ArrayList<Integer> listaOrderBy = new ArrayList<Integer>();
		ArrayList<String> sortType = new ArrayList<String>();
		for(int i=0; i<ctx.orderby().size();i++){
			if (colsSelect.contains(ctx.orderby(i).expresion().getText())){
				listaOrderBy.add(colsSelect.indexOf(ctx.orderby(i).expresion().getText()));
				if (ctx.orderby(i).K_DESC()==null){
					sortType.add("ASC");
				}
				else{
					sortType.add("DESC");
				}
			}
			else{
				agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine()," <"+ctx.orderby(i).expresion().getText()+"> no es una columna de la consulta.");
				return "_error_";
			}
		}
		if (!listaOrderBy.isEmpty()){
			if (bVerbose){
				System.out.println("Se verifica orden en la consulta");
			}
		}
		Collections.sort(modificados,new NuevoComparator(listaOrderBy,sortType));
		data = modificados;
		
		columnas = colsSelect;
		
		return "";
	}
	
	
	public String visitDelete(SQLParser.DeleteContext ctx){
		nombreTabla = ctx.ID().getText();
		String pathCarpeta = pathBase+"\\"+nombreBD;
		
		if (bVerbose){
			System.out.println("Se revisa que exista la tabla <"+nombreTabla+">");
		}
		File f = new File(pathCarpeta+"\\"+nombreTabla+".XML");
		if (! f.exists()){
			agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine(),"No existe la tabla <"+nombreTabla+">");
			return "_error_";
		}
		
		if (!archivoXMLTabla.getNombre().equals(nombreTabla)){
			archivoXMLTabla = new XMLFile(nombreTabla, pathCarpeta);
		}
		if (!archivoXML.getNombre().equals("Metadata."+nombreBD)){
			archivoXML = new XMLFile("Metadata."+nombreBD, pathCarpeta);
		}
				
		
		ArrayList<String> columnasTabla = archivoXML.listarColumnas(nombreTabla);
		ArrayList<String> tablas = archivoXML.showTables();
		
		// Vebose
		if (bVerbose){
			System.out.println("Se hacen revisiones respecto a llaves foraneas");
		}
//		//Revisar llaves foraneas  (que no sea FK de otra tabla) 4?
		//El primer item de cada de cada tupla colsRef es el nombre de la tabla que le hace referencia y el resto de items son las columnas que se necesitan de esa tabla
		//Sobre colsRef se hara la consulta en cada tabla para saber si el item a borrar es referenciado.
		ArrayList<ArrayList<String>> colsRef = new ArrayList<ArrayList<String>>();
		for(int i=0;i<tablas.size();i++){
			if(!nombreTabla.equals(tablas.get(i))){
				ArrayList<ArrayList<String>> fksTabla = archivoXML.listarConstraintsEspecificosTabla(tablas.get(i),"foreignKey");
				for (int j=0;j<fksTabla.get(0).size();j++){
					ArrayList<String> tuplaRef = new ArrayList<String>();
					ArrayList<String> colTabla = new ArrayList<String>();
					ArrayList<String> tablaRef = new ArrayList<String>();
					tablaRef.add(tablas.get(i));
					for (int k=0;k<fksTabla.get((2*j)+2).size();k++){
						String[] ref = fksTabla.get((2*j)+2).get(0).split("\\.");
						if(ref[0].equals(nombreTabla)){
							tuplaRef.add(ref[1]);
							colTabla.add(fksTabla.get((2*j)+1).get(0));
						}
					}
					if(tuplaRef.size()>0){
						colsRef.add(tablaRef);
						colsRef.add(colTabla);
						colsRef.add(tuplaRef);
					}
				}
			}
		}
		
		//lo alegre
		int filasAfectadas = 0;
		SQLParser.ExpContext exp = null;
		boolean esTodo = false;
		try{
			exp = ctx.exp();
		}
		catch (Exception e){
		}
		if(exp==null){
			esTodo = true;
		}
		ArrayList<ArrayList<String>> queryTabla = archivoXMLTabla.queryColumns(columnasTabla);
		ArrayList<ArrayList<String>> modificados = new ArrayList<ArrayList<String>>(); 
		if (esTodo){
				modificados=queryTabla;
		}
		else{
			visit(exp);
			for(int j=0;j<queryTabla.size();j++){
				if (checkTupla(queryTabla.get(j), columnasTabla, exp)){
					modificados.add(queryTabla.get(j));
					//delete
				}
			}
		}
		
		
		//Revisar fks de los consultados
		XMLFile archivoXMLRef = new XMLFile();
		for(int i=0;i<modificados.size();i++){
			for (int j=0;j<(colsRef.size()/3);j++){
				//Los nombres de las tablas estan en el multiplo de 3
				if (!archivoXMLRef.getNombre().equals(colsRef.get(j*3).get(0))){
					archivoXMLRef = new XMLFile(colsRef.get(j*3).get(0), pathCarpeta);
				}
				ArrayList<ArrayList<String>> queryRef = archivoXMLRef.queryColumns(colsRef.get(j*3+1));
				for(int k=0;k<queryRef.size();k++){			
					if(queryRef.get(k).contains(modificados.get(i).get(columnasTabla.indexOf(colsRef.get(j*3+2).get(0))))){
						agregarMensaje(ctx.start.getLine(), ctx.start.getCharPositionInLine()," <"+colsRef.get(j*3+2).get(0)+"="+modificados.get(i).get(columnasTabla.indexOf(colsRef.get(j*3+2).get(0)))+"> es referenciado en la tabla "+colsRef.get(j*3)+" y no se puede borrar");
						return "_error_";
					}
				}
				
			}
			
		}
		
		for(int i=0;i<modificados.size();i++){
			archivoXMLTabla.deleteTupla(columnasTabla, modificados.get(i));
			filasAfectadas++;
		}
		
		contadorDeletes = filasAfectadas;
		ArrayList<String> adentrar = new ArrayList<String>();
		adentrar.add("tabla");
		archivoXML.restarAtributo(adentrar, "nombreTabla", nombreTabla, "cantidadRegistros",filasAfectadas);
		
		return "";
	}
	
	public String visitFormatValue(SQLParser.FormatValueContext ctx){
		return super.visitFormatValue(ctx);		
	}
	
	public String visitEntero(SQLParser.EnteroContext ctx){
		// Si se estan insertando datos se coloca en datosTipos el tipo del dato
		if (insertandoDatos){
			datosTipos.add("int");
			datos.add(ctx.getText());
		}
		if (evaluandoExp){
			return ctx.getText();
		}
		else{
			return "int";
		}
		
	}
	
	public String visitDecimal(SQLParser.DecimalContext ctx){
		// Si se estan insertando datos se coloca en datosTipos el tipo del dato
		if (insertandoDatos){
			datosTipos.add("float");
			datos.add(ctx.getText());
		}
		if (evaluandoExp){
			return ctx.getText();
		}
		else{
			return "float";
		}
		
	}
	
	public String visitNullType(SQLParser.NullTypeContext ctx){
		return "null";
	} 
	
	public String visitFecha(SQLParser.FechaContext ctx){
		// Si se estan insertando datos se coloca en datosTipos el tipo del dato
		if (insertandoDatos){
			datosTipos.add("date");
			datos.add(ctx.getText());
		}
		
		if (evaluandoExp){
			return ctx.getText();
		}
		else{
			return "date";
		}
	}
	
	public String visitCharacter(SQLParser.CharacterContext ctx){
		// Si se estan insertando datos se coloca en datosTipos el tipo del dato
		if (insertandoDatos){
			String datoIng =ctx.getText(); 
			int tamano = datoIng.length() - 2;
			datosTipos.add("char("+tamano+")");			
			datos.add(datoIng);
		}
		if (evaluandoExp){
			return ctx.getText();
		}
		else{
			return "char";
		}
	}
	
	public int tamanoChar(String texto){
		String numero = texto.substring(5, texto.length()-1);
		return Integer.parseInt(numero);
	}
	
	public String floatAInt(String floatDato){
		String numero  = "";
		for (int i=0; i<floatDato.length(); i++){
			if (floatDato.charAt(i) != '.'){
				numero += floatDato.charAt(i);
			}else{
				break;
			}
		}
		return numero;
	}
	
	public String intAFloat(String intDato){			
		return intDato+".0";
	}

	
	public boolean crearCarpeta(String nombre){
		File f = new File(nombre);		
		return f.mkdir();
	}
	
	public ArrayList<String> organizarDatos(ArrayList<String> columnasReales, ArrayList<String> columnasInsertar, ArrayList<String> datosInsertar){
		ArrayList<String> datosOrdenados = new ArrayList<String>();
		// Necesitamos colocar los datos que ya se tiene en el orden de las columnasReales
		// Si no esta la columna se pone null
		for (int i=0; i<columnasReales.size(); i++){
			int indice = columnasInsertar.indexOf(columnasReales.get(i));
			// Si es -1 es que no lo encontro
			if (indice == -1){
				datosOrdenados.add("null");
			}else{
				try{
					datosOrdenados.add(datosInsertar.get(indice));
				}
				catch(Exception E){
					datosOrdenados.add("null");
				}
				
			}
		}
		return datosOrdenados;
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
	
	
	public ArrayList<ArrayList<String>> getTableMetadata(){
		ArrayList<String> cols = new ArrayList<String>();
		ArrayList<ArrayList<String>> datos = new ArrayList<ArrayList<String>>();
		cols.add("nombreColumna");
		cols.add("tipoDato");
		cols.add("primaryKey");
		cols.add("foreignKey");
		cols.add("referenciaFK");
		cols.add("check");
		cols.add("expresion");
		tablaCols = archivoXML.listarColumnas(nombreTabla);
		ArrayList<ArrayList<String>> listaConstraintsPK = archivoXML.listarConstraintsEspecificosTabla(nombreTabla,"primaryKey");
		ArrayList<ArrayList<String>> listaConstraintsFK = archivoXML.listarConstraintsEspecificosTabla(nombreTabla,"foreignKey");
		ArrayList<ArrayList<String>> listaConstraintsCHK = archivoXML.listarConstraintsEspecificosTabla(nombreTabla,"check");
		//datos.add(cols);
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
			for (int j=0;j<listaConstraintsPK.get(0).size();j++){
				if(listaConstraintsPK.get(j+1).contains(tablaCols.get(i))){
					PK = listaConstraintsPK.get(0).get(j);
				}
			}
			//Foreign Keys
			for (int j=0;j<listaConstraintsFK.get(0).size();j++){
				if(listaConstraintsFK.get((2*j)+1).contains(tablaCols.get(i))){
					FK = listaConstraintsFK.get(0).get(j);
					FKref = listaConstraintsFK.get((2*j)+2).get(listaConstraintsFK.get((2*j)+1).indexOf(tablaCols.get(i)));
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
			datos.add(tupla);
		}
		return datos;
	}
	
	public boolean checkTupla(ArrayList<String> tupla, ArrayList<String> columnas, SQLParser.ExpContext expresion){
		evaluandoExp=true;
		//Ordenar columnas para el replace
		ArrayList<String> sortedDatos = new ArrayList<String>();
		ArrayList<String> sortedColumns = new ArrayList<String>();
		int min=0;
		for (int k=0;k<columnas.size();k++){
			if(columnas.get(k).length()<=min){
				sortedColumns.add(columnas.get(k));
				min=columnas.get(k).length();
			}
			else{
				sortedColumns.add(0,columnas.get(k));
			}
		}
		
		for (int k=0;k<sortedColumns.size();k++){
			sortedDatos.add(tupla.get(columnas.indexOf(sortedColumns.get(k))));
		}
		
		
		int a = expresion.start.getStartIndex();
	    int b = expresion.stop.getStopIndex();
	    Interval interval = new Interval(a,b);	
	    String chexp = expresion.start.getInputStream().getText(interval);
		
//		String chexp =  expresion.getText();
		for (int k=0;k<sortedColumns.size();k++){
			if (chexp.contains(sortedColumns.get(k))){
				
				chexp = chexp.replace(sortedColumns.get(k), sortedDatos.get(k));
			}
		}
		
		
		
		ANTLRInputStream input = new ANTLRInputStream(chexp);
		SQLLexer lexer = new SQLLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SQLParser parser = new SQLParser(tokens);
		ParseTree tree = parser.exp();  // parse exp; start a program
		DBVisitor visitor = new DBVisitor();
		visitor.setNombreBD(nombreBD);
		visitor.setPathBase(pathBase);
		visitor.setNombreTabla(nombreTabla);
		visitor.setArchivoXML(archivoXML);
		visitor.setEvaluandoExp(true);
		visitor.visit(tree);
		SQLParser.ExpContext checkContext = visitor.getContextExp();
		
		if (visitExp(checkContext).equals("false")){
			evaluandoExp=false;
			return false;
		}else{
			evaluandoExp=false;
			return true;
		}
	}
	
	public boolean checkTuplaSelect(ArrayList<String> tupla, ArrayList<String> columnasQuery, ArrayList<String> columnasPunto, SQLParser.ExpContext expresion){
		evaluandoExp=true;
		//Ordenar columnas para el replace
		ArrayList<String> sortedDatos = new ArrayList<String>();
		ArrayList<String> sortedColumnsQ = new ArrayList<String>();
		ArrayList<String> sortedColumnsP = new ArrayList<String>();
		int min=0;
		for (int k=0;k<columnasQuery.size();k++){
			if(columnasQuery.get(k).length()<=min){
				sortedColumnsQ.add(columnasQuery.get(k));
				sortedColumnsP.add(columnasPunto.get(k));
				min=sortedColumnsQ.get(k).length();
			}
			else{
				sortedColumnsQ.add(0,columnasQuery.get(k));
				sortedColumnsP.add(0,columnasPunto.get(k));
			}
		}
		
		for (int k=0;k<sortedColumnsQ.size();k++){
			sortedDatos.add(tupla.get(columnasQuery.indexOf(sortedColumnsQ.get(k))));
		}
		
		
		
		int a = expresion.start.getStartIndex();
	    int b = expresion.stop.getStopIndex();
	    Interval interval = new Interval(a,b);	
	    String chexp = expresion.start.getInputStream().getText(interval);
		
		for (int k=0;k<sortedColumnsP.size();k++){
			if (chexp.contains(sortedColumnsP.get(k))){
				chexp = chexp.replace(sortedColumnsP.get(k), sortedDatos.get(k));
			}
		}
		for (int k=0;k<sortedColumnsQ.size();k++){
			if (chexp.contains(sortedColumnsQ.get(k))){
				chexp = chexp.replace(sortedColumnsQ.get(k), sortedDatos.get(k));
			}
		}
		
		
		
		ANTLRInputStream input = new ANTLRInputStream(chexp);
		SQLLexer lexer = new SQLLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SQLParser parser = new SQLParser(tokens);
		ParseTree tree = parser.exp();  // parse exp; start a program
		DBVisitor visitor = new DBVisitor();
		visitor.setNombreBD(nombreBD);
		visitor.setPathBase(pathBase);
		visitor.setNombreTabla(nombreTabla);
		visitor.setArchivoXML(archivoXML);
		visitor.setEvaluandoExp(true);
		visitor.visit(tree);
		SQLParser.ExpContext checkContext = visitor.getContextExp();
		if (visitExp(checkContext).equals("false")){
			evaluandoExp=false;
			return false;
		}else{
			evaluandoExp=false;
			return true;
		}
	}
	
	
	public ArrayList<ArrayList<ArrayList<String>>> crossProduct(ArrayList<String> tablas){
		
		String pathCarpeta = pathBase+"\\"+nombreBD;
		if (!archivoXML.getNombre().equals("Metadata."+nombreBD)){
			archivoXML = new XMLFile("Metadata."+nombreBD, pathCarpeta);
		}
		
		ArrayList<ArrayList<ArrayList<String>>> result = new ArrayList<ArrayList<ArrayList<String>>>();
		ArrayList<ArrayList<String>> columnas = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> tuplas = new ArrayList<ArrayList<String>>();
				
		
		for(int i=0;i<tablas.size();i++){
			XMLFile tabla = new XMLFile(tablas.get(i), pathCarpeta);
			ArrayList<String> colsTabla = archivoXML.listarColumnas(tablas.get(i));
			ArrayList<ArrayList<String>> queryTabla = tabla.queryColumns(colsTabla);
			ArrayList<ArrayList<String>> temp = new ArrayList<ArrayList<String>>();
			if(i==0){
				temp.addAll(queryTabla);
			}
			else{
				for(int j=0;j<tuplas.size();j++){
					for(int k=0;k<queryTabla.size();k++){
						ArrayList<String> tuplaNueva = new ArrayList<String>(tuplas.get(j));
						tuplaNueva.addAll(queryTabla.get(k));
						temp.add(tuplaNueva);
					}
					
					
				}
			}
			tuplas = new ArrayList<ArrayList<String>>();
			tuplas.addAll(temp);
			columnas.add(colsTabla);
			
		}
		
		result.add(columnas);
		result.add(tuplas);
		return result;
	}
	
	
	
}
