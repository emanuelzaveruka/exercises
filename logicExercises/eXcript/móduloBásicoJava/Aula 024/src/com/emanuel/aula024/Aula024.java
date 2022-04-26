package com.emanuel.aula024;
//precedência de operadores
public class Aula024{
	
	public static void main(String[]args) {
		
		int a, b, c;
		
		a = 15;
		b = 10;
		c =  5;
		
		int y = 0;
		
		y = a + b;
		y = a - b;
		y = a * b;
		y = a / b;
		
		y = a % b;
		
		System.out.println(a * b - c);
		System.out.println((a + b) / a - b);
	}
}
