package com.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_offer_AddMethod {

	public static void main(String[] args) {
		
		Queue <String> q = new PriorityQueue<String>();
		
		q.add("my");
		q.offer("name");
		q.offer("is ");
		q.offer("Gourav ");
		q.offer("Nayar ");
		q.offer("........");
		
		System.out.println(q);
		
		
	}

}
