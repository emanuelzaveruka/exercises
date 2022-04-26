package com.emanuel.aula035;
//Operação ternária
public class Aula035{

	public static void main(String[]args) {
		/*
		 *Operação ternária é uma estrutura utilizada para 
		 *simplificar o código, onde testamos uma condição
		 *e retornamos um valor 
		 */
		
		/*
		 *sintaxe básica:
		 *
		 * <variavel> = (condição) ? <valor1> : <valor2>;
		 * 
		 */
		/*
		 * lê-se
		 * <variavel> = (True) SE <valor1> SENÃO <valor2>
		 */
		
		int a, b;
		a = 5;
		b = 5;
		
		String valor;

		
		valor = (a>b) ? "verdadeiro" : "falso";
		
		System.out.println(valor);
		
		
	}
}
