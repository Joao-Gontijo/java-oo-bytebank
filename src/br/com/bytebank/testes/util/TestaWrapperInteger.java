package br.com.bytebank.testes.util;

import java.util.ArrayList;
import java.util.List;

public class TestaWrapperInteger {
	public static void main(String[] args) {
		
		Integer idadeRef = 29;
		int primitivo = new Integer(30);
		
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(idadeRef);
		lista.add(primitivo);
		
		int i1 = lista.get(0);
		int i2 = lista.get(1);
		
		System.out.println(i1);
		System.out.println(i2);
		
		Integer valorRef = Integer.valueOf(31);
		System.out.println(valorRef); //imprime direto o valor também
		int valorPri = valorRef.intValue();
		System.out.println(valorPri);
		
		Integer iParseado1 = Integer.valueOf("32");
		int iParseado2 = Integer.parseInt("33");
		
		System.out.println(iParseado1);
		System.out.println(iParseado2);
		
		System.out.println(" -------- CONSTANTES ---------");
		System.out.println("Valor máximo: " + Integer.MAX_VALUE);
		System.out.println("Valor minimo: " + Integer.MIN_VALUE);
		System.out.println("Bytes: " + Integer.BYTES);
		System.out.println("Bits: " + Integer.SIZE);
	}
}
