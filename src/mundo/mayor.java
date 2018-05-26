package mundo;
import java.util.*;
public class mayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("ingrese el primer numero: ");
		num1 = sc.nextInt();
		System.out.println("ingrese el segundo numero: ");
		num2= sc.nextInt();
		
		if(num1<=num2){
			if(num1 == num2){
				System.out.println("son iguales");
			}else{
				System.out.println("el segundo numero es mayor");
				
			}
		}else{
			System.out.println("el primer numero es mayor");
			
		}
		
	}

}
