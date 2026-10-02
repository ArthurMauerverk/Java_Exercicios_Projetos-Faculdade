package Loja;

public class Carro extends Veiculo{

	public Carro(String marca, String modelo, int ano) {
		
		super(marca, modelo, ano);
		
	}
	
	@Override
	public void descricao() {
		
		System.out.println("DESCRIÇÃO DO VEICULO");
		System.out.println("Veículo: Carro");
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Ano: " + getAno());
		
	}
	
	@Override
	public void acelerar() {
		
		int novaVelocidade = getVelocidadeAtual() + 20;
		setVelocidadeAtual(novaVelocidade);
		System.out.println("O carro acelerou!");
		System.out.println("Velocidade atual: " + getVelocidadeAtual() + " Km/h");
		
	}
	
	@Override
	public void frear() {
		
		int novaVelocidade = getVelocidadeAtual() - 15;
		
		if (novaVelocidade < 0) {
			
			novaVelocidade = 0;
		}
		
		setVelocidadeAtual(novaVelocidade);
		System.out.println("O carro freou!");
		System.out.println("Velocidade atual: " + getVelocidadeAtual() + " Km/h");
		
	}
	
}