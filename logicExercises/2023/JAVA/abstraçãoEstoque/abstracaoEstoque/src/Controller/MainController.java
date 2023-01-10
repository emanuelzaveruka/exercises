package Controller;

import Entities.Employee;
import Entities.Stock;
import Model.StockModel;

public class MainController {
    public static void main(String[] args){

        StockModel stockModel = new StockModel();

        stockModel.createStock();

    }
}
