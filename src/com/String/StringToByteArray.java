package com.String;

import java.util.Arrays;

public class StringToByteArray {

	public static void main(String[] args) {
		
		String str = "Gourav Nayar";
		
		byte[] arrayb = str.getBytes();
		
		System.out.println(Arrays.toString(arrayb));
	}
}
