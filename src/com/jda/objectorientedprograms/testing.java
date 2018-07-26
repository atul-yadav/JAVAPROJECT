package com.jda.objectorientedprograms;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class testing
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		HashMap newmap = new HashMap();

      // populate hash map
      newmap.put(1, "tutorials");
      newmap.put(2, "point");
      newmap.put(3, "is best");

      // get keyset value from map
      Iterator iterator = newmap.keySet().iterator();

      // check key set values
      System.out.println("Key set values are: " + iterator);
	}
}
