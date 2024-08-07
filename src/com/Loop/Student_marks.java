package com.Loop;

import java.util.*;

public class Student_marks {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int Marks = scanner.nextInt();

		int i = 5;
		do {
			if (Marks >= 90) {
				System.out.println("This is Good" + "\n" + "Because marks don’t matter but our effort does...");
				break;
			}
			if (Marks <= 89 && Marks >= 60) {
				System.out.println("This is also Good....." + "\n" + "Because marks don’t matter but our effort does.");
				break;
			}

			if (Marks <= 59 && Marks >= 0) {
				System.out.println("This is Good as well" + "\n" + "Because marks don’t matter but our effort does.");
				break;
			}
			i++;
		} while (i > 10);

	}
}
