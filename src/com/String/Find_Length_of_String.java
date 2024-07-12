package com.String;

import java.util.*;

public class Find_Length_of_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String firstName = sc.nextLine();
		
		String lastName = sc.nextLine();

		String fullName = firstName + " " + lastName;		//length of String
		
		System.out.println("length of Fullname ..... " + fullName + " is " + fullName.length());
	}
}
