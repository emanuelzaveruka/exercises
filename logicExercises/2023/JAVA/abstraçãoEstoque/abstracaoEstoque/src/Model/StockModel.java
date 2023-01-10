package Model;

import Entities.Employee;
import Entities.Stock;

import java.util.Date;
import java.util.Scanner;

public class StockModel {

    static Scanner scanner = new Scanner(System.in);
    public static void createStock(){

        System.out.println("name of establishment");
        String nameOfEstablishment = scanner.nextLine();

        System.out.println("Set the max storage of stock");
        Integer MAXSTORAGE = scanner.nextInt();

        /*Set inicial balance stock*/
        Integer CURRENTSTORAGE = 0;

        Date lastStockMoviment = new Date();
        lastStockMoviment.getTime();

        Stock stock = new Stock(MAXSTORAGE, nameOfEstablishment, CURRENTSTORAGE, lastStockMoviment);

        System.out.println(stock.toString());
    }

    public void movimentStock(Integer value){

        if (value > 0 && value != 0){

        }
    }

}
