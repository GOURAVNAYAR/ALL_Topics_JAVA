package com.Exception;

public class Nested_Try_Block {
	public static void main(String[] args) {
		try {
			int a = 10, b = 10, c;
			c = a / b;
			System.out.println(c);
			try {
				int h[] = { 10, 20, 30, 40, 50 };
				System.out.println(h[10]);
			} catch (Exception e) {
				System.out.println(e);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
