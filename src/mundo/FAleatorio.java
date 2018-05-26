package mundo;

public class FAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min= 0;
		int max=10;
		
		for (int i = 0; i < 100; i++) {
			System.out.println(generarNumAle(min, max));	
		}
		
		
		

	}
	
	public static int generarNumAle(int min, int max){
		return (int)Math.floor(Math.random()*(min-(max+1))+(max+1)); 
	}

}
