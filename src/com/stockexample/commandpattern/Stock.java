package com.stockexample.commandpattern;

public class Stock {

	private String stockName;
	private String custName;
	   private int quantity;

	   
	  
	public Stock(String stockName, String custName, int quantity) {
		super();
		this.stockName = stockName;
		this.custName = custName;
		this.quantity = quantity;
	}
	public void buy(){
	      System.out.println("Stock "+stockName+", bought by "+custName+" of Quantity: " + quantity);
	   }
	   public void sell(){
	      System.out.println("Stock "+stockName+", sold by "+custName+" of Quantity: " + quantity);
	   }
}
