package com.stockexample.commandpattern;

public class StockMain {

	public static void main(String[] args) {
		 Stock stock1 = new Stock("HDFC","Mark",10);
		 Stock stock2 = new Stock("Muthoot","Jack",40);
		 Stock stock3 = new Stock("Reliance","Peter",70);

	      BuyStock buyStockOrder1 = new BuyStock(stock1);
	      BuyStock buyStockOrder2 = new BuyStock(stock2);
	      BuyStock buyStockOrder3 = new BuyStock(stock3);
	      SellStock sellStockOrder1 = new SellStock(stock1);
	      SellStock sellStockOrder2 = new SellStock(stock2);

	      Broker broker = new Broker();
	      broker.takeOrder(buyStockOrder1);
	      broker.takeOrder(buyStockOrder2);
	      broker.takeOrder(buyStockOrder3);
	      broker.takeOrder(sellStockOrder1);
	      broker.takeOrder(sellStockOrder2);

	      broker.placeOrders();
	   }

	}


