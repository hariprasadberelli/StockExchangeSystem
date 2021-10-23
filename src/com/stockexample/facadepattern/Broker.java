package com.stockexample.facadepattern;

public class Broker {

	private Stock bse;
	private Stock nse;
	private Stock ipo;
	public Broker() {
		bse = new BSEStock();
		nse = new NSEStock();
		ipo = new IPOStock();
		
	}
	
	public void buyBSE() {
		bse.buyStock();
	}
	public void buyNSE() {
		nse.buyStock();
	}
	public void buyIPO() {
		ipo.buyStock();
	}
}
