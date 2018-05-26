package mundo;

import java.util.Scanner;

public class F2Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Ingrese un numero para hallar su factorial: ");
		num = sc.nextInt();
		System.out.println("El factorial de "+num+" es "+(factorial(num)));
	}
	public static int factorial(int numero){
		if (numero<0) {
			System.out.println("No se puede calcular el factorial"
					+ " de un numero negativo");
			return -1;
		}if (numero == 0 || numero == 1) {
			return 1;
		}
		
		int resultado = numero;
		for (int i = (numero-1); i >1; i--) {
			resultado*= i;
		}
		
		
		return resultado;
	}

}
