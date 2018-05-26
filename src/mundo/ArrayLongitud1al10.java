package mundo;
import java.util.*;

public class ArrayLongitud1al10 {
	
	public static void main(String[] args){
	Scanner sc  = new Scanner(System.in);
	System.out.println("Inserte una longitud: ");
	int longitud=sc.nextInt();
	int numeros[]= new int[longitud];
	int num;
	for (int i = 0; i < numeros.length; i++) {
		System.out.println("Inserte un numero en la posicion "+i);
		
		do {
			num =sc.nextInt();
			if (!(num>=0 && num<=10)) {
				System.out.println("Error. Solo numeros del 0 al 10 "+
			" Inserte un numero en la posicion "+i);
			}
		} while (!(num>=0 && num<=10));
		
		numeros[i] = num;
	}
	//Este codigo muestra los numeros insertados
	System.out.println("Estos son los numeros elegidos por el usuario");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}
