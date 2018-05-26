package mundo;

public class Array1al100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[] es la posicion del array 
		int[] numeros = new int[200];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]= i+1;
			System.out.println(numeros[i]);
		}
	}

}
