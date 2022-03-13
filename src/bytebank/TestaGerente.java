package bytebank;

import bytebank.model.Gerente;

public class TestaGerente {
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		
		gerente.setNome("João");
		gerente.setSalario(5000);
		gerente.setSenha(1234);
		
		System.out.println(gerente.autentica(1234));
	}
}
