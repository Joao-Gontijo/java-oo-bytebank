package br.com.bytebank.model;

import java.io.Serializable;

import br.com.bytebank.AutenticaUtil;
import br.com.bytebank.interfaces.Autenticavel;

/**
 * Classe que representa um cliente no ByteBank
 * 
 * @author Joao
 * @version 0.1
 *
 */
public class Cliente extends Pessoa implements Autenticavel, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5203764527013543525L;
	private int senha;
	private String profissao;
	
	private transient AutenticaUtil autenticador;

	
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
