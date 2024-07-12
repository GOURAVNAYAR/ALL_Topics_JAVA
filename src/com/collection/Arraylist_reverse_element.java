package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist_reverse_element { 
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);

		System.out.println(list);

		Collections.reverse(list);
		System.out.println(list);
	}

}
