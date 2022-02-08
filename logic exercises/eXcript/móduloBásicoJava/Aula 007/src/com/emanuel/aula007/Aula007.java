package com.emanuel.aula007;
/*
 * toda vez que queremos utilizar uma classe em outro pacote
 * utilizamos a instrução import, depois que importamos
 * poderemos utilizar livremente em nossa classe
 */
import java.util.Scanner;

//entrada de valores


public class Aula007{

	public static void main(String[] args) {
		
		System.out.println("Digite um número");
		
		/*
		 * Para entrada de valores usaremos o objeto
		 * Scanner. Vamos dizer que eu quero uma variavel
		 * "in" do tipo scanner e essa var recebera uma nova
		 * instancia de um novo objeto scanner
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println(in.nextLine());

	}
}
