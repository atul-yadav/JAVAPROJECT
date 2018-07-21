package com.jda.datastructureprograms;

import com.jda.utility.Utility2;

public class NoOfBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility2 utility = new Utility2();
		
		System.out.println("Enter the number of nodes");
		int number = utility.inputInteger();
		System.out.println("Number of Bst = "+ utility.noOfBst(number));


	}

}
