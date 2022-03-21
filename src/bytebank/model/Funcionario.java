package bytebank.model;

public abstract class Funcionario extends Pessoa {
	
	private double salario;
	
	public abstract double getBonificacao();

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
