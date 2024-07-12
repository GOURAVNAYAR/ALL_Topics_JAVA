package javvaa;

import java.util.*;

public class Dynamic_Array {

	public static void main(String args[]) {
		Dynamic_Array dynamic = new Dynamic_Array();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Array Size.....");
		int size = scanner.nextInt();

	
		int arr[] = new int[size];
		
		for(int i =0; i<size; i++) {
			System.out.println("Enter a input ...." + i +" index");
			 arr[i] = scanner.nextInt();
		}
		
		System.out.println("Print a Array.....");

		for (int i = 0; i<size; i++) {
			System.out.println(arr[i]);
		}
				

	}
}