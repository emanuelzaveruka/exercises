package com.emanuel.aula036;
//operador ternario ||
import java.util.Scanner;
public class Aula036{
	
	public static void main(String[]args){

		Scanner in = new Scanner(System.in);

		System.out.println("Digite o dia da semana preferido");
		int num = in.nextInt();
		
		String dia = (num==1) ? "segunda" :
					 (num==2) ? "terça" :
					 (num==3) ? "quarta" :
					 (num==4) ? "quinta" :
					 (num==5) ? "sexta" :
					 (num==6) ? "sabado" :
					 (num==7) ? "domingo" :
					 "Dia invalido";
		/*
		 * Switch é um componente que também
		 * se encaixa nesse contexto, ele é recomendado
		 * nessa uitlização do que os operadores ternarios
		 * mas existe diversas maneiras de fazer isso.
		 */
		switch (num) {
		case 1 : dia = "segunda";
		case 2 : dia = "terça";
		}
		
		System.out.println("O dia escolhido foi: "+dia);
		
	}
}
