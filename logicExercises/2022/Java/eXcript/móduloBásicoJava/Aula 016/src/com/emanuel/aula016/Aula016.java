package com.emanuel.aula016;
//fup que mede distancia que o som
//percorreu em um determinado tempo

import java.util.Scanner;

public class Aula016{
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final double velocidadeDoSom = 340.28; // m/s
				
		System.out.println("Digite o espaço de tempo");
		double distancia = in.nextDouble();
		
		System.out.println("A distancia percorrida foi: " 
							+ (distancia*velocidadeDoSom));
	}
}
