package com.String;

public class Split_String { //Next Line

	public static void main(String[] args) {
		
		String str = "My Name Is Gourav Nayar";
		
		String[] result = str.split(" ");  //they provide a print a word than next line
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result);
		}
	}
}
