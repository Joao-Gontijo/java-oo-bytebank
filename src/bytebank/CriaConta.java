package bytebank;

import bytebank.model.Conta;
import bytebank.model.ContaCorrente;
import bytebank.model.ContaPoupanca;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new ContaPoupanca(1010, 55667);
		primeiraConta.deposita(200);
		
		System.out.println(primeiraConta.getSaldo());
		primeiraConta.deposita(100);
		
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new ContaCorrente(1010, 44890);
		segundaConta.deposita(primeiraConta.getSaldo() + 100);
		
		System.out.println(segundaConta.getSaldo());
	}
	
}
