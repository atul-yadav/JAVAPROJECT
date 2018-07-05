package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class Harmomic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility =  new Utility();
		while (true) {
		System.out.println("Enter the hormonic  value");
		int number = utility.inputInteger();
		double result = utility.harmonicValue(number);
		if (number != 0)
		{
			System.out.println(number +"th harmonic value is  "+ result);
		}
		else
		{
			System.out.println("enter the value other than zero");
		}

	}
	}

}
