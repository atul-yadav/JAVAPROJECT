package com.jda.datastructureprograms;

import com.jda.utility.Utility2;

public class BalanceParanthesis {
	
	static class Stack
	{
		int top = -1;
		char items[] = new char[1000];
	
		void push(char x)
		{
			if (top == 999)
			{
				System.out.println("stack is full");
			}
			else
			{
				items[++top] = x;
			}
			
		}
		
		char pop()
		{
			if (top == -1)
			{
				System.out.println("stack is empty");
				return 0;
			}
			else
			{
				char element = items[top];
				top--;
				return element;
			}
			
		}
		
		boolean empty()
		{
			if (top == -1)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
		
		public static boolean isMatchingPair(char character1, char character2)
		    {
		       if (character1 == '(' && character2 == ')')
		       {
		         return true;
		       }
		       else
		       {
		    	   return false;
		       }
		
		
		    }
		
		 public static boolean balanced(char exp[], int l)
		 {
			 Stack stack = new Stack();
			 int i;
			 for (i = 0; i < l; i++) {
				 if (exp[i] == '(')
				 {
					 stack.push(exp[i]);
				 }
				 else if (exp[i] == ')')
				 {
					 if (stack.empty())
					 {
						 return false;
					 }
					 else if (isMatchingPair(stack.pop(),exp[i]))
					 {
						 return false;
					 }
				 }
			 }
			 if (stack.empty())
			 {
				 return true;
			 }
			 else
			 {
			 return false;
			 }
		
			
			 
		 }
 
	
		 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char []array = new char[1000];
		Utility2 utility = new Utility2();
		 
		String string;
		System.out.println("'Enter the expression");
		string = utility.inputString();
		char []array = string.toCharArray();
		int l = array.length;
		
		if (balanced(array,l))
		{
			System.out.println("yes balanced paranthesis");
		}
		else
		{
			System.out.println("No, paranthesis is not balanced");
			
		}
		
		
		
		
		
		
		

	}
	

}

