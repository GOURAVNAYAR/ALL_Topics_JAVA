package com.function;

import java.util.*;

//make a function to Multiplay_two_number and return the product
public class Multiplay_two_number {
	public static int MultiplayTwoNumber(int a, int b) {
		int total = a * b;
		return total;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(MultiplayTwoNumber(a, b));
	}

}
