package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility =  new Utility();
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		System.out.println(utility.getDistance(x, y));
		

	}

}
