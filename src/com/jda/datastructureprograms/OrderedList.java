package com.jda.datastructureprograms;

import com.jda.utility.Utility2;

public class OrderedList {
	
	 	ListNode head;
		Utility2 utility =new Utility2();

		public OrderedList()
		{
			try
			{
				head = utility.readFile(head);
				System.out.print("Enter the number to be searched");
				int word1=utility.inputInteger();
				
				head = utility.searchInteger(head,word1);
				String word2=" ";

				while(head != null)
				{
					word2=word2+(char)head.data1;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderedList ul=new OrderedList();
	}

}
