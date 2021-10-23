package com.stockexample.factorypattern;

public class StockBroker {

	public Stock getstock(String stockType){
	      if(stockType == null){
	         return null;
	      }		
	      if(stockType.equalsIgnoreCase("NSE")){
	         return new NSEStock();
	         
	      } else if(stockType.equalsIgnoreCase("BSE")){
	         return new BSEStock();
	         
	      } else if(stockType.equalsIgnoreCase("IPO")){
	         return new IPOStock();
	      }
	      
	      return null;
	   }
}
