package br.com.bytebank.testes;

import br.com.bytebank.model.Conta;
import br.com.bytebank.model.ContaCorrente;
import br.com.bytebank.model.ContaPoupanca;

public class TestaArrayReferencias {
	public static void main(String[] args) {
		
//		ContaCorrente[] contas = new ContaCorrente[3];
		Conta[] contas = new Conta[3];
		
		ContaCorrente cc1 = new ContaCorrente(10, 20);
		ContaPoupanca cc2 = new ContaPoupanca(30, 40);
		
		contas[0] = cc1;
		contas[1] = cc2;
	

		ContaCorrente ref = (ContaCorrente) contas[0];
		
		System.out.println(contas[0].getNumero());
		System.out.println(contas[1].getAgencia());
		System.out.println(ref.getNumero());
	}
}
