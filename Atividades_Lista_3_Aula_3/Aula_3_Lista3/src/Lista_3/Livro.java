package Lista_3;

public class Livro {

	private String titulo;
	private String autor;
	
	public Livro() {
		
		this.titulo = "xxxxxxxxx";
		this.autor = "xxxxxxxxx";
		
	}
	
	public Livro(String titulo, String autor) {
		
		this.titulo = titulo;
		this.autor = autor;
		
	}
	
	
	public static void main(String[] args) {
		
		Livro obj1 = new Livro();
		Livro obj2 = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis");
		
		System.out.println("Titulo: " + obj1.titulo);
		System.out.println("Autor: " + obj1.autor);
		System.out.println("------------------------------");
		System.out.println("Titulo: " + obj2.titulo);
		System.out.println("Autor: " + obj2.autor);
		
		
	}
	
}
