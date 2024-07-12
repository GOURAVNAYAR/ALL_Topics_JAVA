package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_iterator {

	public static void main(String[] args) {
		LinkedList<String> it = new LinkedList<>();

		it.add("g");
		it.add("o");
		it.add("u");
		it.add("r");
		it.add("a");
		it.add("v");

		System.out.println(it);

		Iterator<String> ite = it.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
			// System.out.println("Iterator........");
		}
		System.out.println("..............");
		for (String str : it) {
			System.out.println(str);
			// System.out.println("foreach.......");
		}
	}

}
