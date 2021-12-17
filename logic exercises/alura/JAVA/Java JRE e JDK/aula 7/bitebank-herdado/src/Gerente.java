//Gerente herda da class funcionario
public class Gerente extends Funcionario{

	private int senha;

	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	//a palavra super é uma boa prática que indica
			//que a variavel ou metodo é da classe pai
	public double getBonificacao() {
		return super.getSalario();
	}
	
	
	
}
