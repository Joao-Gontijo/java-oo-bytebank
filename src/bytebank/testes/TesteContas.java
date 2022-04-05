package bytebank.testes;

import bytebank.exception.SaldoInsuficienteException;
import bytebank.model.ContaCorrente;
import bytebank.model.ContaPoupanca;

public class TesteContas {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(100, 100);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(200, 200);
		cp.deposita(200);
		
		try {
			cc.transfere(100, cp);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}
}
