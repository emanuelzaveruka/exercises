package com.emanuel.aula017;
//Introdução aos operadores lógicos
//Fup que classifica uma pessoa pela sua idade
//imprime se é uma pessoa jovem, meia idade ou velha.

import java.util.Scanner;

public class Aula017{
	
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		final int idadeJovem, idadeIdosa;
		idadeJovem = 17;
		idadeIdosa = 60;
		
		
		System.out.println("Digite a sua idade");
		int idade = in.nextInt();
		
		if(idade<=idadeJovem) {
			System.out.println("é um jovem");
		}else {
			if(idade>=idadeIdosa) {
				System.out.println("É um velho");
			}else {
				if(idade > idadeJovem && idade < idadeIdosa) {
						System.out.println("É adulto");
				}
			}
		}
	}
}
