package mundo;
import java.util.*;
public class FMayorque0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero:");
		int num = sc.nextInt();
		
		if(mayorQue0(num)){
			System.out.println("El numero "+num+" es mayor que cero");
		}else{
			System.out.println("El numero "+num+" es menor o igual que cero");
		}
	}
	public static boolean mayorQue0(int num){
		return num>0;
	}
}
