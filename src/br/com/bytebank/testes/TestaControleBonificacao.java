package br.com.bytebank.testes;

import br.com.bytebank.ControleBonificacao;
import br.com.bytebank.model.Faxineiro;
import br.com.bytebank.model.Funcionario;
import br.com.bytebank.model.Gerente;

public class TestaControleBonificacao {

	public static void main(String[] args) {
		Gerente gr = new Gerente();
		gr.setSalario(1000);
		System.out.println(gr.getBonificacao());
		
		Funcionario fc = new Gerente();
		fc.setSalario(1000);
		System.out.println(fc.getBonificacao());
		
		Faxineiro fx = new Faxineiro();
		fx.setSalario(1000);
		System.out.println(fx.getBonificacao());
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gr);
		controle.registra(fc);
		controle.registra(fx);
		
		System.out.println(controle.getSoma());
	}
	
	
}
