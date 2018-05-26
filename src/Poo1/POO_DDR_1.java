package Poo1;

public class POO_DDR_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro1 = new Libro(321, "java para inteligentes", "EL julian", 562);
		Libro libro2 = new Libro(321, "Angular para inteligentes", "EL david", 422);
		
		
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		if (libro1.getNumeroDePaginas()>libro2.getNumeroDePaginas()) {
			System.out.println(libro1.getTitulo()+" Tiene mas paginas que "+libro2.getTitulo());
		}else{
			System.out.println(libro2.getTitulo()+" Tiene mas paginas que "+libro1.getTitulo());
		}
	}

}
