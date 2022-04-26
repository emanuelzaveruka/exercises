package com.emanuel.aula009;
//fup faça uma calculadora

import java.util.Scanner;
public class Aula009{

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double num1, num2, soma, subtracao,
		multiplicacao, divisao;
		
		System.out.println("Insira um número: ");
		num1 = in.nextDouble();
		
		System.out.println("Insira outro número");
		num2 = in.nextDouble();
		
		soma = num1 + num2;
		System.out.println("O resultado da soma é: " + soma);
		
		subtracao = num1 - num2;
		System.out.println("O resultado da subtração é: " + subtracao);
		
		multiplicacao = num1 * num2;
		System.out.println("O resultado da multiplicação é:" + multiplicacao);
		
		divisao = num1 / num2;
		System.out.println("O resultado da divisão é: " + divisao);
	}
}
