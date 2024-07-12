package com.Exception;

public class multipal_try_catchBlock {
	public static void main(String args[]) {
			try {
				System.out.println("run on a first try catch block.....");
				int a = 20,b=0,c;
				c = a/b;
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			try {
				System.out.println("run on second try catch block......");
				int a[]= {10,20,30,40,50};
				System.out.println(a[8]);
			}
			catch(ArrayIndexOutOfBoundsException a) {
				System.out.println(a);
			}
	}
}
