package CreateAndaWritteFicheros;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readFichero1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "";
		int c;
		try {
			FileReader fr= new FileReader("C:\\Users\\David\\Desktop\\adv\\holamundo.txt");
			while((c=fr.read()) != -1){
				cadena += (char)c;
			}
		} catch (IOException ex) {
			// TODO: handle exception
			System.out.print(ex+"error fichero.");
		}
		System.out.println("El contenido del fichero es: "+ cadena);

	}

}
