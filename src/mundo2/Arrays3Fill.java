package mundo2;
import java.util.Arrays;
public class Arrays3Fill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[10];
		Arrays.fill(num, 20);
		Arrays.fill(num, 3, 5, -1);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
