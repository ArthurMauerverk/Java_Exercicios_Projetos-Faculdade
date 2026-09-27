package Lista_3;

public class Aluno extends Pessoa{

	private long matricula;
	
	public Aluno() {
		
		super("XXXXXXXXX", 0);
		this.matricula = 0;
		
	}
	
	public Aluno(String nome, int idade, long matricula) {
		
		super(nome, idade);
		this.matricula = matricula;
		
	}
	
	public long getMatricula() {
		
		return this.matricula;
		
	}
	
	public void setMatricula(long matricula) {
		
		this.matricula = matricula;
		
	}
	
	public static void main(String[] args) {
		
		Aluno obj1 = new Aluno("Arthur", 22, 202311722043L);
		
		System.out.println("Nome: " + obj1.getNome());
		System.out.println("Idade: " + obj1.getIdade());
		System.out.println("Matricula: " + obj1.matricula);
		
		System.out.println("--------------------------------------------------------------------------");
		
		Aluno obj2 = new Aluno();
		
		obj2.setMatricula(201588022046L);
		obj2.setNome("Junior");
		obj2.setIdade(18);
		System.out.println("Nome: " + obj2.getNome());
		System.out.println("Idade: " + obj2.getIdade());
		System.out.println("Matricula: " + obj2.getMatricula());
				
	}
	
}
