package com.stockexample.adapterpattern;

public interface StockExchange {

	public void getIPOStock(String stockname);
	public void getIntradayStock(String stockname);
}
