package br.com.bytebank.testes.util;

import java.util.ArrayList;
import java.util.Iterator;

import br.com.bytebank.especial.ContaEspecial;
import br.com.bytebank.model.Conta;
import br.com.bytebank.model.ContaCorrente;
import br.com.bytebank.model.ContaPoupanca;

public class TestaArrayListEquals {
	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta ce = new ContaEspecial(10, 20);
		Conta cc = new ContaCorrente(0, 0);
		Conta cp = new ContaPoupanca(0, 0);
		
		lista.add(ce);
		lista.add(cc);
		
		boolean existe = lista.contains(cp);
		System.out.println(existe);
		
		for (Conta conta: lista) {
			System.out.println("Número da conta: " + conta.getNumero());
		}
		
	}
}
