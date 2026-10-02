package Loja;

public class CarroEsportivo extends Veiculo{
	
	public CarroEsportivo(String marca, String modelo, int ano) {
		
		super(marca, modelo, ano);
		
	}
	
	@Override
	public void descricao() {
		
		System.out.println("DESCRIÇÃO DO VEICULO");
		System.out.println("Veículo: Carro Esportivo");
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Ano: " + getAno());
		
	}
	
	@Override
	public void acelerar() {
		
		int novaVelocidade = getVelocidadeAtual() + 50;
		setVelocidadeAtual(novaVelocidade);
		System.out.println("O carro esportivo acelerou!");
		System.out.println("Velocidade atual: " + getVelocidadeAtual() + " Km/h");
		
	}
	
	@Override
	public void frear() {
		
		int novaVelocidade = getVelocidadeAtual() - 30;
		
		if (novaVelocidade < 0) {
			
			novaVelocidade = 0;
		}
		
		setVelocidadeAtual(novaVelocidade);
		System.out.println("O carro esportivo freou!");
		System.out.println("Velocidade atual: " + getVelocidadeAtual() + " Km/h");
		
	}
	

}
