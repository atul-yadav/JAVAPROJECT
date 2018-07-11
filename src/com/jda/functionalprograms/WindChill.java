package com.jda.functionalprograms;

import com.jda.utility.Utility2;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility2 utility = new  Utility2();
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		if (t > 50 &&( v > 120 || v < 3))
		{
			System.out.println("invalid input, please enter another value");
			
			
		}
		else
		{
		
		utility.windChill(t, v);
		}
		
		

	}

}

