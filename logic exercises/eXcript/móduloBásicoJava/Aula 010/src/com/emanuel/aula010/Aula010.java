package com.emanuel.aula010;
//tomada de decisão
import java.util.Scanner;
public class Aula010{
	/*
	 * Lógica trata-se de um dos assuntos mais
	 * importantes da programação
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite o número 1");
		num = in.nextInt();
		
		if (num==1) {
			System.out.println("sim, é igual");
		}else {
			System.out.println("Não é igual");
		}
	}
}
