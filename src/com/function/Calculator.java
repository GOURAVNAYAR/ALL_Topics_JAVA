package com.function;

import java.util.*;

//Java Program to make a Simple Calculator using Switch Case.
public class Calculator {
	static int total = 0;

	public static Integer Calculator(int i, int a, int b) {
		switch (i) {
		case 1:
			System.out.println("Addition on a two number" + a + b);
			break;

		case 2:
			System.out.println("Multiplication two number" + a * b);
			break;

		case 3:
			System.out.println("Divide two number" + a / b);
			break;

		case 4:
			System.out.println("Subtraction two number" + (a - b));
			break;

		}
		return total;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number....");
		int a = sc.nextInt();
		System.out.println("Enter Second Number....");
		int b = sc.nextInt();
		System.out.print(
				"Do you want to solve...." + "\n" + "you can add press 1" + "\n" + "you can multiplication press 2"
						+ "\n" + "you can divide press 3" + "\n" + "you can subtraction press 4");
		int i = sc.nextInt();
		System.out.println(Calculator(i, a, b));
	}

}
