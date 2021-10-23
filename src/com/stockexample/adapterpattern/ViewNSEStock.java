package com.stockexample.adapterpattern;

public class ViewNSEStock implements StockExchange{

	@Override
	public void getIPOStock(String stockname) {
		
		System.out.println("This is a NSE IPO stock");
		
	}

	@Override
	public void getIntradayStock(String stockname) {
		
		
	}

	

	

}
