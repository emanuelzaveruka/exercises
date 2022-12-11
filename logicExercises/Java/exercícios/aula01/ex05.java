import java.io.IOException;
import java.util.*;

public class ex05 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite seu Salário:");
        double salario = scanner.nextDouble();

        if (salario >= 0 && salario <= 2000.00) {
            System.out.println("Isento");
        } else if (salario >= 2000.01 && salario <= 3000.00) {
            System.out.println(String.format("necessário pagar 8%% ICMS, R$ %.2f", (salario - 2000) * 0.08));
        } else if (salario >= 3000.01 && salario <= 4500.00) {
            System.out.println(String.format("necessário pagar 18%% ICMS, R$ %.2f", (salario - 3000) * 0.18) + 80);
        } else if (salario > 4500.00) {
            System.out.println(String.format("necessário pagar 28%% ICMS, R$ %.2f", (salario - 4500) * 0.28) + 350);
        }

    }

}
