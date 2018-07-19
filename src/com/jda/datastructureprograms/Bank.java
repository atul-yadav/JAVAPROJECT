package com.jda.datastructureprograms;

import com.jda.utility.Queue;
import com.jda.utility.Utility2;

public class Bank {

	public static void main(String[] args) {
		Utility2 utility = new Utility2();
		BankSimulation transact = new BankSimulation();
		Queue<Integer> queue = new Queue<Integer>();

		int choice = 0;
	
		while(true) {
			System.out.println("1.Add person to queue "
					+ "2.Perform transaction "
					+ "3. Get status of queue "
					+ "4. Exit");
			choice = utility.inputInteger();
			if(choice>0 && choice<5) {
				switch(choice) {
				case 1:
					transact.addPerson(queue);
					continue;
				case 2:
					transact.performTransaction(queue);
					continue;
				case 3:
					transact.getStatus(queue);
					continue;
				case 4:
					return;
				}
			}
			else {
				System.out.println("Invalid input. Enter again");
				choice = utility.inputInteger();
			}
		}
		
		
	}

}
