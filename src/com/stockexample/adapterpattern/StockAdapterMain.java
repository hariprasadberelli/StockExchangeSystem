package com.stockexample.adapterpattern;

public class StockAdapterMain {

	public static void main(String[] args) {
		Stocks st = new Stocks();

		st.getStocks("nse", "PlatinumOne Business");
		st.getStocks("bse", "Vijaya Diagnostic");
		st.getStocks("nse", "Naapbooks");
		st.getStocks("gse", "AMI Organics");

	}

}
