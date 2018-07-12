package com.jda.algorithms;

import com.jda.utility.Utility2;

public class IntermediateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Enter the number");
		Utility2  utility = new Utility2();
		
		 	int n = utility.inputInteger();  
	
	        System.out.println("any integer  between 0 " + "  " +n);
	        int  search = Utility2.binarySearch1(0, n);
	        System.out.println("my numer =  "+ search);
		
		
		

	}

}
