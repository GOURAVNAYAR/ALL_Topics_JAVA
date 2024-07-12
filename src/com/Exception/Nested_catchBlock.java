package com.Exception;

public class Nested_catchBlock {

	public static void main(String[] args) {
		try {
			int a = 20, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println(a + " Run on First statment ArrayIndexOutOfBoundsException");
		} catch (NullPointerException n) {
			System.out.println(n + " Run on Second statment NullPointerException ");
		} catch (ArithmeticException s) {
			System.out.println(s + " Run on third statment ArithmeticException ");
		}

	}

}
