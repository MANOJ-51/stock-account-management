package com.stock.account.management;

public class StockPortfolio {

    //input variables
    String stockName;
    int numberOfShares;
    int priceOfShare;
    int valueOfStock;

    //constructor

    public StockPortfolio(String stockName, int numberOfShares, int priceOfShare, int valueOfStock) {
        this.stockName = stockName;
        this.numberOfShares = numberOfShares;
        this.priceOfShare = priceOfShare;
        this.valueOfStock = valueOfStock;
    }

    //getters and setters

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public int getPriceOfShare() {
        return priceOfShare;
    }

    public void setPriceOfShare(int priceOfShare) {
        this.priceOfShare = priceOfShare;
    }

    public int getValueOfStock() {
        return valueOfStock;
    }

    public void setValueOfStock(int valueOfStock) {
        this.valueOfStock = valueOfStock;
    }

    //to string override method

    @Override
    public String toString() {
        return "StockPortfolio{" +
                "stockName='" + stockName + '\'' +
                ", numberOfShares=" + numberOfShares +
                ", priceOfShare=" + priceOfShare +
                ", valueOfStock=" + valueOfStock +
                '}';
    }
}
