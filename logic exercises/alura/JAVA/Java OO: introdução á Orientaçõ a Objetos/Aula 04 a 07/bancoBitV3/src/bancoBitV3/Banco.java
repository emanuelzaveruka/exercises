package bancoBitV3;
/**
 * @author Emanuel Zaveruka
 *
 */
public class Banco {
	public static void main(String[] args) {
		//generating objects
		Conta conta = new Conta();
		Cliente emanuelZaveruka = new Cliente();
		//setting account object holder
		conta.setTitular(emanuelZaveruka);
		//setting object attributes account
		conta.setAgencia(111);
		conta.setNumero(1111111);
		//setting account holder attributes
		emanuelZaveruka.setNome("Emanuel Zaveruka");
		emanuelZaveruka.setCpf("000.000.000-00");
		emanuelZaveruka.setProfissao("Programmer");
		//printing attributes of objects
		System.out.println("---Dados da conta---");
		System.out.println("Numero da agencia: " + conta.getAgencia());
		System.out.println("Numero da conta: " + conta.getNumero());
		System.out.println("---Titular da conta---");
		System.out.println("Nome do titular: " + emanuelZaveruka.getNome());
		System.out.println("Cpf do titular: " + emanuelZaveruka.getCpf());
		System.out.println("Profissão do titular: " + emanuelZaveruka.getProfissao());
	}
}

