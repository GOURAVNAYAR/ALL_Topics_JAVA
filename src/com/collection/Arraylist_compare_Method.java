package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_compare_Method {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);

		System.out.println(list + "firstList");

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add(15);
		list1.add(16);
		list1.add(17);
		list1.add(18);
		list1.add(19);
		list1.add(20);

		System.out.println(list1 + "secondList");

		//System.out.println(list.equals(list1) + " Equal List");
		if (list.equals(list1) == false) {
			System.out.println("This is not equal");
			return;
		}
		else {
			System.out.println("This is equal");
		}
	}

}
