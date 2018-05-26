package mundo2;

public class Arrays4Burbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = {1,4,5,3,2,6,7,9,8};
		ordenacionBurbuja(numeros);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
	
	public static void ordenacionBurbuja(int lista[]){
		int cuentaIntercambios = 0;
		for (boolean ordenado = false;!ordenado;) {
			for (int i = 0; i < lista.length-1; i++) {
				if(lista[i]>lista[i+1]){
					int aux = lista[i];
					lista[i] = lista[i+1];
					lista[i+1]=aux;
					cuentaIntercambios++;
				}
			}
			if(cuentaIntercambios == 0){
				ordenado = true;
			}
			
			cuentaIntercambios= 0;
		}
	}

}
