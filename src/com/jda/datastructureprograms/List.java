package com.jda.datastructureprograms;



public class List<T>{

	MyNode<T> head;	
	MyNode<T> current;	
	int position;

	public List(){
		head = null;
		current = null;
		position = -1;
	}

	public void add(T data){
		MyNode<T> node = new MyNode<T>(data);
		if(head == null){
			head = node;
			current = head;
		}
		else{
			current.next = node;
			current = current.next;
		}
		position++;
	}
	
	
	public void remove(T data){
		MyNode<T> tempCurrent = head;
		MyNode<T> tempPrev = null;
		while(!tempCurrent.data.equals(data)){
			tempPrev = tempCurrent;
			tempCurrent = tempCurrent.next;
		}
		if(tempCurrent == head){
			head = head.next;
		}
		else{
			tempPrev.next = tempCurrent.next;
		}
		if(tempCurrent == current){
			current = tempPrev;
		}
		position--;
	}
	
	/**
	 * @param data - elements to be searched in the list
	 * @returns true if the element is in the list else returns false
	 */
	public boolean search(T data){
		 
		if (index(data) == -1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	/**
	 * @returns true if the list is empty else returns false
	 */
	public boolean isEmpty(){
		if (position == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	/**
	 * @returns size(number of elements) of the list
	 */
	public int size(){
		return position + 1;
	}
	
	
	/**
	 * @param data - data to be added
	 * adds data to the end of the list
	 */
	public void append(T data){
		add(data);
	}
	
	
	/**
	 * @param data - element whose position is to be found out
	 * @returns position of the element in the list if it is in the list 
	 * else returns -1
	 */
	public int index(T data){
		if(position == -1){
			return -1;
		}
		MyNode<T> tempCurrent = head;
		int tempPosition = 0;
		
		while(!tempCurrent.data.equals(data)){
			if(tempCurrent == current) {
				return -1;
			}
			tempCurrent = tempCurrent.next;
			tempPosition++;
		}
		return tempPosition;
	}

	
	/**
	 * @param pos , data- inserts element 'data' at 'pos' position
	 */
	public void insert(int pos , T data){

		if((pos == position+1) || (position == -1)){
			add(data);
		}
		else if(pos == 0){
			MyNode<T> tempNode = head;
			head = new MyNode<T>(data);
			head.next = tempNode;
		}
		else{
			MyNode<T> tempCurrent = head;
			MyNode<T> tempPrev = null;
			int tempPosition = 0;
			while(tempPosition <= pos + 1){
				tempPrev = tempCurrent;
				tempCurrent = tempCurrent.next;
				tempPosition++;
			}
			MyNode<T> newNode = new MyNode<T>(data);
			newNode.next = tempCurrent;
			tempPrev.next = newNode;
		}
		position++;
	}
	
	/**
	 * @param location - pops elements at given location
	 * @returns element popped 
	 */
	public T pop(int location){
		MyNode<T> tempCurrent = head;
		MyNode<T> tempPrev = null;
		int tempPosition = 0;
		position--;
		while(tempPosition != location){
			tempPrev = tempCurrent;
			tempCurrent = tempCurrent.next;
			tempPosition++;
		}
		if(tempCurrent == head){
			head = head.next;
			return tempCurrent.data;
		}
		else if(tempCurrent == current){
			current = tempPrev;
			tempPrev.next = tempCurrent.next;
			return tempCurrent.data;
		}
		else{
			tempPrev.next = tempCurrent.next;
			return tempCurrent.data;
		}
	}
	
	/**
	 * @return pops and returns last element in the list
	 */
	public T pop(){
		return pop(position);
	}
	
	/**
	 * prints all the elements in the list
	 */
	public void display(){
		MyNode<T> tempCurrent = head;
		while(tempCurrent != null){
			System.out.print(tempCurrent.data + " ");
			tempCurrent = tempCurrent.next;
		}
		System.out.println();
	}	
}
class MyNode<T>{
	T data;	
	MyNode<T> next;	
	
	MyNode(T data){
		this.data = data;
		next = null;
	}



}