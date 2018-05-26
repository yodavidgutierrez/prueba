package mundo;
import java.util.*;
public class FSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("Ingrese el primer numero a sumar");
		num1 = sc.nextInt();
		System.out.println("Ingrese el segundo numero a sumar");
		num2 = sc.nextInt();
		int resultado =sumaNumeros(num1, num2);
		System.out.println("el primer numero es: "+num1);
		System.out.println("el segundo numero es: "+num2);
		System.out.println("el la suma entre ellos es: "+resultado);
	}
	public static int sumaNumeros(int a, int b){
		int suma = a+b;
		
		return suma;
		
	}
}
