
public class ExercícioUmTesteIdade {
	
	public static void main(String[] args) {
		System.out.println("Testando idades");
		
		//Declaração de variáveis
		
		int idade = 16;
		int quantidadeDePessoas = 2;
		
		if (idade >= 18) {
			System.out.println("Você pode entrar");
		} else {
			if (quantidadeDePessoas == 1) {
				System.out.println("Você está acompanhando de"
						+ "uma pessoa, portanto pode entrar");
			}
			if (quantidadeDePessoas > 1) {
				System.out.println("Você está acompanhado de "
						+ "mais de uma pessoa, portanto pode entrar");
			}else {
				System.out.println("Infelizmente você não pode"
						+ " entrar pois é necessário acompanhante");
			}
		}
	}
}
