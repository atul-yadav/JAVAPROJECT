package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility =  new Utility();
		System.out.println("enter the row size");
		int m = utility.inputInteger();
		System.out.println("enter the column size");
		int n = utility.inputInteger();
		int  [][] array = new int [m][n];
		utility.printArray(array, m, n);
	}

}
