package com.jda.datastructureprograms;

import java.util.ArrayList;

import com.jda.utility.Utility2;


public class PrimeAnagrams2DArray {
	public static void main(String args[]) {
		Utility2 utility = new Utility2();
		ArrayList<Integer> array = utility.PrimesRange(1000);
		ArrayList<Integer>array1= utility.PrimesRange(1000);
		String[][] primenumbers = new String[10][25];
		int row = 0;
		int coloumn = 0;


			String[][] primeAnagram = new String[79][2];
			
			

			for (int i = 0; i < 79; i++) {
				for (int j = 0; j < 2; j++) {
					primeAnagram[i][j] = " ";

				}
			}
			
			for (int i = 0; i < array.size(); i++) {
				for (int j = i + 1; j < array.size(); j++) {
					boolean flag = utility.areAnagrams(Integer.toString(array.get(i)), Integer.toString(array.get(j)));
					//boolean bool = Utility2.areAnagram(Integer.toString(array.get(i)), Integer.toString(array.get(j)));
					if (flag) {
						primeAnagram[row][coloumn] = Integer.toString(array.get(i));
						primeAnagram[row][coloumn + 1] = Integer.toString(array.get(j));
						row++;
						coloumn = 0;
						array1.remove(array.get(i));
						array1.remove(array.get(j));
						
					}

				}

			}
			int j;
			System.out.println("anagrams which are prime");
			for (int i = 0; i < 79; i++) {
				for (j = 0; j < 2; j++) {
					System.out.print(primeAnagram[i][j] + " ");
					

				}

				System.out.println();
			}
			row=0;coloumn=0;
			System.out.println(" prime which are not anagrams ");
			for (int i = 0; i < array1.size();i++){
				if (row != (array1.get(i)/100)) {
					row = (array1.get(i)/100);
					coloumn = 0;
				}
				primenumbers[row][coloumn]=Integer.toString(array1.get(i));
				coloumn++;
			}

			for (int i = 0; i < 10; i++) {
				for ( j = 0; j < 25; j++) {
					if(primenumbers[i][j]==null)
						System.out.print(" ");
					else
					System.out.print(primenumbers[i][j]+"  ");

				}
				System.out.println();
			}

		}
		
	}


