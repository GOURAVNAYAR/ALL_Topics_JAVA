package javvaa;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class FInd_Average {

	public static void main(String[] args) {
int total =0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Size of Array...........");
		int size = scanner.nextInt();
		int arr[] =new int[size];
		
		System.out.println("Enter a element of the array....");
		for(int i=0;i<size; i++) {
			arr[i] = scanner.nextInt();
		}System.out.println("Element are Store's.....");
		
		System.out.println("Find The total of the Element......"); int input=0;
		for(int i = 0; i<size; i++) {
			input = arr[i]+ input;
			
		}System.out.println(input + " Total of tha Element....");
		total = input/size;
		System.out.println("Find the averag of the element is........" + total );
		
	}
}
