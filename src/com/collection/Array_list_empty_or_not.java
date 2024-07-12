package com.collection;

import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Array_list_empty_or_not {

	public static void main(String[] args) {
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

		if (list.isEmpty() == false) {
			System.out.println("Not Empoty....");
		}

		else {
			System.out.println("Empoty.....");
		}

	}

}
