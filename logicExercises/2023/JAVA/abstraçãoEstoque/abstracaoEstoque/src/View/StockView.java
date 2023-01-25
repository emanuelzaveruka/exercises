package View;

import Model.*;
import java.util.Scanner;


public class StockView {

    static Scanner scanner = new Scanner(System.in);
    public static void operations() {
        System.out.println("------------------------------------------------------");
        System.out.println("-------------Welcome a our stock---------------");
        System.out.println("------------------------------------------------------");
        System.out.println("***** Select the operation *****");
        System.out.println("------------------------------------------------------");
        System.out.println("|   Option 1 - Crate stock   |");
        System.out.println("|   Option 2 - MovimentStock         |");

        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                createStock
                break;
            case 2:

                break;
            default:
                break;
        }
    }
        public String toString(Stock stock){
        return "\n name establishment " + stock.getEstablishment() +
                "\n Max of stock " + stock.getMAXSTORAGE() +
                "\n current storage " + stock.getCURRENTSTORAGE() +
                "\n last stock moviment " + stock.getLastStovkMoviment();
    }

}
