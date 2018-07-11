package com.jda.functionalprograms;

import com.jda.utility.Utility2;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility2 utility =  new Utility2();
		System.out.println("Enter the value of  a");
		double a = utility.inputDouble();
		System.out.println("Enter the value of  b");
		double b = utility.inputDouble();
		System.out.println("Enter the value of  c");
		double c = utility.inputDouble();
		utility.quadratic(a,b,c);
	}

}
