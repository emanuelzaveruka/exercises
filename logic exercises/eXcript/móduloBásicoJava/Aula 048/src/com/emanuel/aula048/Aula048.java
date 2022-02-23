package com.emanuel.aula048;
//manipulando arrays
public class Aula048{
	public static void main(String[]args) {
		
		int[] arrayInt = new int[10];
		int soma = 0;
		
		for(int i = 0; i<10; i++) {
			soma += 10;
			arrayInt[i] = soma;
			System.out.println(i+"  "+arrayInt[i]);
		}
		
		soma = 0;
		
		for(int i = 0; i<10; i++) {
			soma += arrayInt[i];
		}
		
		System.out.println("soma de todos os valores na matriz  "+soma);
				
	}
}
