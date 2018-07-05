package com.jda.functionalprograms;

import com.jda.utility.Utility;

/**
 * @author atul
 *
 */
public class Flipcoin {
	/**
	 * @param number
	 
	public void flipcoin(int number)
	{
		int noOfHeads = 0;
		
		int noOfTails = 0;
		int noOftoss = number;
		
		for (int i = 0; i < number; i++)
		{
			double random = Math.random();
			System.out.println(random);
			if (random < 0.5)
			{
				noOfTails++;
			}
			else
			{
				 noOfHeads++;
			}
			
		}
		System.out.println("no of heads = "+ noOfHeads);
		System.out.println("no of tails = " + noOfTails);
		System.out.println("percentage of head = "+ (double)(noOfHeads*100)/noOftoss) ;
		System.out.println("percentage of head = "+ (double)(noOfTails*100)/noOftoss) ;
		
	}
	*/
	
	public static void main(String[] args) {
		
		Utility utility =  new Utility();
		System.out.println("Enter the number of times the coin to flipped");
		int number = utility.inputInteger();
		//Flipcoin flip = new  Flipcoin();
	//	flip.flipcoin(number);
		utility.flipcoin(number);
		
	}
	

}

