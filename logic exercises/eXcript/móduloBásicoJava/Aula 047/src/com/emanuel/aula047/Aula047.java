package com.emanuel.aula047;
//Caracteristicas dos arrays
public class Aula047{

	public static void main(String[]args) {
		/*
		 * 1)Todo array possui uma quantidade de elementos
		 * temos que o array é um objeto que porta uma lista de
		 * elementos, que o mesmo compoe o array
		 * 
		 * 2)Todo array possui um indice, talves umas das caracteristicas
		 * mais importantes dos arrays 
		 * 
		 * 3)Os elementos são os compoem nosso array
		 * 
		 * 4)Todo elemento array possui um tipo
		 */
		
		int[] lista = new int[5];
		
		lista[0] = 45;
		lista[1] = 10;
		lista[2] = 1;
		lista[3] = 1000;
		lista[4] = 45;
		
		int[] a = new int[10];
		
		a[5] = 1000;
		a[0] = 0;
		
		System.out.println(a[4]);
		System.out.println(a[5]);

	}
}
