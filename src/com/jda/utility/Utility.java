package com.jda.utility;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author atul
 *
 */

public class Utility {
	Scanner scanner;

	/**
	 * this constructor is for initializing scanner class object
	 */
	public Utility() {
		scanner = new Scanner(System.in);
	}

	/**
	 * function to take user input as string
	 * 
	 * @return input input return to ReplaceString class
	 */
	public String inputString() {
		return scanner.next();

	}

	/**
	 * function to take user input as integer
	 * 
	 * @return input goes to Flipcoin class
	 */
	public int inputInteger() {
		int input = scanner.nextInt();
		return input;
	}

	/**
	 * replaceString function replaces the given input string part to user input.
	 * 
	 * @param template
	 *           is given input passing to replaceString function
	 * @param name
	 *           is user input by which we want to replace <<UserName>>
	 * @return
	 */
	public String replaceString(String template, String name) {
		template = template.replace("<<UserName>>", name);
		return template;
	}

	/**
	 * flip coin funtion is drive===
	 * 
	 */
	public void flipcoin(int number) {
		int noOfHeads = 0;

		int noOfTails = 0;
		int noOftoss = number;

		for (int i = 0; i < number; i++) {
			double random = Math.random();
			System.out.println(random);
			if (random < 0.5) {
				noOfTails++;
			} else {
				noOfHeads++;
			}

		}
		System.out.println("no of heads = " + noOfHeads);
		System.out.println("no of tails = " + noOfTails);
		System.out.println("percentage of head = " + (double) (noOfHeads * 100) / noOftoss);
		System.out.println("percentage of head = " + (double) (noOfTails * 100) / noOftoss);

	}

	/**
	 * function to check leap year or not
	 * 
	 * @param year
	 */
	public void leapyear(int year) {

		int count = 0;
		int temp = year;
		while (temp > 0) {
			temp = temp / 10;
			count++;
		}

		if (count == 4) {
			if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) {
				System.out.println("Yes, this is leap year");
			} else {
				System.out.println("Not a leap year");
			}
		} else {
			System.out.println("Enter 4 digit number please");
		}
	}

	/**
	 * powervalue function computes the power value of given number
	 * 
	 * @param number
	 */
	public void powervalue(int number) {
		int res = 1;
		int j = 2;
		System.out.println("table of number " + number);
		for (int i = 0; i < number; i++) {
			res = res * j;
			System.out.println(res);
		}

	}

	/**
	 * harmonicValue is function for calculating nth harmonic value.
	 * 
	 * @param number
	 *           is nth value for which harmonic value is to be calculated
	 * @return nth harmonic value.
	 */
	public double harmonicValue(int number) {
		double res = 0.0;
		for (int i = 1; i <= number; i++) {
			res = res + (1.0 / i);
			System.out.println(i + "th harmonic value is  " + res);
		}
		return res;
	}

	/**
	 * primeFactor method is finding the prime factors of given number
	 * 
	 * @param number
	 *           the number is parameter for which we need find prime factors.
	 */
	public void primeFactors(int number) {
		System.out.println("Prime factors of  number  " + number + " " + "are  ");

		for (int i = 2; i * i <= number; i++) {

			while (number % i == 0) {

				System.out.println(i + " ");

				number = number / i;
			}

		}
		if (number > 1) {
			System.out.println(number);
		}
	}

	/**
	 * gambler function basically implement the logic of finding winning and losing percentage.
	 * @param stake is initial stake for gambler
	 * @param goal is gambler will win if he has cash equals goal
	 * @param trials is number of times he is playing
	 */
	public void gambler(int stake, int goal, int trials) {
		
		int numberOfWins = 0;
		int points;
		for (int i = 0; i < trials; i++) {
			points = stake;
			while (points > 0 && points < goal) {
				
				if (Math.random() < 0.5) {
					points++;
				} else {
					points--;
				}

			}
			if (points == goal) {
				numberOfWins++;
			}
		}
		System.out.println("Number of wins  =  " + numberOfWins);
		System.out.println("winning %  =  " +  ((double)numberOfWins / trials) * 100.00);
		System.out.println("losing  %  = " + (100.00 - ((double)numberOfWins / trials) * 100.00));
	}

	
	/**
	 * sumzero function finds the triplets and number of 
	 * triplets whose sum is zero.
	 * @param a is array which is taken as input
	 * @param n is size of array
	 */
	public void sumzero(int a[], int n) {
		boolean found = true;
		int count = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						System.out.print(a[i] + " ");
						System.out.print(a[j] + " ");
						System.out.print(a[k] + " ");

						count++;
						found = true;
					}

				}
			}
		}
		System.out.println();
		if (found == false) {
			System.out.println("No zero sum triplet exist");
		}
		System.out.println("Number of triplets  = " + count);

	}
	
	public void intArray(int [][] array,int m,  int n)
	{
	 System.out.println("enter the array elements");
		for (int i  = 0; i < m; i ++)
		{
			for (int j = 0; j < n;  j++)
			{
				array[i][j] = inputInteger();
			}
		}
	
	}
	
	public void printArray(int [][] array,int m, int n)
	{
		intArray(array,m,n);
		
		PrintWriter p  = new PrintWriter(System.out,true);
	    p.println("displaying 2d array");
	    for (int i = 0; i < m; i++)
	    {
	   	 for (int j = 0; j < n;  j++)
	   	 {
	   		 p.print(array[i][j]+" ");
	   	 }
	   	 p.println();
	    }
	}
	
	public static double getDistance(int x, int y) {
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return distance;
	}
	
	
	
}
