package com.jda.datastructureprograms;

import com.jda.utility.Utility2;

public class UnorderedList
{
     ListNode head;
	Utility2 utility =new Utility2();

	public UnorderedList()
	{
		try
		{
			head = utility.readFile(head);
			System.out.print("Enter the word to be searched");
			String word1=utility.inputString();
			
			head = utility.search(head,word1);
			String word2=" ";

			while(head != null)
			{
				word2=word2+head.data;
				word2=word2+" ";
				head=head.nextNode;
			}
			utility.writeToFile(word2);
		}
		catch(NullPointerException n)
		{
			System.out.println(n);
		}
	}  		

	public static void main(String[] args)
	{
		UnorderedList ul=new UnorderedList();
	}
}