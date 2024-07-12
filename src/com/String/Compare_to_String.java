package com.String;

import java.util.Scanner;

public class Compare_to_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String firstName = sc.nextLine();
		String lastName = sc.nextLine();

		if(firstName == lastName) {
			System.out.println("String are equal......");
		}
		 else {
			  System.out.println("they are differant String....."); }
		
		
		/*
		 * if (firstName.compareTo(lastName) == 0) { // .compare()
		 * System.out.println("String are equal......"); } else {
		 * System.out.println("they are differant String....."); }
		 */
	}
}
