package com.String;

import java.util.*;

public class Remove_Particular_Character { // How to remove a particular character from a string
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = "gouravN";
		System.out.println("gouravN");
	//	System.out.println(charRemoveAt(str,2));
	//	System.out.println("String after replacing all small letters = "+str.replaceAll("([A-Z])", "")); 
	System.out.println("String after removing 'e' = "+str.replace("a", ""));    
	//	System.out.println("String after removing First 'e' = "+str.replaceFirst("e", ""));   
	}
	
	 public static String charRemoveAt(String str, int p) {  
         return str.substring(0, p) + str.substring(p + 1);  
      } 
}
