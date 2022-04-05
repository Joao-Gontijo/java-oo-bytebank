package br.com.bytebank;

import br.com.bytebank.model.Funcionario;

public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario f) {
		double bonificacao = f.getBonificacao();
		this.soma += bonificacao;
	}
	
	public double getSoma() {
		System.out.println("----- Total -----");
		return soma;
	}
}
