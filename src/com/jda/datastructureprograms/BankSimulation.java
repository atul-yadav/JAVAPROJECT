package com.jda.datastructureprograms;

import com.jda.utility.Queue;
import com.jda.utility.Utility2;

public class BankSimulation {

	static Integer CASH_BALANCE = 15000;
	Utility2 utility = new Utility2();
	
	public void addPerson(Queue<Integer> queue) {
		System.out.println("1.Deposit 2.Withdraw");
		int choice = utility.inputInteger();
		while(true) {
			if(choice>0 && choice<3) {
				switch(choice) {
					case 1:
						deposit(queue);
						return;
					case 2:
						withdraw(queue);
						return;
				}
			}
			else {
				System.out.println("Invalid input. Enter 1 or 2");
				choice = utility.inputInteger();
			}
		}
	}

	private void withdraw(Queue<Integer> queue) {
		
		System.out.println("Enter amount to withdraw");
		int amount = utility.inputInteger();
		queue.enQueue(-amount);
		System.out.println("Request Enqueued");
		return;
	}

	private void deposit(Queue<Integer> queue) {
		System.out.println("Enter amount to deposit");
		int amount = utility.inputInteger();
		queue.enQueue(amount);
		System.out.println("Request Enqueued.");
		return;
	}

	public void performTransaction(Queue<Integer> queue) {
		System.out.println("Performing transaction");
		if(queue.isEmpty()) {
			System.out.println("No request to process");
			return;
		}
		int amount = queue.deQueue();
		int check = CASH_BALANCE + amount;
		if(check<0) {
			System.out.println("Insufficient balance.");
			return;
		}
		else {
			if(amount<0) {
				System.out.print("Withdrawl request : " + (-amount) + "\n");
			}
			else {
				System.out.println("Deposit request : " + amount + "\n");
			}
			System.out.println("Balance before : " + CASH_BALANCE);
			CASH_BALANCE += amount;
			System.out.println("Request processed. Available  cash balance : " + CASH_BALANCE);
		}
		return;
	}

	public void getStatus(Queue<Integer> queue) {
		int size = queue.getSize();
		System.out.print("Number of people in queue " + size + "\n");
		if(size<1)
			return;
		System.out.println("Queue status : ");
		queue.printQueue();
	}
}