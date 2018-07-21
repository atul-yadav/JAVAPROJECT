package com.jda.datastructureprograms;

import com.jda.utility.Utility2;

public class Calender { 


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
	        
	        int count=1;
			for(int i=0;i<7;i++)
			{
				for(int j=0;j<7;j++)
				{
					if(i==0&&j<d)
						array[i][j]=0;
					else
					{if(count<=days[month])
					{
						array[i][j]=count;
						count++;
					}
					else
						array[i][j]=0;
					}
					
				}
				
			}
			for(int i=0;i<7;i++)
			{
				for(int j=0;j<7;j++)
				{
					if(array[i][j]<=9)
				{if(array[i][j]==0)
					System.out.print("   ");
				else
					System.out.print("  "+array[i][j]);
				}
				else
					System.out.print(" "+array[i][j]);
				}
				System.out.println();
			}
	        
	        
	       
	        
	        
	       
	      
	       

	    }
	   
	}

