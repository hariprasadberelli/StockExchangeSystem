package com.stockexample.factorypattern;

public class StockFactoryMain {

	public static void main(String[] args) {
	StockBroker sbroker = new StockBroker();
	
    Stock stock1 = sbroker.getstock("BSE");

    
    stock1.buyStock();

    
    Stock stock2 = sbroker.getstock("NSE");

 
    stock2.buyStock();


    Stock stock3 = sbroker.getstock("IPO");


    stock3.buyStock();
    }
}
