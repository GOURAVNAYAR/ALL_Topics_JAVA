package com.String;

public class Maximum_Character {

	   public static void main(String[] args) {
	        String s = "gourav Nayar";
	        int[] arr = new int[127];

	        // Count occurrences of each character
	        for (int i = 0; i < s.length(); i++) {
	            arr[s.charAt(i)] = arr[s.charAt(i)] + 1;
	        }
	        int max = -1;
	        char c = '\0'; // Initialize with null character

	        // Find the maximum occurring character
	        for (int i = 0; i < s.length(); i++) {
	            if (max < arr[s.charAt(i)]) {
	                max = arr[s.charAt(i)];
	                c = s.charAt(i);
	            }
	        }
	        System.out.println("Maximum occurring character: " + c);
	    }
	}