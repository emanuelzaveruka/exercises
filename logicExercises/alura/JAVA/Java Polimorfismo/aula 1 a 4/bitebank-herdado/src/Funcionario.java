
public class Funcionario {

	private String nome;
	private String cpf;
	protected double salario; //protected deixa os atributos visiveis as classes filhos

	public double getBonificacao() {
		return salario*0.1;
	}
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	
}
