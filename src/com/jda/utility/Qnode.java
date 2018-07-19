package com.jda.utility;



public class Qnode<T> {
	
		public T value;
		public Qnode<T> next;
		Qnode(T data) {
			value = data;
			
			next = null;
		}
	}

