package javvaa;

import java.util.Scanner;

public class Ascending_Order_in_Element {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Size of Array.......");
		int size = scanner.nextInt();
		int arr[] =new int[size];
		
		System.out.println("Enter a element of the array....");
		for(int i=0;i<size; i++) {
			arr[i] = scanner.nextInt();
			System.out.println("Element are Store's....." + i + " index");
		}
		int temp =0;
		for(int i=0;i<size; i++) {
		
			for(int j=1+i;j<size; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Ascending_Order_in_Element");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
