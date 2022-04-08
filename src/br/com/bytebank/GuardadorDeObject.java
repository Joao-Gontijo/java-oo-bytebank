package br.com.bytebank;

public class GuardadorDeObject {
	
	private Object[] refs;
	private int posicaoLivre;
	
	public GuardadorDeObject() {
		this.refs = new Object[10];	
	}
	
	public void adicionar(Object obj) {
		refs[this.posicaoLivre] = obj;
		this.posicaoLivre++;
	}

	public int getQuantidadeDeItens() {
		return this.posicaoLivre;
	}

	public Object getReferencia(int posicao) {
		return refs[posicao];
	}
	
}
