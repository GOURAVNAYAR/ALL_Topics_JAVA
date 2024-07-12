package com.Exception;

public class Exception_example {

	public static void main(String[] args) {  //try catch pre-defind exception ko explan kr tha hai
		Integer a = 1, b = 0;                 //throw and throws exception user defind ke liye kiya jatha hai
											  //finally ka use jb kiya jatha hai tb jb any condition ho app ke pass exca.. ho ya na ho finally exquet hoga
		try {
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
