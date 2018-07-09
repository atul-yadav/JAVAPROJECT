package com.jda.algorithms;

import com.jda.utility.Utility;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility =  new Utility();
		System.out.println("Enter the string1");
		String s1 = utility.inputString();
		System.out.println("Enter the string2");
		String s2 =utility.inputString() ;
		
		s1 = 	s1.toLowerCase();
		s2 = s2.toLowerCase();
		 s1= s1.replaceAll("\\s+","");
		 s2 = s2.replaceAll("\\s+","");
		 System.out.println(s1);
		 System.out.println(s2);
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();
		
      if (Utility.areAnagram(str1, str2))
      {
          System.out.println("The two strings are anagram");
      }
      else
      {
          System.out.println("The two strings are not anagrams");
      }
		

	}

}
