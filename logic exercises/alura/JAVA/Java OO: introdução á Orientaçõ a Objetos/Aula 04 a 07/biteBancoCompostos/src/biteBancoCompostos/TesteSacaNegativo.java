package biteBancoCompostos;

public class TesteSacaNegativo {

	public static void main(String[] args) {
		conta conta = new conta();
		conta.deposita(100);
		conta.saca(200);
		System.out.println(conta.getSaldo());
		
		
	}
}
