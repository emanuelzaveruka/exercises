
public class TestaCaracteres {

	public static void main (String[]args) {
		
		//Char não aceita valores vazios
		//Para atribuir valores na variavel char
		//Deve ser em aspas simples
		char letra = 'a'; //char define caracteres 
		System.out.println(letra);
		
		char valor = 66; //o numero dentro da char pode significar uma caractere
		System.out.println(valor);
		
		valor = (char) (valor + 1); //para soma um valor a caractere deve se usar o (char)
		System.out.println(valor);
		
		//String aceita texto com espaçamento 
		//Toda variavel dentro do texto deve ser 
		//Em aspas duplas 
		String texto = "Estou estudando JAVA";
		System.out.println(texto); 
	}
}
