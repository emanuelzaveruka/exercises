package com.emanuel.aula028;
//Calculora usando while
import java.util.Scanner;

public class Aula028{
	
	public static void main(String[]args){

	Scanner in = new Scanner(System.in);

	double soma, subtracao, multiplicacao, divisao, numeroUm, numeroDois;

	System.out.println("Digite um número inteiro");
	numeroUm = in.nextDouble();

	System.out.println("Digite o segundo número");
	numeroDois = in.nextDouble();

	System.out.println("Digite 1 para operação de soma");
	System.out.println("Digite 2 para operação de subtracao");
	System.out.println("Digite 3 para operação de multiplicacao");
	System.out.println("Digite 4 para operação de divisao");
	System.out.println();
	System.out.print("Digite o numero de sua operação:  ");
	int teste = in.nextInt();

	boolean i = false;

	while(i==false){
		if(teste==1){
		soma = numeroUm + numeroDois;
		System.out.println("O resultado da soma entre  "
				+numeroUm+" e "+numeroDois
				+"  é igual a:  "+soma);
		i = true;
		}else{
			if(teste==2){
			subtracao = numeroUm - numeroDois;
			System.out.println("O resultado da subtração entre  "
					+numeroUm+" e "+numeroDois
					+"  é igual a:  "+subtracao);
			i = true;
			}else{
				if(teste==3){
				multiplicacao = numeroUm * numeroDois;
				System.out.println("O resultado da multiplicação entre  "
						+numeroUm+" e "+numeroDois
						+"  é igual a:  "+multiplicacao);
				i = true;
				}else{
					if (teste==4){
					divisao = numeroUm / numeroDois;
					System.out.println("O resultado da divisão entre  "
										+numeroUm+" e "+numeroDois
										+"  é igual a:  "+divisao);
					i = true;
					}else{
					System.out.println("O numero da operação não confere, digite o correto");
					teste = in.nextInt();
					}
				}
			}
		}
	}
	}
}