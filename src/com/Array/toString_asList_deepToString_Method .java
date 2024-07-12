package javvaa;
import java.util.Arrays;

public class toString_asList_deepToString_Method {

	public static void main(String[] args) {

		System.out.println("Integer type");
		int arr[]= {1,2,3,5,6};
		int ar[][] = {{1,2},{4,5}};
		
		System.out.println(Arrays.toString(arr)+ "toString Method");
		System.out.println(Arrays.deepToString(ar)+ "deepTOString Method");
		System.out.println(Arrays.asList(arr)+ "asListMethod");
		
		
		System.out.println("String type");
		String arrr[]= {"gourav", "pavan" , "Ram", "Ritik"};
		
		System.out.println(Arrays.toString(arrr)+ "toString method");
		System.out.println(Arrays.deepToString(arrr)+ "deepToString");
		System.out.println(Arrays.asList(arrr)+ "asList Method");
	}

}
