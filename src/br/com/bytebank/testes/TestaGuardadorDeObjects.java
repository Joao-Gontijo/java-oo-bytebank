package br.com.bytebank.testes;

import br.com.bytebank.GuardadorDeObject;
import br.com.bytebank.model.Conta;
import br.com.bytebank.model.ContaCorrente;
import br.com.bytebank.model.ContaPoupanca;

public class TestaGuardadorDeObjects {
	public static void main(String[] args) {
		
		GuardadorDeObject object = new GuardadorDeObject();
		
		ContaCorrente cc = new ContaCorrente(1, 2);
		object.adicionar(cc);
		
		ContaPoupanca cp = new ContaPoupanca(3, 4);
		object.adicionar(cp);
		
		Conta conta = new ContaCorrente(5, 6);
		object.adicionar(conta);
		
		int tamanho = object.getQuantidadeDeItens();
		System.out.println(tamanho);
		
		Object ref = object.getReferencia(0);
		System.out.println(ref);
		
		Conta referencia = (Conta) object.getReferencia(1);
		System.out.println(referencia.getNumero());
	}
}
