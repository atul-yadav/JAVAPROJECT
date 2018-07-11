package com.jda.algorithms;

import com.jda.utility.Utility2;

public class PrimePalindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <  1000; i++)
		{
		 if (Utility2.primePalindrome(i))
		 {
			 System.out.print(" " +i);
		 }

	}

}
}
