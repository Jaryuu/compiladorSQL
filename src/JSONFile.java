import java.io.*;


public class JSONFile {
	
	private String nombre;
	private String path;
	private File archivo;
	
	public JSONFile(String nombre, String path){
		this.nombre = nombre;
		this.path = path;
		// Se revisa si ya existe el archivo, si no existe se crea
		archivo = new File(path+"\\"+nombre+".JSON");
		boolean existe = archivo.exists();
		try{
			if (existe){
				archivo.createNewFile();				
			}else{
				FileWriter fw = new FileWriter(archivo.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write("{\n\""+nombre+"\" : [\n]\n}");
				bw.close();
				System.out.println("Se creo el archivo: "+archivo.getAbsolutePath());
			}
		}catch (IOException e){
			e.printStackTrace();
		}
		
	}
	
	public void add(String contenido){
		// El contenido no viene con {}
		// Encontramos la linea donde se puede colocar el nuevo contenido
		String contenidoNuevo = "";
		try{
			FileReader fr = new FileReader(path+"\\"+nombre+".JSON");
			BufferedReader br = new BufferedReader(fr);
			String line;
			int contLlaves = 0;
			while ((line = br.readLine()) != null){		
				if (line.startsWith("{")){
					contLlaves ++;	
				}
				if (line.endsWith("]")){	
					if (contLlaves > 1){
						contenidoNuevo+=",\n";
					}
					// Aqui agrego el nuevo contenido
					contenidoNuevo += "{"+contenido+"\n}\n";
				}
				contenidoNuevo+=line;
				if (! line.endsWith("}")){
					contenidoNuevo+="\n";
				}
			}
			createFile(path+"\\"+nombre+".JSON", contenidoNuevo);
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public void createFile(String path, String contenido){
		try{
			archivo = new File(path);
			FileWriter fw = new FileWriter(archivo.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(contenido);
			bw.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public void cambiarNombre(String nuevoNombre){
		String contenidoNuevo = "";
		try{
			FileReader fr = new FileReader(path+"\\"+nombre+".JSON");
			BufferedReader br = new BufferedReader(fr);
			String line;
			int contLlaves = 0;		
			boolean adentro = false;
			while ((line = br.readLine()) != null){
				if (contLlaves == 1){
					for (int i=0; i<line.length(); i++){
						char c = line.charAt(i);
						// El primer "
						if (c == '"' && ! adentro){		
							adentro = true;
							contenidoNuevo +="\"";
							contenidoNuevo+=nuevoNombre;
						}else if (c == '"' && adentro){							
							adentro = false; 
						}
						if (!adentro){
							contenidoNuevo += c;
						}
					}
				}else{						
					contenidoNuevo+=line;					
				}
				if (line.startsWith("{")){
					contLlaves ++;	
				}	
				if (! line.endsWith("}")){
					contenidoNuevo+="\n";
				}				
			}
			br.close();
			createFile(path+"\\"+nuevoNombre+".JSON", contenidoNuevo);
			File borrar = new File(path+"\\"+nombre+".JSON");
			borrar.delete();
			
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
