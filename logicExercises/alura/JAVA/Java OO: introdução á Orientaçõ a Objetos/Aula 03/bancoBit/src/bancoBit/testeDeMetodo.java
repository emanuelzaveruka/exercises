package bancoBit;

public class testeDeMetodo {
	
	public static void main(String[] args) {
		
		conta contaXYZ = new conta();
		
		contaXYZ.saldo = 100;
		contaXYZ.deposita(50);
		System.out.println(contaXYZ.saldo);
		
		contaXYZ.saca(20);
		System.out.println(contaXYZ.saldo);
	}
}
