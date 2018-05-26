package mundo;

public class F2NumeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(esPrimo(3));
	}
	
	public static boolean esPrimo(int num){
		if (num<=1){
			return false;
		}
		
		for (int i = (int)Math.sqrt(num); i> 1; i--) {
			if (num%i ==0) {
				return false;
			}
		}
		return true;
	}
}
