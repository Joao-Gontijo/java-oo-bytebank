package bytebank;

import bytebank.model.Cliente;
import bytebank.model.Conta;

public class TestaClasses {
	public static void main(String[] args) {
		
		Conta contaAna = new Conta();
		Cliente ana = new Cliente();
		
		contaAna.titular = ana;
		contaAna.titular.nome = "Ana";
		System.out.println(ana.nome);
		
		Conta contaJoao = new Conta();
		
		contaJoao.titular = new Cliente();
		contaJoao.titular.nome = "João";
		System.out.println(contaJoao.titular.nome);
	}
}
