package com.jda.algorithms;

import com.jda.utility.Utility2;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility2  utility = new Utility2();
		
		System.out.println("enter the value");
		int  n = utility.inputInteger();
		utility.vendingMachine(n);

	}

}
