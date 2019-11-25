import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class LectorDeArchivos {
	
	public static void leerArchivo(){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:\\\\Users\\\\mayra\\\\Desktop\\\\ISC\\\\5to semestre\\\\Algoritmos\\\\Proyecto Salvando Vidas Algoritmos\\\\src/ejemploVuelos.csv"));
			String line = br.readLine();
			
			while(line!=null) {
				System.out.println(line);
		
				
				line = br.readLine();
			}
			
		}catch (IOException e) {
			
		}finally {
			try {
				if(br != null) {
					br.close();
				}
			}catch(IOException ex){
			}
		}
	}
	

	public static void main(String[] args) {
		leerArchivo();
	}

}
