package bancoBit;

public class referenciasVsObjetos {
	public static void main(String[] args) {
		
	conta contaA = new conta();
	conta contaB = new conta();
	
	if (contaA != contaB) {
		System.out.println("são referencias diferentes");
		System.out.println("referencia A" + contaA);
		System.out.println("referencia B" + contaB);
	}
	
	conta contaC = new conta();

	
	conta contaD = contaC;
	
	if (contaD == contaC) {
		System.out.println("são referencias iguais");
		System.out.println("referencia C" + contaC);
		System.out.println("referencia D" + contaD);
	}
	}
}
