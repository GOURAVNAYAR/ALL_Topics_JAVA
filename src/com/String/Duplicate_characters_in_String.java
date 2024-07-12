package com.String;

import java.util.Scanner;

public class Duplicate_characters_in_String {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
      
        char[] ch = input.toCharArray();
      
        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (ch[i] == ch[j]) {
                	 
                    System.out.println( ch[i]);
                    // Breaks the inner loop once a duplicate is found
                }
            }
        }
    }
}