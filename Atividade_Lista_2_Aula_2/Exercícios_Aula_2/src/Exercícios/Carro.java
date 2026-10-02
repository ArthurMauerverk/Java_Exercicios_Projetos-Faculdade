/*Crie uma classe chamada Carro com os seguintes atributos: marca (String), 
modelo (String), ano (int). Adicione um método exibirInfo() que imprime as 
informações do carro. No método main, crie duas instâncias de Carro e chame o 
método exibirInfo() para cada uma.*/

package Exercícios;

public class Carro {

	String marca;
	String modelo;
	int ano;
	
	public void exibirInfo() {
		
		System.out.println("Marca do carro: " + marca);
		System.out.println("Modelo do carro: " + modelo);
		System.out.println("Ano do carro: " + ano);
		System.out.println("--------------------------------------------------------------------");
		
	}
	
	public void carro(String marca_p, String modelo_p, int ano_p) {
		
		this.marca = marca_p;
		this.modelo = modelo_p;
		this.ano = ano_p;
		
	}
	
}
