package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class Sumzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility =  new Utility();
		System.out.println("Enter the array size");
		int size= utility.inputInteger();
		int []array = new int[size];
		for (int i = 0; i <  size; i++)
	    {
	        
	        array[i] = utility.inputInteger();
		
	    }
		utility.sumzero(array,size);

}
}
