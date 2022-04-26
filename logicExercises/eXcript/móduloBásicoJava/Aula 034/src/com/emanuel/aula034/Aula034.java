package com.emanuel.aula034;
//Número aleatórios

import java.util.Random;
public class Aula034{

	public static void main(String[]args) {
		/*
		 *"queremos trabalhar com a classe Random"
		 * e daremos o nome da variavel de num e a essa
		 * atribuimos uma nova instância de Random()
		 */
		Random num = new Random();
	
		/*
		 *o intervalo será de 1 e 6; o mais um é para que
		 *o intervalo sejá apartir de um pois ele pode co-
		 *meçar a apartir do zero
		 */		
		System.out.println(num.nextInt(6)+1);
		
		for(int i = 0; i<=10; i++) {
			System.out.println(num.nextInt(6)+1);
			System.out.println(num.nextDouble()*50);
		}
	}
}
