package biteBancoEncapsulado;

public class TestaGetESet {
	
	public static void main(String[] args) {
		conta conta = new conta(155);
		conta conta2 = new conta(155);
		conta conta3 = new conta(155);
		conta.setNumero(1333);
		
		Cliente emanuel = new Cliente();
		conta.setTitular(emanuel);
		emanuel.setNome("emanuel");
		
		emanuel.setCpf("122.222.333-54");
		emanuel.setProfissao("Programador");
		
		System.out.println(emanuel.getNome());
		System.out.println(emanuel.getCpf());
		System.out.println(emanuel.getProfissao());
		
		System.out.println(conta.getTotal());
	}
}
