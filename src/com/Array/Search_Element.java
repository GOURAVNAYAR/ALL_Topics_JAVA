package javvaa;

import java.util.Arrays;
import java.util.Scanner;

public class Search_Element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println(Arrays.toString(arr) + " input of tha Element");

		System.out.println("Enter a Serch Number");
		int count = 0;
		int input =sc.nextInt();
		for(int i = 0; i<size; i++)
		{
		if(arr[i] ==input) 
		{
			count++;
			}
		}
		if (count >0)
			System.out.println("item found..... "+ count + " time");
		
		else 
			System.out.println("item not found...............");
		
		}
		
	}

