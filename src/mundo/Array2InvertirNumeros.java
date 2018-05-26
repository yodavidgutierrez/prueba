package mundo;

public class Array2InvertirNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = {1,2,3,4,5};
		int aux[]= new int[numeros.length];
		for (int i = numeros.length-1, j = 0; i>=0; i--,j++) {
			aux[j] = numeros[i];
			
			System.out.println(aux[j]);
		}
	}

}
