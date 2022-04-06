package br.com.bytebank.testes;

public class TestaString {

	public static void main(String[] args) {
		
		String nome = "João";
		nome = nome.toLowerCase();
		System.out.println(nome);
		
		nome = nome.replace('o', 'e');
		System.out.println(nome);
		
		nome = nome.toUpperCase();
		System.out.println(nome);
	
		System.out.println(nome.charAt(0));
		
		System.out.println(nome.indexOf("Ã"));
		
		System.out.println(nome.substring(2));
		nome = nome.replace('E', 'O');
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
	}
}
