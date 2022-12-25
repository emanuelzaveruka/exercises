package com.emanuel.aula040;
//instrução continue
public class Aula040{

	public static void main(String[]args) {
		
		/*
		 * A instrução continue é utilizada dentro de um
		 * looping no momento em que desejarmos encerrar
		 * um ciclo. Ao contrário da instrução break que
		 * encerra o looping, a instrução continue encerra
		 * somente um único ciclo.
		 */
		
		for (int i = 0; i<100; i++) {
			if (i%2==0) {
				System.out.println(i);
			}else {
				continue;	
			}
			
		}
	}
}
