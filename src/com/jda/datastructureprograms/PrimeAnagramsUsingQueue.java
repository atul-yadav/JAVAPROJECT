package com.jda.datastructureprograms;

import java.util.ArrayList;

import com.jda.utility.Queue;
import com.jda.utility.Utility2;

public class PrimeAnagramsUsingQueue {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility2 utility = new Utility2();
		ArrayList<Integer> array = utility.PrimesRange(1000);
		ArrayList<Integer>array1= new ArrayList<Integer>();
			for (int i = 0; i < array.size(); i++) {
				for (int j = i + 1; j < array.size(); j++) {
					boolean flag = utility.areAnagrams(Integer.toString(array.get(i)), Integer.toString(array.get(j)));
					//boolean bool = Utility2.areAnagram(Integer.toString(array.get(i)), Integer.toString(array.get(j)));
					if (flag) {
						array1.add(array.get(i));
						array1.add(array.get(j));

						}
				}

			}
			Integer[] array2 = new Integer[array.size()];
			array2 = array1.toArray(array2);
			
			Queue<Integer> queue = new Queue<Integer>();
			
			for (int i = 0; i < array1.size(); i++)
			{
				queue.enQueue(array2[i]);
			}
			
			for (int i = 0; i < array1.size(); i++)
			{
				System.out.println(queue.deQueue());
			}
			
			
			

}
}
