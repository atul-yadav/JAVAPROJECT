package com.jda.objectorientedprograms;

import java.util.List;

import com.jda.utility.Company;

public interface StockAccount {
	public long valueOf(List<Company> company);
	public void buy(String name);
	public void sell(String name);
	public void save(String filename,String name);
	public void printReport();
}