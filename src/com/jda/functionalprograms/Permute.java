package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class Permute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility utility =  new Utility();
		System.out.println("Enter the string");
		String s = utility.inputString();
		int n = s.length();
   
		
      utility.permute(s, 0, n-1);
 

	}

}
