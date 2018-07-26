package com.jda.objectorientedprograms;

import com.jda.utility.Utility2;

public class RegularExpression {
	
	public static void main(String args[]) throws Exception {
		Utility2 utility = new Utility2();
		
		String string = " Hello <<name>>, We have your full\r\n" + 
				"name as <<full name>> in our system. your contact number is 91­xxxxxxxxxx.\r\n" + 
				"Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.\r\n";
			
		
		System.out.println("Enter the first name");
		String firstName = utility.inputString();
		System.out.println("Enter the last name");
		String lastName = utility.inputString();
		System.out.println("Enter the phone number");
		String phoneNumber = utility.inputString();
		
		System.out.println("----------------------------------");
		
		System.out.println(utility.regularExpression(string, firstName, lastName, phoneNumber));
		
		

}
}
