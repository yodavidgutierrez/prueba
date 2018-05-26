package mundo;

import java.util.Scanner;

public class Array2StringAChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Ingrese una cadena de texto: ");
		String frase = sc.next();
		
		char caracteres[] = new char[frase.length()];
		
		for (int i = 0; i < frase.length(); i++) {
			caracteres[i]= frase.charAt(i);
			
			System.out.println(caracteres[i]);
		}
		
	}

}
