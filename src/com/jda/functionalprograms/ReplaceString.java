/******************************************************************************
 
 *  Purpose :Replacing string.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/

package com.jda.functionalprograms;

import com.jda.utility.Utility2;

public class ReplaceString {
	public static void main(String[] args) {

		Utility2 utility = new Utility2();
       String input= "“Hello <<UserName>>, How are you?";
       System.out.println("Enter UserName");
       String UserName = utility.inputString();
       input = utility.replaceString(input, UserName);
       System.out.println(input);
       
	}
}

