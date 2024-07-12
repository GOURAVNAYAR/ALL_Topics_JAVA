package com.function;

import java.util.Scanner;

public class Check_positive_negative_Number {
	public static Integer Cheak(int a) {
		if (a > 0) {
			System.out.println("is positive number....");
			return a;
		} else {
			System.out.println("is negative number....");
			return a;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println(Cheak(a));
	}

}
