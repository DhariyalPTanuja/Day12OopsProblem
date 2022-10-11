package com.assignments12oops;

import java.util.Scanner;

public class StockPortfolio {

    private static final int INVENTORY_SIZE = 12;
    private static Stock [] stocks;

    public StockPortfolio() {
        stocks = new Stock [INVENTORY_SIZE];

    }
    private  static  void  stockPortfolio(){
        Scanner console = new Scanner(System.in);
        for( int i = 0; i < INVENTORY_SIZE; i++ )
        {
            System.out.println ("Stock's name:");
            String stockName = console.next();

            System.out.println ("Stock's rating");
            String stockRating= console.next();

            System.out.println ("Stock's price:");
            int stockPrice = console.nextInt();

            System.out.println ("Numbers of shares: ");
            int numberShares= console.nextInt();

            stocks[i] = new Stock( stockName, stockRating, stockPrice, numberShares);
        }
    }

    public static void main(String[] args) {
        StockPortfolio stockobj = new StockPortfolio();
        stockobj.stockPortfolio();
    }

}
