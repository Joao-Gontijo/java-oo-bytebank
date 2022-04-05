package br.com.bytebank.testes;

import br.com.bytebank.SistemaInterno;
import br.com.bytebank.model.Gerente;

public class TestaSistema {
	
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
	}
}

