package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_SortMethod {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(254);
		l.add(54);
		l.add(74);
		l.add(45);
		l.add(55);
		l.add(2);
		l.add(45);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
	}

}
