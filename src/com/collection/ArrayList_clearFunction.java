package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_clearFunction {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
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
		list.clear();
		System.out.println(list);
	}
}