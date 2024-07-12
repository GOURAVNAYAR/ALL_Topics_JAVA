package com.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_poll_removeMethod {

	public static void main(String[] args) {

		/*
		Queue<String> q = new PriorityQueue<String>();

		q.add("my");
		q.offer("name");
		q.offer("is ");
		q.offer("Gourav ");
		q.offer("Nayar ");
		q.offer("........");
		*/

		Queue<Integer> q = new PriorityQueue<Integer>();

		q.offer(11);
		q.offer(24);
		q.offer(37);
		q.offer(488);
		q.offer(56);
		q.offer(6);
		q.offer(7);
		q.offer(1);
		System.out.println(q);

		System.out.println(q.offer(0) + "ADD");
		System.out.println(q);

		System.out.println(q.poll() + "delete");
		System.out.println(q);

		System.out.println(q.peek() + "get");
		System.out.println(q);

	}
}
