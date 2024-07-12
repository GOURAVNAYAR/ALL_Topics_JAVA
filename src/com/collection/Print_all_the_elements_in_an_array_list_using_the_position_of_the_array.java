package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Print_all_the_elements_in_an_array_list_using_the_position_of_the_array { // print all the elements in an
																						// array list using the position
																						// of the array.
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(11);
		list.add(1);
		list.add(694);
		list.add(6);
		list.add(8);
		list.add(10);
		list.add(12);
		list.add(14);
		list.add(16);
		list.add(18);
		list.add(20);
		System.out.println(" Normal Print " + list);

		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
