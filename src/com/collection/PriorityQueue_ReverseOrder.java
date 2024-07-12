package com.collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_ReverseOrder {

	public static void main(String[] args) {
		
		
		Queue<Integer> q = new PriorityQueue<Integer>(Comparator.reverseOrder()); //normally peiority queue run on chote se bada but this method use then bade se chota
		
		q.offer(11);
		q.offer(24);
		q.offer(37);
		q.offer(488);
		q.offer(56);
		q.offer(6);
		q.offer(7);
		q.offer(1);
		System.out.println(q);
		
		
		System.out.println(q.offer(0)+ "ADD");
		System.out.println(q);
		
		System.out.println(q.poll() + "delete");
		System.out.println(q);
		
		System.out.println(q.peek()+"get");
		System.out.println(q);
}
}
