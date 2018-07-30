package com.jda.stock;

import java.util.ArrayList;

public class CustomerAccount {
	
	private String name;
	private ArrayList<StockTuple> holdings;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<StockTuple> getHoldings() {
		return holdings;
	}
	public void setHoldings(ArrayList<StockTuple> holdings) {
		this.holdings = holdings;
	}

}