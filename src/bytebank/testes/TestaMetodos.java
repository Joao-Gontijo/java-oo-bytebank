package bytebank.testes;

import bytebank.exception.SaldoInsuficienteException;
import bytebank.model.Conta;
import bytebank.model.ContaCorrente;

public class TestaMetodos {
	
	public static void main(String[] args) {
		
		Conta contaDoJoao = new ContaCorrente(1010, 55667);
		contaDoJoao.deposita(100);
		System.out.println("Conta do João " + contaDoJoao.getSaldo());
		
		try {
			contaDoJoao.saca(50);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		System.out.println("fazendo saque");
		System.out.println("Conta do João " + contaDoJoao.getSaldo());
		
		Conta contaDaAna = new ContaCorrente(1020, 11234);
		contaDaAna.deposita(1000);
		System.out.println("Conta da Ana " + contaDaAna.getSaldo());
		
		try {
			contaDaAna.transfere(50, contaDoJoao);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		System.out.println("Depois da transferencia");
		System.out.println("Conta do João " + contaDoJoao.getSaldo());
		System.out.println("Conta da Ana " + contaDaAna.getSaldo());
	}
}
