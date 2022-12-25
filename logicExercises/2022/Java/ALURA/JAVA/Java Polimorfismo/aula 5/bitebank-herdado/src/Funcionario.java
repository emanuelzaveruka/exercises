//abstract faz da classe uma abstração de algo
//nao se pode intanciar = criar objeto dessa classe
//pq ela é abstrata
public abstract class Funcionario {

	private String nome;
	private String cpf;
	protected double salario; //protected deixa os atributos visiveis as classes filhos
	
	//metodo torna-se abstrato e não é necessario implementa-lo
	public abstract double getBonificacao();
	
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
