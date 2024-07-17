package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class AA_Collections_method {

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
		list.add(500);
		System.out.println(" Normal Print " + list);

		Collections.reverse(list); // reverse a Method......
		System.out.println(" Reverse method " + list);

		Collections.sort(list); // sort a method............
		System.out.println(" Sort a method " + list);

		Collections.swap(list, 0, 1);// swap method..........
		System.out.println(" swap Print " + list);

		System.out.println(list.isEmpty()); // Empty Method
		System.out.println("Empoty method" + list);
		
		System.out.println(list.set(0,5)); // set Method
		System.out.println("Empoty method" + list);
		
		

	}
}
