package javvaa;

import java.util.Arrays;
import java.util.Scanner;

public class equal_method {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Size of first Array.......");
		int size = scanner.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter a Size of second Array.......");
		int size1 = scanner.nextInt();
		int arrr[] = new int[size];

		System.out.println("Enter a element of the first array....");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
			System.out.println("Element are Store's..... in First array " + i + " index");
		}
		System.out.println("Enter a element of the Second array....");
		for (int i = 0; i < size1; i++) {
			arrr[i] = scanner.nextInt();
			System.out.println("Element are Store's..... in Second array " + i + " index");
		}
		boolean b = Arrays.equals(arr, arrr);
		System.out.println(b);

	}

}
