package com.function;

import java.util.*;

// make a function to add 2 number and return tha sum ?
public class Add_to_number {
	public static int addToNumber(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(addToNumber(a, b));
	}
}
