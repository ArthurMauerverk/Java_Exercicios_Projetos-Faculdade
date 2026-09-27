/*Exercício 5 referente a lista da aula 2.*/

package Exercícios;

public class Produto_main {

	public static void main(String[] main) {
		
		Produto objeto1 = new Produto();
		Produto objeto2 = new Produto();
		
		objeto1.produto(1, "Computador" , 4500.00);
		objeto2.produto(2, "Moto", 20000.00);
		
		objeto1.exibirDetalhes();
		objeto2.exibirDetalhes();
		
		objeto1.aplicarDesconto(0.1);
		objeto2.aplicarDesconto(0.15);
		
		System.out.println("+++++++++++++++ Preços Atualizados +++++++++++++++\n");
		
		objeto1.exibirDetalhes();
		objeto2.exibirDetalhes();
		
		
	}
	
}
