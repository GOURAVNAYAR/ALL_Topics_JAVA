package com.collection;

import java.util.Stack;

public class Stack_peek_GetCaracter {
	public static void main(String args[]) {
		Stack<Integer> list = new Stack<Integer>(); // last in first out
		list.push(2);
		list.push(4);
		list.push(6);
		list.push(8);
		list.push(10);
		list.push(12);
		list.push(14);
		list.push(16);
		list.push(18);
		list.push(20);

		System.out.println(list);
		System.out.println(list.peek()); // last in first out

	}
}
