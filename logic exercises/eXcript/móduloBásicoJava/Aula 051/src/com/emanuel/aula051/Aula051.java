package com.emanuel.aula051;
//
public class Aula051{

	public static void main(String[]args) {
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		for(int i = 0; i<=9; ++i) {
			vetorA[i] += i;
			if (vetorA[i] % 2 == 0) {
					vetorB[i] = vetorA[i];
			}
			System.out.println(vetorB[i]);
		}
	}
}
