package mundo;

import java.util.Arrays;

public class Array2Capicua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = {9,0,0,9};
		int aux[] = new int [numeros.length];
		for (int i = numeros.length-1, j = 0; i>=0; i--,j++) {
			aux[j] = numeros[i];	
			System.out.println(aux[j]);
		}
		
		if (Arrays.equals(numeros, aux)) {
			
			System.out.println("Es Capicua");
			
		} else {
			System.out.println("No es Capicua");
		}
	}

}
