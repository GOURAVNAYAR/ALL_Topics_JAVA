package javvaa;

import java.util.Arrays;
import java.util.Scanner;

public class sort_method {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Size of Array.......");
		int size = scanner.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter a element of the array....");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
			System.out.println("Element are Store's....." + i + " index");
		}
		 Arrays.sort(arr);
		 for(int i =1; i<size; i++) {
			 System.out.println(arr[i]); 
		 }System.out.println();
	}

}
