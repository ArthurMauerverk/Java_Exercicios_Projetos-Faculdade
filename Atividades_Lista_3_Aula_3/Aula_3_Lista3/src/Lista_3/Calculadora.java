package Lista_3;

public class Calculadora {

	public int somar(int a, int b) {
		
		int soma = a + b;
		return soma;
		
	}
	
	public double somar(double a, double b) {
		
		double soma = a + b;
		return soma;
		
	}
	
	public int somar(int a, int b, int c) {
		
		int soma = a + b + c;
		return soma;
		
	}
	
	public static void main(String[] args) {
		
		Calculadora soma = new Calculadora();
		
		System.out.println("Soma de dois inteiros (1 + 2): " + soma.somar(1, 2));
		System.out.println("Soma de dois flutuantes (1.5 + 2.5): " + soma.somar(1.5, 2.5));
		System.out.println("Soma de três inteiros (1 + 2 + 5): " + soma.somar(1, 2, 5));
		
	}
	
}