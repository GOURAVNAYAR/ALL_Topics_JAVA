package com.function;

import java.util.*;

public class Check_prime_number {
	public static int checkNumber(int a) {
		if (a % 2 == 1) {
			System.out.println("prime number");
		} else {
			System.out.println("not a prime number`");
		}
		return 0;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(checkNumber(a));
	}
}
