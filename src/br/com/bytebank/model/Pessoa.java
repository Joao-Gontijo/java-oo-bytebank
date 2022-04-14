package br.com.bytebank.model;

import java.io.Serializable;

public class Pessoa implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1909121707494268458L;
	private String nome;
	private String cpf;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
