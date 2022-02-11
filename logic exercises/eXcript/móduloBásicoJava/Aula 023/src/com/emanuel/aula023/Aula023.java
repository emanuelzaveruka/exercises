package com.emanuel.aula023;
//Assiciatividade de operadores
public class Aula023{
	
	public static void main(String[]args) {
		
		/*
		 * quando fazemos uma soma ou uma subtração o java
		 * na ausencia de parenteses para determinar preferencia
		 * começa resolver da esquerda da esquerda para direita
		 */
		
		int x, y, z;
		x = y = z = 0;
		
		int a = (x + y) + z;
		
		/*da esquerda para direita
		 * niveis de associatividade
		 * 1) ()
		 * 2) *, /, %
		 * 3) +, -
		 * 4) <, <=, >, >=
		 * 5) ==, !=
		 */
		
		/*
		 * da direita para esquerda
		 * 1) =
		 */
	}
}
