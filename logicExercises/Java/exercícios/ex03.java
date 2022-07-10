import java.util.*;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o primeiro valor (número inteiro posítivo) :  ");
        int numeroUm = scanner.nextInt();

        System.out.printf("Digite o segundo valor (número inteiro posítivo) :   ");
        int numeroDois = scanner.nextInt();

        System.out.printf("O produto é :   %d \n", numeroUm * numeroDois);
    }

}
