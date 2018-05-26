package mundo;

import java.util.Scanner;

public class palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print("ingrese una palabra palindroma: ");
		String palabra = sc.nextLine();
		String nombre= "";
		
		 for (int i = palabra.length() - 1; i >= 0; i--) { 
	            nombre = nombre + palabra.charAt(i); 
	        } 
	        if (palabra.equals(nombre)) { 
	            System.out.println("La palabra es palindroma");  
	        } else{
	        	 System.out.println("La palabra no es palindroma");
	        }
	}

}
