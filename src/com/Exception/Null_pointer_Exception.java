package com.Exception;

public class Null_pointer_Exception {

	public static void main(String args[]) {
		try {
		String str = "ankit";
		System.out.print(str.toUpperCase());
	}
		catch(NullPointerException e) {
			System.out.println( " cannot be casted........");
		}
	}
}
