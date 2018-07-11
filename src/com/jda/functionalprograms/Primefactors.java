package com.jda.functionalprograms;

import com.jda.utility.Utility2;

public class Primefactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility2 utility =  new Utility2();
		while(true)
		{
		System.out.println("Enter the number");
		int number = utility.inputInteger();
		utility.primeFactors(number);
		}
	}

}
