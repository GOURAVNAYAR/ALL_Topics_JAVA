package com.function;

import java.util.Scanner;

//Java Program to find the largest of three numbers using if..else..if.
public class Largest_of_three_number {

	public static Integer Find_number(int a, int b, int c) {
		if ((a > b) && (a > c)) {
			System.out.println("a is Larger_Number.........");
			return a;
		}
		if ((b > a) && (b > c)) {
			System.out.println("b is Larger_Number.....");
			return b;
		} else {
			System.out.println("c is Larger_Numbe.....");
			return c;

		}

	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		/* int a, b, c = 0; */

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.println(Find_number(a, b, c));

	}
}
