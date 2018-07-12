package com.jda.algorithms;

import com.jda.utility.Utility2;
/**
 * @author atul
 *
 */


public class DayofWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      int d = Integer.parseInt(args[0]);
      int m = Integer.parseInt(args[1]);
      int y= Integer.parseInt(args[2]);
      int day = Utility2.dayOfWeek(d, m, y);
      System.out.println(day);

	}

}
