package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility =  new Utility();
		System.out.println("Enter th power value");
		int number = utility.inputInteger();
		utility.powervalue(number);

	}

}
