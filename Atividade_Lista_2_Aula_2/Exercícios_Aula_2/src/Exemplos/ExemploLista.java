package Exemplos;

import java.util.ArrayList;
import java.util.Iterator;

public class ExemploLista {

	public static void main(String[] args){
		
		ArrayList lista = new ArrayList();
		
		Conta c = new Conta();
		c.numero = 2;
		lista.add(c);
		
		c = new Conta();
		c.numero = 1;
		lista.add(0, c);
		
		c = new Conta();
		c.numero = 3;
		lista.add(c);
		
		Iterator i = lista.iterator();
		
		while(i.hasNext()) {
			
			c = (Conta) i.next();
			System.out.println("Conta numero: " + c.numero);
			
		}
		
	}
	
}