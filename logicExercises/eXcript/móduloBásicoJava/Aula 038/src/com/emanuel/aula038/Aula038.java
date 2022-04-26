package com.emanuel.aula038;
//fup que utilize instrução break
public class Aula038{

	public static void main(String[]args) {
	labelForI: for(int i = 0; i<10; i++) {
		for(int j = 0; j <10; j++) {
			System.out.println("O valor de i ="+i+" j é: "+j);
			if(j==9 && i ==3) {
				break labelForI;
			}
		}
	}
	}
}
