package Loja;

public abstract class Veiculo {
	
	private String marca;
	private String modelo;
	private int ano;
	private int velocidadeAtual;
	
	public Veiculo(String marca, String modelo, int ano){
		
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.velocidadeAtual = 0;
	}
	
	public abstract void descricao();
	
	public abstract void acelerar();
	
	public abstract void frear();
	
	public String getMarca() {
		
		return this.marca;
		
	}
	
	public String getModelo() {
		
		return this.modelo;
		
	}
	
	public int getAno() {
	
		return this.ano;
	
	}
	
	public int getVelocidadeAtual() {
		
		return this.velocidadeAtual;
		
	}
	
	public void setVelocidadeAtual(int velocidadeAtual) {
		
		this.velocidadeAtual = velocidadeAtual;
		
	}

}