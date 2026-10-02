package Loja;

import java.util.ArrayList;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		
		ArrayList<Veiculo> lista = new ArrayList<Veiculo>();
		
		Carro carro = new Carro("Toyota", "Corolla", 2022);
		
		lista.add(carro);
		
		Moto moto = new Moto("Honda", "CB 500F", 2021);
		
		lista.add(moto);
		
		Caminhao caminhao = new Caminhao("Volvo", "FH 540", 2023);
		
		lista.add(caminhao);
		
		CarroEsportivo esportivo = new CarroEsportivo("Ferrari","Ferrari vermelha", 2025);
		
		lista.add(esportivo);
		
		Iterator i = lista.iterator(); 
		
		Veiculo veiculo;
		
		while (i.hasNext()) {
			
			veiculo = (Veiculo) i.next();
			
			veiculo.descricao();
			
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
			
			System.out.println("Velocidade Atual: " + veiculo.getVelocidadeAtual());
			
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
			
			veiculo.acelerar();
			
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
			
			veiculo.frear();
			
			System.out.println("----------------------------------------------------------------\n");
			
		}
		
	}
	
}
