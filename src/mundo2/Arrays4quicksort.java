package mundo2;

public class Arrays4quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = {1,4,5,3,2,6,7,9,8};
		ordenacionQuicksort(numeros,0,numeros.length-1);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

	}

	private static void ordenacionQuicksort(int[] array, int izq, int der) {
		// TODO Auto-generated method stub
		int i=izq;
		int j=der;
		int pivote = array[(i+j)/2];
		
		do {
			while(array[i]<pivote){
				i++;
			}
		    while (array[j]>pivote){
		    	j--;
		    }
		    
		    if (i<=j) {
		    	int aux= array[i];
		    	array[i]=array[j];
		    	array[j]= aux;
		    	i++;
		    	j--;
				
			}
		}while(i<=j);
		
		if (izq<j) {
			ordenacionQuicksort(array, izq, j);
		}
		
		if (i<der) {
			ordenacionQuicksort(array, i, der);
		}
	}
}
