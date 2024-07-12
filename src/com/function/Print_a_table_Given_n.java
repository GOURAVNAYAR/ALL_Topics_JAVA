package com.function;

import java.util.*;
////Make a function to print the table of a given number n.

public class Print_a_table_Given_n {

	public static int printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "=" + i * n);
		}
		return 0;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(printTable(n));
	}

}
