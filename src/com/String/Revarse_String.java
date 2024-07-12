package com.String;

public class Revarse_String {
	public static void main(String args[]) {
		String to = "";
		String s = new String("gourav");
		for (int i = s.length() - 1; i >= 0; i--) {
			 to = to +s.charAt(i);
		}
			System.out.println(to);

		
	}
}
