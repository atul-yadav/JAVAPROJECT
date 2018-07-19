package com.jda.utility;

public class Stack<T> {
	
	public Node top = null;
	class Node{
		T data;
		Node next;
		Node(T t)
		{
			data = t;
			next = null;
		}

	}
	public void push(T value) {
		Node newNode = new Node(value);
		if(top==null) {
			top = newNode;
		}
		else {
		newNode.next = top;
		top = newNode;
		}
		return;
	}
	
	public T pop() {
		Node temp = top;
		
		if(temp==null) {
			System.out.println("Empty stack");
			return null;
		}
		top = temp.next;
		return temp.data;
	}
	

	public T peek() {
		if(top==null) {
			System.out.println("Stack empty.");
			return null;
		}
		return top.data;
	}
	
	
	public void printStack() {
		Node temp = top;
		if(temp==null) {
			System.out.println("Empty stack");
			return;
		}
		System.out.print("Top->");
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(" ");
		return;
	}
}