package com.jda.datastructureprograms;

import com.jda.utility.Deque;
import com.jda.utility.Utility2;
import com.jda.utility.Deque.Dqnode;

public class PalindromeChecker {
	public static boolean palindromechecker(char[] inputarray) {
		Deque<Character> dq = new Deque<Character>();
		for(int i=0;i<inputarray.length;i++)
		{
			dq.insertRear(inputarray[i]);
			
		}
		while (dq.size > 1) {
			Dqnode<Character> first = dq.deleteFront();
			Dqnode<Character> last = dq.deleteRear();
			if (first.value != last.value)
				return false;
		}
		return true;
	}

	public static void main(String args[]) {
		System.out.println("please enter the string");

		Utility2 utility = new Utility2();
		String input = utility.inputString();
		char[] inputarray = input.toCharArray();
		boolean bool = palindromechecker(inputarray);
		if (bool)
			System.out.println("Entered string is a palindrome");
		else
			System.out.println("entered string is not a palindrome");
	}
}