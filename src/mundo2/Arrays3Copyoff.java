package mundo2;
import java.util.*;
public class Arrays3Copyoff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[10];
		Arrays.fill(num, 1);
		int num2[] = Arrays.copyOf(num, 12);
		//int num2[] = Arrays.copyOfRange(num, 2, 9);
		
		for (int i = 0; i < num2.length; i++) {
			System.out.println(num2[i]);
		}
	}

}
