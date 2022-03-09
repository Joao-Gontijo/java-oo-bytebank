package bytebank;

import bytebank.model.Cliente;
import bytebank.model.Conta;

public class TestaClasses {
	public static void main(String[] args) {
		
		Conta contaAna = new Conta();
		Cliente ana = new Cliente();
		
		contaAna.setTitular(ana);
		contaAna.getTitular().setNome("Ana");
		System.out.println(ana.getNome());
		
		Conta contaJoao = new Conta();
		
		contaJoao.setTitular(new Cliente());
		contaJoao.getTitular().setNome("João");
		System.out.println(contaJoao.getTitular().getNome());
	}
}
