import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;



public class DBVisitor extends SQLBaseVisitor<String>{
	
	private ArrayList<String> mensajes;
	private JSONFile archivoJSON;
	private String pathBase, nombreBD;
	private boolean exitoCarpeta;
	String contenido;
	
	public ArrayList<String> getMensajes() {
		return mensajes;
	}

	public void setMensajes(ArrayList<String> mensajes) {
		this.mensajes = mensajes;
	}

	public String visitTodo(SQLParser.TodoContext ctx){
		// Se crean los atributos
		mensajes = new ArrayList<String>();
		boolean success = crearCarpeta("BaseDeDatos");
		pathBase = "BaseDeDatos\\";		
		if (!success) {
		    System.out.println("Ya existe la carpeta");
		    archivoJSON = new JSONFile("MetadataBaseDeDatos", pathBase);
		}else{
			archivoJSON = new JSONFile("MetadataBaseDeDatos", pathBase);
			// Se crea el JSON de metadata			
			System.out.println("Se creó la carpeta BaseDeDatos");
		}
		
		return super.visitTodo(ctx);
		
	}
	
	public String visitCreateDB(SQLParser.CreateDBContext ctx){
		String nombreBD = ctx.ID().getText();		
		exitoCarpeta = crearCarpeta(pathBase+nombreBD);
		archivoJSON = new JSONFile(nombreBD, pathBase+"\\"+nombreBD+"\\");
		// Si se crea la carpeta es que no existe la base de datos
		if (exitoCarpeta){
			// Se agrega a la metadata
			archivoJSON = new JSONFile("MetadataBaseDeDatos", pathBase);
			contenido = "\"nombre\":\""+nombreBD+"\",\n\"registros\":0";
			archivoJSON.add(contenido);
		}else{
			mensajes.add("Ya existe la base de datos <"+nombreBD+">");
		}
		return "";
	}
	
	public String visitDropDB(SQLParser.DropDBContext ctx){
		nombreBD = ctx.ID().getText();
		File folder = new File(pathBase+"\\"+nombreBD);
		if (folder.exists()){
			deleteFolder(folder);
			borrarBD(nombreBD);
		}else{
			System.out.println(folder.getAbsolutePath());
			mensajes.add("No existe la base de datos <"+nombreBD+">");
		}		
		return "";
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
			archivoJSON = new JSONFile("metadataBaseDeDatos", pathBase);
			cambiarNombreBD(nuevoNombre,nombreViejo);
			// cambiamos el nombre de la carpeta			
			f.renameTo(new File(pathBase+"\\"+nuevoNombre));
			// Cambiamos el JSON interno
			archivoJSON = new JSONFile(nombreViejo, pathBase+"\\"+nuevoNombre+"\\");
			archivoJSON.cambiarNombre(nuevoNombre);					
		}
		
		return "";
	}
	
	public boolean crearCarpeta(String nombre){
		File f = new File(nombre);		
		return f.mkdir();
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
		try{
			FileReader fr = new FileReader(pathBase+"\\"+"MetadataBaseDeDatos.JSON");
			BufferedReader br = new BufferedReader(fr);
			String line;
			int iLinea=1000, fLinea=-1;			
			int contLineas = 0, lineaComa=-1, lineaCorchete=-1;
			boolean ignorar = false;
			while ((line = br.readLine()) != null){
				if (line.startsWith("{" )&& ! ignorar){
					iLinea = contLineas;
				}
				if (line.contains("\"nombre\":\""+nombre+"\"")){							
					ignorar = true;
				}
				if ((line.equals("}") || line.equals("},")) && ignorar){
					fLinea = contLineas;
					ignorar = false;
					// Para que no pase que ponga un }, al final
					line = br.readLine();
					if (line.equals("]")){
						lineaCorchete=contLineas+1;
					}
					break;
				}else if (line.equals("},")){
					lineaComa = contLineas;
				}
				contLineas++;
			}
			br.close();
			fr = new FileReader(pathBase+"\\"+"MetadataBaseDeDatos.JSON");
			br = new BufferedReader(fr);
			String nuevoString = "";
			contLineas = 0;
			boolean comaBo= false;
			while ((line = br.readLine()) != null){
				if (contLineas<iLinea || contLineas>fLinea){
					if (contLineas == lineaComa && (contLineas == iLinea-1) && (lineaCorchete != -1)){
						line = line.replace(",", "");
					}
					if (line.endsWith("},")){
						comaBo = true;
					}
					if (line.startsWith("]") && comaBo){
						nuevoString+="\n";
					}
					nuevoString +=line;
					if (! line.endsWith("}")){
						nuevoString+="\n";
					}					
				}
				contLineas ++;
			}
			br.close();		
			archivoJSON.createFile(pathBase+"\\"+"MetadataBaseDeDatos.JSON", nuevoString);
			
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	// Para cambiar el nombre de la base de datos
	public void cambiarNombreBD(String nuevo, String viejo){
		try{
			FileReader fr = new FileReader(pathBase+"\\"+"MetadataBaseDeDatos.JSON");
			BufferedReader br = new BufferedReader(fr);
			String line, contenido="";
			boolean ignorar = false;
			while ((line = br.readLine()) != null){
				if (line.contains("\"nombre\":\""+viejo+"\"")){
					contenido+="{\"nombre\":\""+nuevo+"\",";
				}else{
					contenido+=line;
				}
				if (! line.endsWith("}")){
					contenido+="\n";
				}	
			}
			br.close();			
			archivoJSON.createFile(pathBase+"\\"+"MetadataBaseDeDatos.JSON", contenido);
			
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
