
/*
 * ocê deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo

Exemplo de Entrada	Exemplo de Saída
I=1 J=7
I=1 J=6
I=1 J=5
I=3 J=7
I=3 J=6
I=3 J=5
...
I=9 J=7
I=9 J=6
I=9 J=5
 */

public class ex06 {

    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 10; i++) {
            i = i + 1;
            for (j = 7; j > 4; j--) {
                // j = j - 1;
                System.out.printf("I=%d J=%d\n", i, j);

            }
        }
    }

}
