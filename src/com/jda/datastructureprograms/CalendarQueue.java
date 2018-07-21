package com.jda.datastructureprograms;

import java.util.HashMap;

import com.jda.utility.Queue;
import com.jda.utility.Utility2;

public class CalendarQueue {
	
	
	public static void main(String[] args) {
    	Utility2 utility = new Utility2();
    	System.out.println("enter the month");
        int month = utility.inputInteger();
        System.out.println("enetr the year");
        int year = utility.inputInteger();   

       
        String[] months = {
            "",                               
            "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"
        };

        int[] days = {
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        
        if (month == 2 && utility.leapyear(year))
        	days[month] = 29;
        System.out.println("   " + months[month] + " " + year);
        System.out.println(" S  M  Tu  W  Th  F  S");

        
        int d = Utility2.dayOfWeek(1, month, year);
        int array[][] = new int[7][7];
        HashMap<Integer, Queue<Integer>> weekDay = new HashMap<>();
		for (int i = 0; i < 7; i++) {
			weekDay.put(i, null);
		}

        int count=1;
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(i==0&&j<d)
					weekDay.get(i).enQueue(0);
					
				else
				{
					if(count<=days[month])
					{
						weekDay.get(i).enQueue(count);
						count++;
					}
					else
						weekDay.get(i).enQueue(0);
				}
				
			}
			
		}
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				int temp = weekDay.get(i).deQueue();
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
