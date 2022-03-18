package bytebank.model;

public class Funcionario extends Pessoa {
	
	private double salario;
	
	public double getBonificacao() {
		return this.salario * 0.1;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
