package com.stockexample.adapterpattern;

public class Stocks implements NSEBSEStocks {

	StockAdapter sadapter;

	@Override
	public void getStocks(String stockType, String stockName) {
		if(stockType.equalsIgnoreCase("NSE")) {
			System.out.println("This is a IPO " + stockName +" stock");
		}
		else if(stockType.equalsIgnoreCase("NSE") || stockType.equalsIgnoreCase("BSE")){
			sadapter = new StockAdapter(stockType);
			sadapter.getStocks(stockType, stockName);
	      }
	      
	      else{
	         System.out.println("Invalid stock. " + stockType + " not prsent");
	      }
			
	}
	
	

}
