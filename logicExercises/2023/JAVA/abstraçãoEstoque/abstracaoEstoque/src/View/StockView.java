package View;

import Model.Stock;

public class StockView {

    public String toString(Stock stock){
        return "\n name establishment " + stock.getEstablishment() +
                "\n Max of stock " + stock.getMAXSTORAGE() +
                "\n current storage " + stock.getCURRENTSTORAGE() +
                "\n last stock moviment " + stock.getLastStovkMoviment();
    }

}
