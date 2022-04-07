package br.com.bytebank.testes;

import br.com.bytebank.model.ContaCorrente;

public class TestaArrayReferencias {
	public static void main(String[] args) {
		
		ContaCorrente[] contas = new ContaCorrente[3];
		
		ContaCorrente cc1 = new ContaCorrente(10, 20);
		ContaCorrente cc2 = new ContaCorrente(30, 40);
		
		contas[0] = cc1;
		contas[1] = cc2;
	
		System.out.println(contas[0].getNumero());
	}
}
