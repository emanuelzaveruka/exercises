package com.emanuel.aula044;
//Declaração Array unidimensional
public class Aula044{

	public static void main(String[]args) {
		//<classe>
		//<tipo>[] <nome>; forma ofcial
		
		//<tipo> <nome>[]; herdada do c/c++
		
		/*
		 * Array é uma estrutura de dados que permite a mani-
		 * pulação de um número finito de elementos de um mes-
		 * mo tipo. No java Array é uma coleçao ordenada de elementos
		 * 
		 */
		/*
		 * Um array é uma classe que tem como objetivo de adminis-
		 * trar um conjuto de elementos de um mesmo tipo essa é
		 * utilidade pricipal do array
		 */
		
		int[] arrInt = new int[10];
		
		for(int i = 0; i<=9; i++) {
			System.out.printf("%5d%7d\n",i, arrInt[i]);
		}
		
	}
}
