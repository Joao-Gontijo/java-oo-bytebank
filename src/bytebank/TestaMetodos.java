package bytebank;

import bytebank.model.Conta;

public class TestaMetodos {
	
	public static void main(String[] args) {
		
		Conta contaDoJoao = new Conta(1010, 55667);
		contaDoJoao.deposita(100);
		System.out.println("Conta do João " + contaDoJoao.getSaldo());
		
		contaDoJoao.saca(50);
		System.out.println("fazendo saque");
		System.out.println("Conta do João " + contaDoJoao.getSaldo());
		
		Conta contaDaAna = new Conta(1020, 11234);
		contaDaAna.deposita(1000);
		System.out.println("Conta da Ana " + contaDaAna.getSaldo());
		
		contaDaAna.transfere(50, contaDoJoao);
		System.out.println("Depois da transferencia");
		System.out.println("Conta do João " + contaDoJoao.getSaldo());
		System.out.println("Conta da Ana " + contaDaAna.getSaldo());
	}
}
