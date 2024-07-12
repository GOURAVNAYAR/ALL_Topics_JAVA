package com.function;

import java.util.*;

// Java Program to check whether a char is vowel or Consonant using Switch Case.
public class Cheak_vowel_Consonant {
	public static String Cheak(String i) {
		switch (i) {
		case "a":
			System.out.println("Vowel");
			break;
		case "e":
			System.out.println("Vowel");
			break;
		case "i":
			System.out.println("Vowel");
			break;
		case "o":
			System.out.println("Vowel");
			break;
		case "u":
			System.out.println("Vowel");
			break;

		default:
			System.out.println("Consonant");
		}
		return i;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String i = scanner.nextLine();
		System.out.println(Cheak(i));
	}

}
