import java.util.*;

public class ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o primeiro número inteiro a ser somado :  ");
        int numeroUm = scanner.nextInt();

        System.out.printf("Digite o segundo número inteiro a ser somado :   ");
        int numeroDois = scanner.nextInt();

        System.out.printf("A soma é :   %d \n", numeroUm + numeroDois);
    }

}
