
public class TestaReferencias {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Emanuel");
		g1.setSalario(5000.0);
		
		Funcionario f = new Funcionario();
		f.setSalario(2000.0);
		
		ControleBonificao controle = new ControleBonificao();
		controle.registro(g1);
		controle.registro(f);
		
		System.out.println(controle.getSoma());
	}
}
