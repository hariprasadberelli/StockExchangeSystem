package com.stockexample.adapterpattern;

public class ViewBSEStock implements StockExchange {

	@Override
	public void getIPOStock(String stockname) {
		
		
	}

	@Override
	public void getIntradayStock(String stockname) {
		System.out.println("This is a BSE Intraday stock");
		
	}

	

}
