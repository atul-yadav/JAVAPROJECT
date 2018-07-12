package com.jda.algorithms;

import com.jda.utility.Utility2;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility2  utility = new Utility2();
		
		while (true) {
		System.out.println("enter 1 for celsius as input and 2 for forenhite  as user input");
		int  n = utility.inputInteger();
		System.out.println("Enter the temperature");
		double temperature= utility.inputDouble();

	
		switch (n)
		{
		case 1: 
			System.out.println(utility.celsiusToForenhite(temperature));
			break;
		case 2:
			System.out.println(utility.forenhiteToCelsius(temperature));
			break;
		default:
			System.out.println("enter proper value");
		
			
		}

	}
	}

}
