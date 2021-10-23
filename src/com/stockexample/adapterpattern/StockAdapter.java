package com.stockexample.adapterpattern;

public class StockAdapter implements NSEBSEStocks {

	StockExchange se;
	
	
	public StockAdapter(String stockType) {
		if(stockType.equalsIgnoreCase("NSE")) {
			se = new ViewNSEStock();
		}
		else if(stockType.equalsIgnoreCase("BSE")) {
			se = new ViewBSEStock();
		}
	}


	@Override
	public void getStocks(String stockType, String stockName) {
		
		if(stockType.equalsIgnoreCase("NSE")) {
			se.getIPOStock(stockName);
		}
		else if(stockType.equalsIgnoreCase("BSE")) {
			se.getIntradayStock(stockName);
		}
	} 


	

}
