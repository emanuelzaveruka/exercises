import java.util.*;

public class ex04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um numero:  ");

        double numeroUm = scanner.nextDouble();

        System.out.println("Escreva mais um nuumero");
        double numeroDois = scanner.nextDouble();

        double media = (numeroUm + numeroDois) / 2;

        System.out.printf("MEDIA = %.1f", media);

    }

}
