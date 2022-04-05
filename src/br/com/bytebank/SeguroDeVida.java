package br.com.bytebank;

import br.com.bytebank.interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 42;
	}

}
