package br.com.bytebank.testes.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.model.Conta;
import br.com.bytebank.model.ContaCorrente;
import br.com.bytebank.model.ContaPoupanca;

public class TestaOrdenacaoLista {
	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(22, 22);
		cc1.deposita(333);
		
		Conta cp1 = new ContaPoupanca(22, 55);
		cp1.deposita(777);
		
		Conta cc2 = new ContaCorrente(22, 11);
		cc2.deposita(111);
	
		Conta cp2 = new ContaPoupanca(22, 44);
		cp2.deposita(222);
	
		
		List<Conta> lista = new ArrayList<Conta>();
		lista.add(cc1);
		lista.add(cp1);
		lista.add(cc2);
		lista.add(cp2);
		
		lista.sort(new NumeroDaContaComparator());
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}
}

class NumeroDaContaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		return c1.getNumero() - c2.getNumero();
	}
	
}
