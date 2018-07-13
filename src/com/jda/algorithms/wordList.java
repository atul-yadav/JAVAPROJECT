package com.jda.algorithms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.jda.utility.Utility2;

public class wordList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Utility2 utility = new Utility2();
			FileReader file = null;
			String[] strings = null;	
			BufferedReader bufferedReader = null;
				try {
					file = new FileReader("/home/bridgelabz/workspace/Javaproject/src/com/jda/algorithms/word1.txt");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bufferedReader = new BufferedReader(file);
				String line;
				while((line = bufferedReader.readLine()) != null) {
					strings = line.split(",");	
				}
			
				bufferedReader.close();
			
			
			
		
			strings = Utility2.insertionSort(strings);
			
			int length = strings.length;
			System.out.print("Enter a word to search: ");
			String search = utility.inputString();
			
			
			if(Utility2.binarySearch(strings,search,0,length-1) != -1) {
				System.out.println("Word found in the file");
			}
			else {
				System.out.println("Word not found in the file");
			}
		
		}

	}


