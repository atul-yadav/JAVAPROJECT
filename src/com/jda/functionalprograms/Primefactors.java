package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class Primefactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility =  new Utility();
		while(true)
		{
		System.out.println("Enter the number");
		int number = utility.inputInteger();
		utility.primeFactors(number);
		}
	}

}
