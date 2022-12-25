
import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o raio da circunferência: ");
        double raio = scanner.nextDouble();
        double area = raio * raio * 3.14159;
        System.out.printf(" A área é = %.2f\n", area);

    }
}