package com.jda.datastructureprograms;

import java.util.ArrayList;
import com.jda.utility.Utility2;

public class PrimeNumber2DArray {

	public static void main(String args[]) {
		
		Utility2 utility = new Utility2();
		int count = 0;
		
		for (int i = 0; i < 1000; i++)
		{
			if (Utility2.isPrime(i))
			{
				count++;
			}
			if (i == 100)
			{
				break;
			}
		}
		
		String[][] primeNumbers = new String[10][count];
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 2; i <= 1000; i++) {
			if (Utility2.isPrime(i))
				array.add(i);
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < count; j++) {
				primeNumbers[i][j] = " ";

			}
		}
		
		int row = 0;
		int column = 0;
		
		for (int i = 0; i < array.size(); i++) {
			if (row != (array.get(i))/100) {
				row = (array.get(i))/100;
				column = 0;
			}
			primeNumbers[row][column]=Integer.toString(array.get(i));
			column++;
		}
		
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < count; j++) {
				System.out.print(primeNumbers[i][j]+"  ");

			}
			System.out.println();
		}
	
		
		
		
		
		
		
		
				
				
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
				
		/*
		String[][] primenumbers = new String[10][25];
		Utility2 utility = new Utility2();
		ArrayList<Integer> array = utility.Primesret(1000);
		int row = 0;
		int coloumn = 0;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 25; j++) {
				primenumbers[i][j] = " ";

			}
		}

		for (int i = 0; i < array.size(); i++) {
			if (row != (array.get(i))/100) {
				row = (array.get(i))/ 100;
				coloumn = 0;
			}
			primenumbers[row][coloumn]=Integer.toString(array.get(i));
			coloumn++;
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 25; j++) {
				System.out.print(primenumbers[i][j]+"  ");

			}
			System.out.println();
		}
		*/

	}
	
}

