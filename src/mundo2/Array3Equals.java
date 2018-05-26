package mundo2;
import java.util.*;

public class Array3Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1[] = new int [10];
		int num2[] = new int [11];
		if (Arrays.equals(num1, num2)) {
			System.out.println("los arreglos son iguales");
		}else {
			System.out.println("los arreglos no son iguales");
		}
	}

}
