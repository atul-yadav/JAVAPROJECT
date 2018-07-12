package com.jda.algorithms;

import com.jda.utility.Utility2;

public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double P = Double.parseDouble(args[0]);
		double Y = Double.parseDouble(args[1]);
		double R = Double.parseDouble(args[2]);
		
		
		System.out.println("Monthly payment = "+ Utility2.monthlyPayment(P, Y, R));

	}

}
