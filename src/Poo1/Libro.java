package Poo1;

public class Libro {
	private int ISBN;
	private String titulo;
	private String autor;
	private int numeroDePaginas;

	public Libro(){
		
	}
	
	public Libro(int pISBN, String pTitulo, String pAutor, int pNumeroDePaginas){
		this.ISBN = pISBN;
		this.titulo = pTitulo;
		this.autor= pAutor;
		this.numeroDePaginas = pNumeroDePaginas;
	}
	public int getISBN() {
		return ISBN;
	}
	
	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor; 
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	@Override
	public String toString(){
		return "El libro "+titulo+" con ISBN "+ISBN+" creado por el autor"+autor+" tiene "+numeroDePaginas+" numero de pagginas";
		
	}
}
