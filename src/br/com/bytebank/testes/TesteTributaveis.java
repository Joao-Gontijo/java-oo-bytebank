package br.com.bytebank.testes;

import br.com.bytebank.CalculadorDeImposto;
import br.com.bytebank.SeguroDeVida;
import br.com.bytebank.model.ContaCorrente;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100,100);
		cc.deposita(1000);
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		calc.registra(cc);
		System.out.println(calc.getTotalImposto());
		
		calc.registra(seguro);
		System.out.println(calc.getTotalImposto());
	}

}
