package br.com.bytebank.model;

import java.io.Serializable;

import br.com.bytebank.AutenticaUtil;
import br.com.bytebank.exception.SaldoInsuficienteException;

/**
 * Classe abstrata que representa uma conta no ByteBank
 * 
 * @author Joao
 * @version 0.1
 *
 */
public abstract class Conta implements Comparable<Conta>, Serializable{
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Conta " + numero + " criada com sucesso!");
	}
	
	public abstract void deposita(double valor);
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
	
	/**
	 * Valor precisa ser menor ou igual a saldo
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo " + this.saldo +  " insuficiente. " + valor + " é maior");
		}
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Agencia: " + this.agencia;
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta outra = (Conta) obj;
		if(this.agencia == outra.agencia && this.numero == outra.numero) {
			return true;
		}
		return false;
	}
}
