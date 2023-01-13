package Controller;

import Model.Stock;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("name of establishment");
        String nameOfEstablishment = scanner.nextLine();

        Stock stock = new Stock(nameOfEstablishment);
        System.out.println(stock.toString());
    }
}
