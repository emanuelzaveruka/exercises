package com.emanuel.aula045;
//
public class Aula045{

	public static void main(String[]args) {

		int[] arrInt = new int[10];
		
		System.out.printf("%s%10s\n", " _______", "_______");
		System.out.printf("%s%10s\n", "|Indice ", "|Valores|");
		System.out.printf("%s%10s\n", "|-------","|-------|");
		for(int i = 0; i<=9; i++) {
			System.out.printf("|%5d%3s%7d |\n",i, "", arrInt[i]);
		}
		System.out.printf("%s%10s\n", "|-------", "|-------|");
	}
}
