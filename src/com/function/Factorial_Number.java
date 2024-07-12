package com.function;

import java.util.*;

public class Factorial_Number {

	public static void factorialNumber(int n) {
		
		if(n<=1) {
			System.out.println("invalid number");
			return;
		}
		int factor = 1;
		for (int i = n; i >= 1; i--) {
			factor = factor * i;
		}
		System.out.println(factor);
		return;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		factorialNumber(n);
	}
}
