/*Exercício referente a lista da aula 2.*/

package Exercícios;

public class Exercicio4 {

	public static void main(String[] args) {
		
		String frase = " Programação Orientada a Objetos com Java ";
		
		System.out.println(frase);
		
		frase = frase.trim();
		
		System.out.println("Frase com espaços do inicio e fim removidos: " + frase);
		
		System.out.println("Quantidade de caracteres da frase: " + frase.length());
		
		System.out.println("A frase toda em maiuscula: " + frase.toUpperCase());
		
		frase = frase.replace("Java", "Linguagem Java");
		
		System.out.println(frase);
		
		System.out.println("Caractere localizado na posição de indice 5 da frase: " + frase.charAt(5));
			
	}
}