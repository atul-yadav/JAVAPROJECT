package com.jda.datastructureprograms;

import com.jda.utility.Utility2;

public class PrimeInRange {
	
	public static void main(String[] args) {
	Utility2 utility = new Utility2();
	int count = 0;
	
	for (int i = 0; i < 1000; i++)
	{
		if (Utility2.isPrime(i))
		{
			count++;
		}
		if (i == 100)
		{
			break;
		}
	}
	

	
	int array[][] = new int[10][count];
	
	
	int i,j,k;
	for (i = 0; i < 10; i++)
	{
		for (j = 0; j < count; j++)
		{
			array[i][j] = 0;
		}
	}
	j = 0;
	
	for (i = 0; i < 1000; i++)
	{
		if (Utility2.isPrime(i))
		{
			if (i < 100)
			{
				array[0][j++] = i;
				if (j == count)
				{
					j = 0;
				}
			}
			if (i > 100 && i < 200)
			{
				array[1][j++] = i;
				if (j == count)
				{
					j = 0;
				}
			}
			if (i > 200 && i < 300)
			{
				array[2][j++] = i;
				if (j == count)
				{
					j = 0;
				}
			}
			if (i > 300 && i < 400)
			{
				array[3][j++] = i;
				if (j == count)
				{
					j = 0;
				}
			}
			if (i > 400 && i < 500)
			{
				array[4][j++] = i;
				if (j == count)
				{
					j = 0;
				}
			}
			if (i > 500 && i < 600)
			{
				array[5][j++] = i;
				if (j == count)
				{
					j = 0;
				}
			}
			if (i > 600 && i < 700)
			{
				array[6][j++] = i;
				if (j == count)
				{
					j = 0;
				}
			}
			if (i > 700 && i < 800)
			{
				array[7][j++] = i;
				if (j == count)
				{
					j = 0;
				}
			}
			if (i > 800 && i < 900)
			{
				array[8][j++] = i;
				if (j == count)
				{
					j = 0;
				}
			}
			if (i > 900 && i < 1000)
			{
				array[9][j++] = i;
				if (j == count)
				{
					j = 0;
				}
			}
			
		}
	}
	
	
	for(i=0; i<10; i++)
    {
        for(k=0; k<count; k++)
            {
        		if (array[i][k] == 0)
        		{
        			continue;
        		}
        		//String str = .toString();
                System.out.format(array[i][k]+ "  ");
              //  System.out.format("%5d");
        	}
            
        System.out.println();
    }
	
	
	
	}
	

}
