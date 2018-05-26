package mundo2;

import java.util.Scanner;

public class MatriznxnSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Ingrese un tama�o para su matriz: ");
		int tama�o = sc.nextInt();
		
		int matriz1[][]= new int [tama�o][tama�o];
		int matriz2[][]= new int [tama�o][tama�o];
		int resultado[][]= new int [tama�o][tama�o];
		
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz2[0].length; j++) {
				System.out.println("Escriba el valor para la fila "+i+" y columna "+j+" de la matriz 1");
				matriz1[i][j]= sc.nextInt();
				System.out.println("Escriba el valor para la fila "+i+" y columna "+j+" de la matriz 2");
				matriz2[i][j]= sc.nextInt();
				
				resultado[i][j]= matriz1[i][j]+matriz2[i][j];
			}
		}
		System.out.println("La matriz 1 es: ");
		mostrarMatriz(matriz1);
		System.out.println("La matriz 2 es: ");
		mostrarMatriz(matriz2);
		System.out.println("El resultado de la suma de las matrices es: ");
		mostrarMatriz(resultado);
	}
	
	public static void mostrarMatriz(int[][] matriz){
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			
			System.out.println("");
		}
	}

}
