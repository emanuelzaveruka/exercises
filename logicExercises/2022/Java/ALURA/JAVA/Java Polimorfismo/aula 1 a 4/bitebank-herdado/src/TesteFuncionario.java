
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario emanuel = new Funcionario();
		emanuel.setNome("Emanuel");
		emanuel.setCpf("222-222-222-9");
		emanuel.setSalario(2600.00);
		
		System.out.println(emanuel.getNome());
		System.out.println(emanuel.getBonificacao());
	}
}
