package com.assignments12oops;

public class Stock {
    private String companyName;
    private String stockRating;
    private int price;
    private int numberOfShare;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStockRating() {
        return stockRating;
    }

    public void setStockRating(String stockRating) {
        this.stockRating = stockRating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfShare() {
        return numberOfShare;
    }

    public void setNumberOfShare(int numberOfShare) {
        this.numberOfShare = numberOfShare;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "companyName='" + companyName + '\'' +
                ", stockRating='" + stockRating + '\'' +
                ", price=" + price +
                ", numberOfShare=" + numberOfShare +
                '}';
    }

    public Stock(String companyName, String stockRating, int price, int numberOfShare){
        this.companyName = companyName;
        this. stockRating = stockRating;
        this.price = price;
        this.numberOfShare = numberOfShare;
    }
}
