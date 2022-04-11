package br.com.bytebank.testes.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.model.Cliente;
import br.com.bytebank.model.Conta;
import br.com.bytebank.model.ContaCorrente;
import br.com.bytebank.model.ContaPoupanca;

public class TestaOrdenacaoLista {
	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Conta cp1 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Gabriel");
		cp1.setTitular(clienteCC2);
		cc1.deposita(444.0);

		Conta cc2 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("João");
		cc2.setTitular(clienteCC3);
		cc2.deposita(111.0);

		Conta cp2 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cp2.setTitular(clienteCC4);
		cp2.deposita(222.0);
	
		
		List<Conta> lista = new ArrayList<Conta>();
		lista.add(cc1);
		lista.add(cp1);
		lista.add(cc2);
		lista.add(cp2);
		
//		lista.sort(new NumeroDaContaComparator());
		lista.sort(new TitularDaContaComparator());
		
		for (Conta conta : lista) {
			System.out.println("Titular: " + conta.getTitular().getNome() + " - " + conta);
		}
	}
}

class NumeroDaContaComparator implements Comparator<Conta>{
	@Override
	public int compare(Conta c1, Conta c2) {
		return c1.getNumero() - c2.getNumero();
	}
}

class TitularDaContaComparator implements Comparator<Conta>{
	
	@Override
	public int compare(Conta c1, Conta c2) {
		String nome1 = c1.getTitular().getNome();
		String nome2 = c2.getTitular().getNome();
		return nome1.compareTo(nome2);
	}
}