package br.com.bytebank.testes;

public class TestaArrayDePrimitivos {
	public static void main(String[] args) {
		
		int[] idades = new int[5];
		
		for (int i = 0; i < idades.length; i++) {
			 idades[i] = i + 29;
			 System.out.println(idades[i]);
		}
	}
}
