package javvaa;
import java.util.Scanner;

public class Copy_oneArray_TO_secondArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int []arr = new int [5];
		int []arrr = new int [5];
		
		System.out.println("first array Element STORE");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println( arr[i] +  "  index....." + i  +" FIRST ARRAY ELEMENT");	
		}
		
		for(int i = 0; i<arr.length;i++) {
			arrr[i]=arr[i];
			System.out.println("Second Array ELEMENT "+ arrr[i] +" in"+i + " position");
		}
		
		}

}
