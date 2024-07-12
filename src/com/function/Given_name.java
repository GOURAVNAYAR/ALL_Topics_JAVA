package com.function;

import java.util.*;

//print a given name in a Function
public class Given_name {
	
	public static String returnName(String name) {
		return name;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name....");
		String name = sc.nextLine();
		System.out.println(returnName(name));
	}
}
