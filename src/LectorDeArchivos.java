import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class LectorDeArchivos {
	public static final String separador = ",";
	public static final String quote = "\"";
	public static void main(String[] args) {
//		BufferedReader br = null;
//		try {
//			String strCurrentLine;
//			br = new BufferedReader(new FileReader("C:\\Users\\mayra\\Desktop\\ISC\\5to semestre\\Algoritmos\\Proyecto Salvando Vidas Algoritmos\\src/ejemploVuelos.csv"));
//			while((strCurrentLine = br.readLine() )!= null) {
//				System.out.println(strCurrentLine);
//			}
//		} catch(IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(br != null) {
//					br.close();
//				}
//				}catch(IOException ex) {
//					ex.printStackTrace();
//			}
//		}
		
		
		// segundo ejemplo
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:\\\\Users\\\\mayra\\\\Desktop\\\\ISC\\\\5to semestre\\\\Algoritmos\\\\Proyecto Salvando Vidas Algoritmos\\\\src/ejemploVuelos.csv"));
			String line = br.readLine();
			while(line!=null) {
				String[] fields = line.split(separador);
				System.out.println(Arrays.toString(fields));
				
				fields = removeTrailingQuotes(fields);
				//System.out.println(fields);
				
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
//	
	}
	private static String[] removeTrailingQuotes(String[] fields) {
		String result[] = new String[fields.length];
		for (int i=0;i<result.length;i++){
	         result[i] = fields[i].replaceAll("^"+quote, "").replaceAll(quote+"$", "");
	      }
		return result;
	}
}
