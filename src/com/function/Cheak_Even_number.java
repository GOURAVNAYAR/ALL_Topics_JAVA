package com.function;

import java.util.*;

public class Cheak_Even_number {
	public static int cheakEven(int a) {
		if (a % 2 == 0) {
			System.out.println("even Number");
		} else {
			System.out.println("odd number");
		}
		return 0;
	}

	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(cheakEven(a));

	}
}
