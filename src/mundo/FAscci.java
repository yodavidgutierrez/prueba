package mundo;
public class FAscci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracter = '#';
		int ascci = devuelveCodigoASCII(caracter);
		System.out.println("el caracter '"+caracter+"' pertenece al numero "+ascci);
	}
	public static int devuelveCodigoASCII(char caracter){
		 return (int)caracter;
	}

}
