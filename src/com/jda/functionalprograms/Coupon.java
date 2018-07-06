package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class Coupon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility =  new Utility();
		System.out.println("Enter the number of coupons");
		int number = utility.inputInteger();
		System.out.println("Enter the coupon numbers");
		int a[] = new int [number];
		for (int i = 0; i <  number; i++)
		{
			a[i] = utility.inputInteger();
			
		}
		
		



		

	
		

	}

}
