package mundo2;

import java.util.Scanner;

public class MatrizRellenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la longitud para las columnas: ");
		int colum = sc.nextInt();
		int matriz[][] = new int [5][colum];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j]= generarNumAle(0, 10);
				System.out.print(matriz[i][j]+" ");
			}
			
			System.out.println("");
		}
	}
	
	public static int generarNumAle(int min, int max){
		return (int)Math.floor(Math.random()*(min-(max+1))+(max+1)); 
	}
}
