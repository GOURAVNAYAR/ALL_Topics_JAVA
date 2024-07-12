package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_ReplaceMethod {
	public static void main(String args []) {
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
			System.out.println(" replace Print " + list.set(2,5));
			System.out.println(list);

	}
}
