package Lista_3_Atividade_7;

public class CDs extends Produto{

	private int numFaixas;
	
	public CDs() {}
	
	public CDs(String nome, double preco, int numFaixas, int codigoBarra) {
		
		super(nome, codigoBarra, preco);
		this.numFaixas = numFaixas;
		
	}
	
	@Override
	public String toString() {
		
		return ("CD -> Nome: " + getNome() + "; Numero de Faixas: " + this.numFaixas + "; " + "Preço: " + getPreco());
		
	}
	
	
	
	
}
