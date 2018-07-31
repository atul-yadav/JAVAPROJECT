package com.jda.objectorientedprograms;

import java.io.IOException;
import java.util.Date;

import org.json.simple.parser.ParseException;

import com.jda.utility.Utility2;



public class StockManager {
	
	public static void main(String[] args) throws IOException, ParseException, Exception {
		Utility2 utility = new Utility2();
		StockAccountImpl stockAccount = new StockAccountImpl();
		Date date = new Date();
		System.out.println(date.toString());
		String file = "Company";
		stockAccount.read(file);
		stockAccount.read("Transaction");
		String name;
		int loopClinic = 0;
		while(loopClinic==0) {
			
			int choice = utility.inputInteger();
			switch(choice) {
			case 1:
				stockAccount.create();
				stockAccount.close();
				break;
			case 2:
				stockAccount.close();
				int loopMenu = 0;
				System.out.println("\n\t\t\tEnter the name of account");
				name = utility.inputString();
				stockAccount.read(name);
				while (loopMenu == 0) {
					if(stockAccount.checkAddress(name)) {
					
					System.out.println("\n\t\t\tEnter your choice");
					int ch = utility.inputInteger();
					switch (ch) {
					case 1:
						stockAccount.addMoney();
						break;
					case 2:
						stockAccount.buy(name);
						break;
					case 3:
						stockAccount.sell(name);
						break;
					case 4:
						stockAccount.save(file,name);
						break;
					case 5:
						int loopDisplay=0;
						while(loopDisplay==0) {
							
							int choiceDisplay = utility.inputInteger();
							switch(choiceDisplay) {
							case 1:
								stockAccount.printReport();
								break;
							case 2:
								stockAccount.printCustomer();
								break;
							case 3:
								stockAccount.printTransaction();
								break;
							case 4:
								loopDisplay=1;
								System.out.println("\n\t\t\tDisplay menu closed");
								break;
							default:
								loopDisplay=1;
								System.out.println("\n\t\t\tSomething went wrong\n\t\t\tDisplay menu closed");
								break;
							}
						}
						
						
						break;
					case 6:
						System.out.println("\n\t\t\tMenu closed...!!!");
						loopMenu = 1;
						break;
					default:
						System.out.println("\n\t\t\tSomething went wrong\n\t\t\tMenu closed");
						loopMenu = 1;
						break;
					
						
					}
					
					}else {
						System.out.println("\n\t\t\tYou are not registered\n\t\t\tPlease Create Account");
						loopMenu=1;
					}
				}

				break;
			case 3:
				stockAccount.addRemoveCompany();
				break;
			case 4:
				System.out.println("\n\t\t\tSystem closed\n\t\t\tThank You");
				loopClinic=1;
				break;
			default:
				System.out.println("\n\t\t\tSomething went wrong\n\t\t\tSystem closed\n\t\t\tThank You");
				loopClinic=1;
				break;
			}
		}
	}
}
