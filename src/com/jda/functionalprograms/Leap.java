package com.jda.functionalprograms;

import com.jda.utility.Utility2;

public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility2 utility =  new Utility2();
		System.out.println("Enter the year");
		int  year= utility.inputInteger();
		utility.leapyear(year);

	}

}
