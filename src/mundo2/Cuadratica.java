package mundo2;

import java.util.Scanner;

public class Cuadratica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese los valores de a, b y c para formular cuadratica: ");
		System.out.println("a: ");
		double a = sc.nextDouble();
		System.out.println("b: ");
		double b = sc.nextDouble();
		System.out.println("c: ");
		double c = sc.nextDouble();
		double x1= cuadratica1(a,b,c);
		double x2= cuadratica2(a, b, c);
		
		if(x1!=0){
			System.out.println("El resultado para x1 es: "+x1);
		}else{
			
			System.out.println("La ecuacion no tiene resultado.");
		}
		
		if(x2!=0){
			System.out.println("El resultado para x1 es: "+x2);
		}else{
			
			System.out.println("La ecuacion no tiene resultado.");
		}
		
	}
	
	public static double cuadratica1(double a, double b, double c){
		double part1 = -b;
		double part2 =(b*b)-(4*a*c);
		double part3= Math.sqrt(part2);
		double part4 = 2*(a);
		if(part2 <=0){
			return 0;
			
		}else{
			double resultado = ((part1+part3)/part4);
			return resultado;
		}
		
		
		
	}
	public static double cuadratica2(double a, double b, double c){
		double part1 = -b;
		double part2 =(b*b)-(4*a*c);
		double part3= Math.sqrt(part2);
		double part4 = 2*(a);
		if(part2<=0){
			return 0;
		}else{
			double resultado = ((part1-part3)/part4);
			return resultado;
			
		}
	}

}
