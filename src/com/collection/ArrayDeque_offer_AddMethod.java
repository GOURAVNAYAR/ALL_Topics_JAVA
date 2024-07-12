package com.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDeque_offer_AddMethod {
	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque<>();
		q.offer(33);
		q.offer(21);
		q.offer(2);
		q.offer(192);
		q.offer(13);
		q.offer(178);
		q.offer(81); // add

		System.out.println(q);

		System.out.println(q.peek()); // get
		// System.out.println(q);

		System.out.println(q.poll()); // remove
		System.out.println(q);

	}
}
