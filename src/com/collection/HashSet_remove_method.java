package com.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSet_remove_method {
	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		set.add(99);
		set.add(26);
		set.add(89);
		set.add(04);
		set.add(61);
		set.add(55);
		set.add(7);
		set.add(98);
		set.add(99);

		System.out.println(set);
		System.out.println(set.remove(7));
		System.out.println(set);
		System.out.println(set.removeAll(set));
		System.out.println(set);
		
	}
}
