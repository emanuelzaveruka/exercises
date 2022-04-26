package biteBancoCompostos;

public class TestaBanco {

	public static void main(String[] args) {
		Cliente emanuel = new Cliente();
		emanuel.nome = "Emanuel";
		emanuel.cpf = "234.212.212-32";
		emanuel.profissao = "programador";
		
		conta contaDoEmanuel = new conta();
		contaDoEmanuel.deposita(100);
		
		contaDoEmanuel.titular = emanuel;
		System.out.println(contaDoEmanuel.titular.nome);
	
	}
}
