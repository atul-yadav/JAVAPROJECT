package com.jda.algorithms;

import com.jda.utility.Utility;

public class PrimeChecker {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Utility utility =  new Utility();
		for (int i = 0; i <  1000; i++)
		{
		 if (Utility.isPrime(i))
		 {
			 System.out.print(" "+ i);
		 }
		}

}
}
