package com.String;

import java.util.Scanner;

public class Add_Two_String {

	public static void main(String[] args) {			//concatention methad
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		String lastName  = sc.nextLine();
		
		String fullName = firstName+ " " +lastName;
		System.out.print(fullName);
	}

}
