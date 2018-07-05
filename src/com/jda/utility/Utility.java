package com.jda.utility;

import java.util.Scanner;

/**
 * @author atul
 *
 */
/**
 * @author bridgelabz
 *
 */
public class Utility {
	Scanner scanner;

	/**
	 *this constructor is for initializing scanner class
	 */
	public Utility() {
		scanner = new Scanner(System.in);
	}

	/**
	 * function to take user input as string
	 * @return  input
	 * input return to ReplaceString class
	 */
	public String inputString() {
		return scanner.next();
		
	}
	
	/**
	 * function to take user input as integer
	 * @return input  goes  to flipcoin class
	 */
	public int inputInteger() {
		int  input = scanner.nextInt();
		return input;
	}

	/**
	 * replaceString function replaces the given input string part to user input.
	 * @param template is given input passing to replaceString function
	 * @param name is user input by which we want to replace <<UserName>>
	 * @return
	 */
	public String replaceString(String template, String name) {
	  template = template.replace("<<UserName>>",name);
		return template;
	}
	
	/**
	*flip coin funtion is drive===
	
	*/
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





/**
 * function to check leap year or not 
 * @param year
 */
public void leapyear(int year)
{
	
	int count = 0;
	int temp = year;
	while (temp > 0)
	{
		temp = temp/10;
		count++;
	}
	
	
		if (count == 4)
		{
			if ((year % 4 == 0 || year % 400 == 0) && year %100 != 0)
			{
				System.out.println("Yes, this is leap year");
			}
			else
			{
				System.out.println("Not a leap year");
			}
		}
		else
		{
					System.out.println("Enter 4 digit number please");
			}
		}
	
	


/**
 * powervalue function computes the power value of given number
 * @param number
 */
public void powervalue(int number)
{
	int res = 1;
	int j = 2;
	System.out.println("table of number "+ number);
	for (int i = 0; i < number; i++)
	{
		res  = res *j;
		System.out.println(res);
	}
	
}

/**
 * harmonicValue is function for calculating nth harmonic value.
 * @param number is nth value for which harmonic value is to be calculated
 * @return nth harmonic value.
 */
public double harmonicValue(int number)
{
	double res = 0.0;
	for (int i = 1; i <= number; i++)
	{
		res = res + (1.0/i);
		System.out .println(i+"th harmonic value is  " + res);
	}
	return res;
}
}

