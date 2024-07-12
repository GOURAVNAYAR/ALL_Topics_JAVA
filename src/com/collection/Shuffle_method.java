package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle_method {					//mix kar na 

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

		Collections.shuffle(list);
		System.out.println(list);
	}

}
