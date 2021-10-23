package com.stockexample.facadepattern;

public class StockFacadeMain {

	public static void main(String[] args) {
		
		Broker br = new Broker();
		
		br.buyBSE();
		br.buyIPO();
		br.buyNSE();

	}

}
