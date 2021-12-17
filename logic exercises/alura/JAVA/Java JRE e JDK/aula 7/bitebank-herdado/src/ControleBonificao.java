
public class ControleBonificao {
	
	private double soma;
	
	public void registro(Funcionario f) {
		double bonificao = f.getBonificacao();
		this.soma = this.soma + bonificao;
	}
	public double getSoma() {
		return soma;
	}
}
