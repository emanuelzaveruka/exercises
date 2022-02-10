package com.emanuel.aula015;
//constantes
public class Aula015{
	
	public static void main(String[] args) {
		
		/*
		 * A constante é definida pela alocação de um espaço na
		 * memória para guardar um valor durante a excução de 
		 * um programa ou então um bloco de instrução é muito
		 * semelhante a uma variavel, no entanto sua finalidade
		 * assegurar que a informação não seja alterada.
		 * 
		 * O que é uma constante?
		 * Podemos dizer que na área é algo que não varia
		 * 
		 * Caracteristicas:
		 * 
		 * 1)Os dados nunca serão alterados durante execução
		 * 2)Uma constante tem seu endereço de memória protegido
		 * 3)A constante só será desalocada quando o bloco for 
		 * finalizado ou o programa for fechado
		 * 4)declaramos uma vez, e utilizamos quantas vezes for preciso
		 * 
		 */
		
			  int var       = 10; //declara uma variavel
		final int constante = 10; //declara constante
		
		var = 100;
		//constante = 100; jeito errado
		
		System.out.println(var);
		System.out.println(constante);
		
		
	}
}
