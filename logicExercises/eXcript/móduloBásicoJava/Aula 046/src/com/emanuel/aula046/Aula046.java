package com.emanuel.aula046;
//Arrays unidimensionais ||
public class Aula046{

	public static void main(String[]args) {
		
		int [] array =  {1, 2, 3, 4, 5};
		
		System.out.printf("%s%8s\n", "Indice", "Valores");
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%5d%8d\n", i, array[i]);
		}
	}
}
