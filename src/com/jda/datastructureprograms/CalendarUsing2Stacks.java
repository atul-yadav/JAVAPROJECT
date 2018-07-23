package com.jda.datastructureprograms;

import java.util.HashMap;
import com.jda.utility.QueueUsingStacks;
import com.jda.utility.Utility2;

public class CalendarUsing2Stacks {
	public static void main(String args[]) {
		Utility2 utility = new Utility2();
		HashMap<Integer, QueueUsingStacks<Integer>> week = new HashMap<>();
		for (int i = 0; i < 6; i++) {
			week.put(i, null);
		}

		System.out.println("please enter the month");
		int month = utility.inputInteger();
		System.out.println("please enter the year");
		int year = utility.inputInteger();
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (month == 2 && utility.leapyear(year))
			days[month] = 29;
		System.out.print(" " + months[month] + " " + year);
		System.out.println();
		System.out.print("  S  M Tu  W Th  F  S");
		System.out.println();
		int d = Utility2.dayOfWeek(1, month, year);
		int count = 1;
		for (int i = 0; i < 6; i++) {
			QueueUsingStacks<Integer> queue = new QueueUsingStacks<Integer>();
			week.put(i, queue);
			for (int j = 0; j < 7; j++) {
				if (i == 0 && j < d)
					week.get(i).enqueue(0);
				else {
					if (count <= days[month]) {
						week.get(i).enqueue(count);
						count++;
					} else
						week.get(i).enqueue(0);
				}

			}

		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				int temp = week.get(i).dequeue();
				if (temp <= 9) {
					if (temp == 0)
						System.out.print("   ");
					else
						System.out.print("  " + temp);
				} else
					System.out.print(" " + temp);
			}
			System.out.println();
		}
	}
}