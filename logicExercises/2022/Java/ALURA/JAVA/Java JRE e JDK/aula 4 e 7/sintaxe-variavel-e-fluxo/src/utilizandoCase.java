
public class utilizandoCase {

	public static void main(String[] args) {
		//
		// Mensagem ao usuário
		//
		System.out.println("Testando case");
		//
		// Declaração da variavel mes
		//
		int mes = 2;
		//
		// Switch é um comando que testa a variavel entre os
		// parenteses apartir de casos de iguadade ou seja
		// caso mes == 1 faça mes é janeiro e no final break
		// para parar os testes.
		//
		switch (mes) {
		case 1:
			//
			System.out.println("Mês é janeiro");
			//
			break;
		case 2:
			//
			System.out.println("Mês é Fevereiro");
			//
			break;
		case 3:
			//
			System.out.println("Mês é março");
			//
			break;
		// O comando default é um caso especifico, caso o teste
		// não de verdadeiro ele retorna como o caso default
		default:
			//
			System.out.println("Mês Invalido");
			//
			break;
		}
	}
}
