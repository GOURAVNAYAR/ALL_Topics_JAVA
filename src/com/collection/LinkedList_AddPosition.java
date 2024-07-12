package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_AddPosition {
	public static void main(String[] args) {
		Queue<Integer> list = new LinkedList<>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);
		list.add(12);
		list.add(14);
		list.add(16);
		list.add(18);
		list.add(20);
		
		

		list.offer(2);
		list.offer(4); //  do type se add kar sk the hai offer and add,because ye List and Queue dono ko exdend kar tha hai
		list.offer(6);		 
		list.offer(8);
		list.offer(10);
		list.offer(12);
		list.offer(14);
		list.offer(16);
		list.offer(18);
		list.offer(20);

		System.out.println(list);

		list.remove(1); // remove method

		System.out.println(list);


		System.out.println(list);
	}
}
