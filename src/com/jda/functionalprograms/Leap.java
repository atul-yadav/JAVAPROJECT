package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility =  new Utility();
		System.out.println("Enter the year");
		int  year= utility.inputInteger();
		utility.leapyear(year);

	}

}
