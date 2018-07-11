package com.jda.algorithms;

import com.jda.utility.Utility2;

public class searchSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility2  utility = new Utility2();
		
		System.out.println("enter the size of array");
		int  n = utility.inputInteger();
		
		Integer arr [] = new Integer [n];
		System.out.println("enter the  elements");
		int i = 0;
		for ( i = 0; i < n; i++)
		{
			arr[i] = utility.inputInteger();
		}
		arr = Utility2.insertionSort(arr);
		System.out.println();
		System.out.println("enter element to be searched");
	
		Integer  x = utility.inputInteger();
	 int  mid =	Utility2.binarySearch(arr,x,0,n-1) ;
		if (mid == -1)
		{
			System.out.println("element not found");
		}
		else
		{
			System.out.println("element found");
		}
	
		
		
		
		
		

	}

}
