package com.collection;

import java.util.ArrayList;

public class ArrayList_AddPosition {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);
		list.add(12);
		list.add(14);
		list.add(16);
		list.add(18);
		list.add(20);

		System.out.println(list);

		list.remove(1); // remove method

		System.out.println(list);

		list.add(1, 4); // Add method

		System.out.println(list);
	}
}
