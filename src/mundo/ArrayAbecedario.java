package mundo;

import java.util.Scanner;

public class ArrayAbecedario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//restamos la posicion mayor (z, añadiendole 1) a la posicion menor
		char abecedario[] = new char[91-65];
		for (int i = 65, indice=0; i < 91; i++,indice++) {
			abecedario[indice]=(char)i;
			//System.out.println(abecedario[indice]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte un numero entre 0 y "+(abecedario.length-1)+". -1 para acabar");
		int num= sc.nextInt();
		String cadena ="";
		
		while (num!=-1) {
			
			if (num>= 0 && num<abecedario.length) {
				cadena+= abecedario[num];
				System.out.println("Inserte un numero entre 0 y "+(abecedario.length-1)+". -1 para acabar");
			}else {
				System.out.println("Numero no valido inserte un numero entre 0 y "+(abecedario.length-1)+". -1 para acabar");
			}
			num= sc.nextInt();
			
		}
		System.out.println("La cadena resultante es : "+cadena);
	}

}
