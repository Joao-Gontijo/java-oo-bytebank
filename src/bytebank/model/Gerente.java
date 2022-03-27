package bytebank.model;

import bytebank.AutenticaUtil;
import bytebank.interfaces.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;
	
	
	private AutenticaUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticaUtil();
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	public int getSenha() {
		return senha;
	}
	
	public double getBonificacao() {
		return super.getSalario();
	}
	
	
}
