package com.jda.algorithms;

import com.jda.utility.Utility2;

public class InsertionSortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility2  utility = new Utility2();
		
		System.out.println("enter the size of string array");
		int  n = utility.inputInteger();	
		String arr [] = new String[n];
		System.out.println("enter the  elements");
		int i = 0;
		for ( i = 0; i < n; i++)
		{
			arr[i] = utility.inputString();
		}
		arr = Utility2.insertionSort(arr);
		Utility2.printString(arr);
		
	}

}
