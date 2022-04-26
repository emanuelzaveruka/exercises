
public class TestaGerente {

	public static void main(String[]args) {
		Gerente emanuel = new Gerente();
		emanuel.setNome("emanuel");
		emanuel.setSalario(5000.0);
		emanuel.setCpf("000.000.000-00");
		
		System.out.println(emanuel.getSalario());
		System.out.println(emanuel.getBonificacao());
	}
}
