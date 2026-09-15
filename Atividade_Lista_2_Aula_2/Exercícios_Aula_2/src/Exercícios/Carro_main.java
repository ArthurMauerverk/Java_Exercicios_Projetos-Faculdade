/*Crie uma classe chamada Carro com os seguintes atributos: marca (String), 
modelo (String), ano (int). Adicione um método exibirInfo() que imprime as 
informações do carro. No método main, crie duas instâncias de Carro e chame o 
método exibirInfo() para cada uma.*/

package Exercícios;

public class Carro_main {

	public static void main(String[] args) {
		
		Carro user = new Carro();
				
		user.carro("Toyota", "Corolla", 2024);
		
		Carro user2 = new Carro();
		
		user2.carro("Ford", "Mustang", 2023);
		
		user.exibirInfo();
		
		user2.exibirInfo();
	
	}
	
}