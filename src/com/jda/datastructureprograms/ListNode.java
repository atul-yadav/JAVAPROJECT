package com.jda.datastructureprograms;

public class ListNode
{
	public ListNode nextNode;
	public String data;
	public int data1;
	
	
	public ListNode()
	{
		this.nextNode=null;
	}

	public void setData(String data)
	{
		this.data=data;
		nextNode=null;
	}
	
}