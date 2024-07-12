package com.String;

public class Count_the_number_of_times_a_given_character { //Is it possible to count the number of times a given character appears in a String?

	public static void main(String[] args) {
		String str = "Gouravnayar";
		char target = 'a';
		int count=0;
		 for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == target) {
	                count++;
	            }
		 }
		System.out.println(count);
	}
}
