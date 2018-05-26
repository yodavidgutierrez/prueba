package mundo;

public class ArraySuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[20];
		int suma=0;
		double media=0;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]= i+1;
			suma = suma+ numeros[i];
		}
		System.out.println("La suma es: "+suma);
		media= (double)suma/numeros.length;
		System.out.println("La media es: "+media);
	}

}
