package com.collection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayList_SearchMethod {

	public static void main(String[] args) {

		List<Integer> a = new ArrayList<>();

		a.add(1);
		a.add(2);
		a.add(2);
		a.add(4);
		a.add(6);
		a.add(7);
		a.add(9);
		a.add(8);
		System.out.println(a);
		System.out.println(a.contains(2));

	}

}
