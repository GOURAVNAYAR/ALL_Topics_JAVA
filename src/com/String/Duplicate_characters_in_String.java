package com.String;

import java.util.Scanner;

public class Duplicate_characters_in_String {


    public static void main(String[] args) {
      String str = new String("automatic");
		char[] ch = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println(ch[j] + " is a duplicate Character");
					count++;
				}
			}
		}
		System.out.println(count+ "Total Duplicate Character in this Words");

    }
}
