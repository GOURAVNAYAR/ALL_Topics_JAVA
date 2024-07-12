package com.String;

import java.util.Scanner;

public class Count_Total_Number_of_Words {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        int count = 1;
        for (int i = 0; i < input.length() - 1; i++) {
        	char c ,d;
        	c=input.charAt(i);
        	d=input.charAt(i+1);
        	
        	if(c == ' ' && d != ' ') { 
        		count++;
        	}
        	
        }
        System.out.println("Total Word "+ count);

     
    }
}