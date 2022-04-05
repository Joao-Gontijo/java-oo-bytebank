package br.com.bytebank.model;

import br.com.bytebank.AutenticaUtil;
import br.com.bytebank.interfaces.Autenticavel;

public class Cliente extends Pessoa implements Autenticavel {
	
	private int senha;
	private String profissao;
	
	private AutenticaUtil autenticador;

	
	public Cliente() {
		this.autenticador = new AutenticaUtil();
	}
	
	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
