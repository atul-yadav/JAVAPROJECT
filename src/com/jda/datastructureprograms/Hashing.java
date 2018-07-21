package com.jda.datastructureprograms;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

import com.jda.utility.OrderedList;
import com.jda.utility.Utility2;

public class Hashing {
	public static void main(String args[]) throws Exception {

		HashMap<Integer, OrderedList<Integer>> slot = new HashMap<>();
		for (int i = 0; i < 11; i++) {
			slot.put(i, null);
		}

		ArrayList<Integer> templist = new ArrayList<Integer>();
		Utility2 utility = new Utility2();
		System.out.println("enter the number to be searched");
		int search = utility.inputInteger();
		BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\1023340\\\\Documents\\\\JAVAPROJECT\\\\numbers.txt"));
		String line = null;
		while ((line = br.readLine()) != null) {
			String[] values = line.split(" ");
			for (String str : values) {
				templist.add(Integer.parseInt(str));
			}
		}
		br.close();
		Integer[] arr = new Integer[templist.size()];

		arr = templist.toArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			Integer remainder = arr[i] % 11;
			if (slot.get(remainder) == null) {
				OrderedList<Integer> list = new OrderedList<Integer>();
				slot.put(remainder, list);
				list.orderedAdd(arr[i]);
			} else {
				slot.get(remainder).orderedAdd(arr[i]);
			}
		}
		System.out.println("hash tables are");

		for (int i = 0; i < arr.length; i++) {
			if (slot.get(i) == null)
				System.out.println("slot is empty");
			else {
				System.out.print( i + " ----   ");
				slot.get(i).printList();
			}

		}
		int remsearch = search % 11;
		slot.get(remsearch).removeAt(search);
		
		System.out.println("Hash table after modification");
		for (int i = 0; i < arr.length; i++) {
			if (slot.get(i) == null)
				System.out.println("slot is empty");
			else {
				System.out.println(i + " ----");
				slot.get(i).printList();
			}

		}
	}
}
