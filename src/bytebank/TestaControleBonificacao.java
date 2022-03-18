package bytebank;

import bytebank.model.Faxineiro;
import bytebank.model.Funcionario;
import bytebank.model.Gerente;

public class TestaControleBonificacao {

	public static void main(String[] args) {
		Gerente gr = new Gerente();
		gr.setSalario(1000);
		System.out.println(gr.getBonificacao());
		
		Funcionario fc = new Funcionario();
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
