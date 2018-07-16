package com.jda.datastructureprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import com.jda.utility.Utility2;

public class UnOrderedList1
{
    
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Utility2 utility = new Utility2();
		
		List<String> myLinkedList = new List<String>();
		String[] strings;
		BufferedReader bufferedReader = null;
		try 
		{
			FileReader fileReader = new FileReader("C:\\Users\\1023340\\Documents\\JAVAPROJECT\\word.txt");
			bufferedReader = new BufferedReader(fileReader);
			String line;
			while((line = bufferedReader.readLine()) != null)
			{
				line = line.replaceAll("\\.", "");
				strings = line.split(" ");
				//System.out.println("strings in file already present");
				System.out.println(strings);
				for(String s: strings) 
				{
					myLinkedList.add(s);
				}
			}			
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File Not Found");		
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				bufferedReader.close();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("displaying initial strings present in file");
		myLinkedList.display();
		
		System.out.println("Enter a word to be searched ");
		String search = utility.inputString();
		int pos;
		
		if((pos = myLinkedList.index(search)) == -1)
		{
			System.out.println("word not found");
			myLinkedList.add(search);
		}
		else
		{
			System.out.println("word found and removing");
			
			myLinkedList.remove(search);
		}
		try {
			int size = myLinkedList.size();
			PrintWriter printWriter = new PrintWriter("C:\\Users\\1023340\\Documents\\JAVAPROJECT\\word.text");
			for(int i = 0; i < size; i++)
			{
				String st = myLinkedList.pop(0);
				System.out.print(st+ " ");
				printWriter.write(st + " ");
			}
			printWriter.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
	
	}
}