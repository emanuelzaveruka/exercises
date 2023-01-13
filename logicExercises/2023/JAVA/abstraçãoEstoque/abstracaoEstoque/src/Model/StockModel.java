package Model;

import java.util.Scanner;

public class StockModel {

    static Scanner scanner = new Scanner(System.in);
    public void movimentStock(Stock stock){
        System.out.println("Type value integer for add current stock");
        Integer value = scanner.nextInt();

        if (value > 0 && value != 0){
        int test = stock.getCURRENTSTORAGE();
        value += test;
        stock.setCURRENTSTORAGE(value);
        }
    }

}
