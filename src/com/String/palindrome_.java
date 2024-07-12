package com.String;

public class palindrome_ { // There are two way to create a palindrome !> First String match a second
							// reverse string match
							// 2> Second is Left and right side

	public static void main(String args[]) {

		// 1.Revers
		String rev = "";
		String name = "level";

		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
			
		}
			System.out.println(rev);
			if(name.equals(rev)) {
				System.out.println("This is Palindrome string");
				
			}
			else {
					System.out.println("this is not Palindrome String");
		
			}
		}
	}

