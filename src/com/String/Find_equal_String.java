package com.String;

import java.util.Scanner;

public class Find_equal_String {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String firstName = sc.nextLine();
		String lastName = sc.nextLine();
		
		if(firstName.equals(lastName)) {							//.equals()
			System.out.println("they are same String.....");
		}
		else {
			System.out.println("they are differant String.....");
		}
	}
}
