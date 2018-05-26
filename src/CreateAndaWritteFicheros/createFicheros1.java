package CreateAndaWritteFicheros;

import java.io.FileWriter;
import java.io.IOException;

public class createFicheros1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//o tambien puedo poner el filewriter dentro del try asi "try(FileWriter fw= new FileWriter("C:\\Users\\David\\Desktop\\adv\\holamundo.txt")){}"
		try {
			FileWriter fw= new FileWriter("C:\\Users\\David\\Desktop\\adv\\holamundo.txt", true);
			fw.write("\n David el makia");
			fw.close();
		} catch (IOException ex) {
			// TODO: handle exception
			System.out.print(ex+"error fichero.");
		}
	}

}
