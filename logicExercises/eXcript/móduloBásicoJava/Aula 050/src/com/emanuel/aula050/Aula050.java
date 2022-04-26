package com.emanuel.aula050;
import java.util.Scanner;
//fup que solicite 7 número e armazene-os em um array
/*
 * na sequência
 * 1)Some todos os números e exiba na tela
 * 2) Multiplique o indice pelo seu valor
 * 3) calcule a media aritmetica
 */

public class Aula050{

	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] vet = new int[7];
		
		int soma = 0;
		
		for(int i = 0; i<7; i++) {
			System.out.println("Digite o numero da posição "+i);
			vet[i] = in.nextInt();
			soma += vet[i];
		}
		System.out.println("A soma de todos os valore é"+soma);
		for(int i = 0; i>7; i++) {
			
		}
	
	}
}
