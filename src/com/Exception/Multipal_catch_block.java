package com.Exception;

public class Multipal_catch_block {

	public static void main(String[] args) {
		try {
			int a = 10, b = 10, c;
			c = a / b;
			System.out.println(c);

			String str = "null";
			System.out.println(str);

			int d[] = { 10, 20, 30, 40, 50 };
			System.out.println(d[0]);

		} catch (ArithmeticException a) {
			System.out.println(a);
		} catch (NullPointerException n) {
			System.out.println(n);
		} catch (Exception a) { 		//this is parent most class they are handle all tha Exception
			System.out.println(a);		//ArrayIndexOutOfBoundsException
		}
	}

}
