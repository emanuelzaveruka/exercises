package com.emanuel.aula037;
//instrução break
public class Aula037{

	public static void main(String[]args) {
		/*
		 * A instrução break é utilizada dentro
		 * de um looping no momento em que desejamos
		 * encerrar o looping. Ou seja não precisa que 
		 * a condição seja finalizada podemos interromper
		 * o laço caso o break seja chamado
		 */
		for (int i = 0; i<10; i++) {
			System.out.println(i);
			if (i>=3) {
				System.out.println(i);
				break;
			}
		}
		int i = 10;
		while(i<=100) {
			i++;
			if(i>=10) {
				System.out.println(i);
				break;
			}
		}
		
		int dia = 2;
		switch(dia) {
		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda");
			break;
		}
		
		
	}
}
