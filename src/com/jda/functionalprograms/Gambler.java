package com.jda.functionalprograms;

import com.jda.utility.Utility2;

public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility2 utility =  new Utility2();
		System.out.println("Enter the stake value");
		int stake = utility.inputInteger();
		System.out.println("Enter the goal  value");
		int goal = utility.inputInteger();
		System.out.println("Enter the number of trials");
		int trials = utility.inputInteger();
		utility.gambler(stake, goal, trials);
		
		

	}

}
