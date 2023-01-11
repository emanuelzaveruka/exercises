package Controller;

import Entities.Employee;
import Entities.Stock;
import Model.StockModel;

import java.util.Date;
import java.util.Scanner;

public class MainController {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        StockModel model = new StockModel();
        System.out.println("name of establishment");
        String nameOfEstablishment = scanner.nextLine();

        System.out.println("Set the max storage of stock");
        Integer MAXSTORAGE = scanner.nextInt();

        /*Set inicial balance stock*/
        Integer CURRENTSTORAGE = 0;
        
        Stock stock = new Stock(MAXSTORAGE, nameOfEstablishment,CURRENTSTORAGE, new Date());

        model.movimentStock(stock);

        System.out.println(stock.toString());
    }
}
