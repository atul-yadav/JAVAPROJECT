package com.jda.utility;

public class Node<T>{
	public T data;
	public Node<T> next;
	public Node(T t){
		data = t;
		next = null;
	}

}