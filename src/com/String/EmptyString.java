package com.String;

import java.util.Scanner;

public class EmptyString {

	private static boolean isStringEmpty(String str) {
		if (str.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Str1 \"" + str + "\" is empty? " + isStringEmpty(str));

	}

}