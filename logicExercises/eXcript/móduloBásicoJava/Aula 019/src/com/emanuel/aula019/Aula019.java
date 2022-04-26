package com.emanuel.aula019;
//Tipos Primitivos ||

public class Aula019{
	
	public static void main(String[]args) {
		//Tipos primitivos no Java
		
		//por padrão sempre é false
		//1 byte, 8 bits
		boolean b;
		
		//por padrão char é igual ''
		//ocupa 2 byte, 16 bits
		char c = 'a';
		/*
		 * Os valores do tipo char podem receber
		 * tanto como número ou letras, qualquer tipo
		 * de caractere. Para char receber um valor
		 * deve ser em aspas simples ''.
		 */
		char c2 = '1';
		/*
		 * Por padrão é atribuido zero 0 na variavel byte
		 * byte ocupa 1 byte de memória byte so recebe numeros
		 * entre -128 e +127
		 */
		byte x = 1;
		/*
		 * por padrão java atribui zero 0 na variavel short
		 * pode receber um numero de -32768 ate + 32767
		 */
		short ecamisa = 2000;
		/*
		 * por padrão java atribui zero 0 na variavel int
		 * pode ir de -2,147,483,648 até +2,147,486,647
		 */
		int i = 1;
		
		long l;
		/*
		 * muito parecido com o tipo double a diferença está
		 * na capacidade de armazenamento e na forma de atribuir
		 * valores
		 */
		float f = 2.2f;
		double d = 2.2;
	}
}
