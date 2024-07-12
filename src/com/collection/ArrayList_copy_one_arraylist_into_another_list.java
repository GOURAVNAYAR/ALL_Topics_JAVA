package com.collection;

import java.util.ArrayList;

public class ArrayList_copy_one_arraylist_into_another_list {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		
		list.add("My");
		list.add("Name");
		list.add("Is");
		list.add("Gourav");
		list.add("Nayar");
		list.add("And");
		list.add("Your..");
		
		System.out.println(list);
		
		ArrayList<String> newlist = new ArrayList<>();
		
		newlist.add("name is");
		newlist.add("Pagal");
		
		System.out.println(list);
		list.addAll(newlist);
		System.out.println(list);
		
		
		
		
	}
}
