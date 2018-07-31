package com.jda.objectorientedprograms;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.jda.utility.Utility2;

public class Stock1 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		Utility2 utility = new Utility2();

		int choice;
		do {
			System.out.println("1.Print value, 2.Sell shares, 3.Save transaction to file, 4.Print transactions");
			choice = utility.inputInteger();
			switch(choice) {
			case 1:
				System.out.println("Total value of all the shares in possession of the company is " + StockImplementation.valueOf());
				break;
				
			case 2:	
				System.out.println("Give the name the stock customer wants to buy");
				utility.inputString();
				String symbol = utility.inputString();
				System.out.println("Give the amount of money the customer wants to buy with");
				int amount = utility.inputInteger();
				StockImplementation.sell(amount, symbol);
				break;
				
			case 3:
				StockImplementation.save("C:\\\\Users\\\\1023340\\\\eclipse-workspace\\\\JAVAPROJECT\\\\src\\\\com\\\\jda\\\\objectorientedprograms\\\\input\\\\Transactions.json");
				break;
				
			case 4:
				StockImplementation.printReport();
				break;
			}
		}
		while(choice != 0);
		
	}

}
