package br.com.bytebank.testes.util;

import java.util.ArrayList;
import java.util.Iterator;

import br.com.bytebank.especial.ContaEspecial;
import br.com.bytebank.model.Conta;
import br.com.bytebank.model.ContaCorrente;
import br.com.bytebank.model.ContaPoupanca;

public class TestaArrayList {
	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta ce = new ContaEspecial(10, 20);
		Conta cc = new ContaCorrente(0, 0);
		Conta cp = new ContaPoupanca(1, 1);
		
		lista.add(ce);
		lista.add(cc);
		lista.add(cp);
		
		Conta ref = lista.get(1);
		System.out.println(ref);
		
		System.out.println("Tamanho: " + lista.size());
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("-------");
		
		for (Conta conta: lista) {
			System.out.println("Número da conta: " + conta.getNumero());
		}
		
	}
}
