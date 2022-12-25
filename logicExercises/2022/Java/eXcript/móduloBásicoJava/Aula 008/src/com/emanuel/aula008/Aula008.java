package com.emanuel.aula008;
//entrada e saida de valores
//fup que converte idade dos cachorros
//para a idade dos humanos

import java.util.Scanner;
public class Aula008{

	public static void main(String[] args) {
		/*
		 * todo programa tem três caracterisiticas
		 * 
		 * 1) Entrada de dados
		 * 2) Processamento de dados
		 * 3) Saida dos dados
		 * 
		 */
		
		System.out.println("Informe a idade de seu cahorro: ");

		Scanner in = new Scanner(System.in);
		
		int idadeCachorro = in.nextInt();
		idadeCachorro = idadeCachorro * 7;
		
		System.out.println("O seu cachorro na idade dos humanos é:"
							+idadeCachorro+" anos.");
		
	}
}
