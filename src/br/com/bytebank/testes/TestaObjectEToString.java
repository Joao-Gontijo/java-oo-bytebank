package br.com.bytebank.testes;

import br.com.bytebank.model.ContaCorrente;
import br.com.bytebank.model.ContaPoupanca;

public class TestaObjectEToString {
	public static void main(String[] args) {
		Object cc = new ContaCorrente(100, 200);
		Object cp = new ContaPoupanca(101, 202);
		
		//método toString é omitido da chamada, mas pode ser chamado
		System.out.println(cc);
		System.out.println(cp.toString());
	}
}
