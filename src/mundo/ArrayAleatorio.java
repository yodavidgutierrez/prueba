package mundo;
import java.util.*;

import java.util.Scanner;

public class ArrayAleatorio {

	public static void main (String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Inserte una longitud: ");
		int longitud=sc.nextInt();
		int numeros[]= new int[longitud];
		int num;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = generarNumAle(0, 10);
			
			System.out.println("En la posicion "+i+" esta el valor: "+numeros[i]);
		}
	}
	
	public static int generarNumAle(int min, int max){
		return (int)Math.floor(Math.random()*(min-(max+1))+(max+1)); 
	}

}
