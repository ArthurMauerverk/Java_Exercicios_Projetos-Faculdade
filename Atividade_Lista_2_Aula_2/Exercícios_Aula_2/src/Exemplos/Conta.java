package Exemplos;

public class Conta {

	int numero;
	String nome_titular;
	double saldo;
	
	void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
}
