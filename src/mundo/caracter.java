package mundo;

import java.util.Scanner;

public class caracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduzca un numero: ");
		int num = sc.nextInt();
		
		char caracter = (char)num;
		
		System.out.println("su numero "+num+" pertenece al caracter: '"+caracter+"'");

	}

}
