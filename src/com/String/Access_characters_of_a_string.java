package com.String;

import java.util.Scanner;

public class Access_characters_of_a_string {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		String lastName = sc.nextLine();
		String fullName = firstName + " " + lastName;

		for (int i = 0; i < fullName.length(); i++) { // .length
			System.out.println(fullName.charAt(i));
		}

		// System.out.println("length of Fullname ..... " + fullName + " is " +
		// fullName.length());
	}

}
