package com.jda.utility;



public class Queue<T extends Comparable<T>> {
	public Qnode<T> front = null;
	public Qnode<T> rear = null;

	

	public Queue() {
		rear = front = null;
	}

	public void enqueue(T data) {
		Qnode<T> newnode = new Qnode<T>(data);
		if (rear == null) {
			rear = front = newnode;
			return;
		}
		rear.next = newnode;
		rear = newnode;
	}

	public Qnode<T> dequeue() {
		if (front == null)
			return null;
		Qnode<T> temp=front;
		front = front.next;
		if (front == null)
			rear = null;
		return temp;

	}
	
}
