package mundo;
import java.util.*;
public class otrasuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero mayor a 1: ");
		int num;
		do{
			num = sc.nextInt();
			if(num<=1){
				System.out.println("Error. el numero que ingreso no es correcto."
						+" Vuelva a intentarlo");
			}
		}while(num<=1);
			int suma = 0;
			
			for(int contador=1;contador<=num; contador++){
				suma+= contador;
			}
			System.out.println("la suma es: "+suma);
		}
	}


