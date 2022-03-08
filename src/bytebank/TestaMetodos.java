package bytebank;

import bytebank.model.Conta;

public class TestaMetodos {
	
	public static void main(String[] args) {
		
		Conta contaDoJoao = new Conta();
		contaDoJoao.deposita(100);
		System.out.println("Conta do João " + contaDoJoao.saldo);
		
		contaDoJoao.saca(50);
		System.out.println("fazendo saque");
		System.out.println("Conta do João " + contaDoJoao.saldo);
		
		Conta contaDaAna = new Conta();
		contaDaAna.deposita(1000);
		System.out.println("Conta da Ana " + contaDaAna.saldo);
		
		contaDaAna.transfere(50, contaDoJoao);
		System.out.println("Depois da transferencia");
		System.out.println("Conta do João " + contaDoJoao.saldo);
		System.out.println("Conta da Ana " + contaDaAna.saldo);
	}
}
