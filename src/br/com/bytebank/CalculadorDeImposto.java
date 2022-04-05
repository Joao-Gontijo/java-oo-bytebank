package br.com.bytebank;

import br.com.bytebank.interfaces.Tributavel;

public class CalculadorDeImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		System.out.println(totalImposto);
		double valor = t.getValorImposto();
		this.totalImposto =+ valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}
