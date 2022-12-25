package com.emanuel.aula012;
//Depuração
/*
 * Fup que leia quatro valores de nota e deve trazer a média
 * O usuario deve digitar os valores
 */
import java.util.Scanner;

public class Aula012{
	/*
	 * Depurar é uma forma de executar o programa
	 * e acompanhar a cada momento do programa
	 * 
	 * é muito utilizada para encontrar erro durante o programa
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int nota1, nota2, nota3, nota4, soma;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = in.nextInt();

		System.out.println("Digite a segunda nota: ");
		nota2 = in.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = in.nextInt();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = in.nextInt();
		
		soma = nota1 + nota2 + nota3 + nota4;
		soma = soma/4;
		
		System.out.println("A média das notas é: " + soma);
		
		if(soma >= 70) {
			System.out.println("Você está aprovado");
		}else {
			System.out.println("Você está reprovado");
		}
	}
}
