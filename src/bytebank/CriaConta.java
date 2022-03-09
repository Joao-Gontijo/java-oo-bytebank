package bytebank;

import bytebank.model.Conta;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(200);
		
		System.out.println(primeiraConta.getSaldo());
		primeiraConta.deposita(100);
		
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta();
		segundaConta.deposita(primeiraConta.getSaldo() + 100);
		
		System.out.println(segundaConta.getSaldo());
	}
	
}
