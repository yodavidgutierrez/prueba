package mundo2;
import java.util.*;
public class Arrays3Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int [5];
		num[0]=2;
		num[1]=3;
		num[2]=4;
		num[3]=1;
		num[4]=8;
		
		Arrays.sort(num);
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
