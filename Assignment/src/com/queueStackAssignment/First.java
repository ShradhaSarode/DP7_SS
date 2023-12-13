package com.queueStackAssignment;
//1.	WAP to create a Queue with Integer objects without using generics

import java.util.LinkedList;
import java.util.Queue;

public class First {
	public static void main(String[] args) {

		Queue queue = new LinkedList();

		queue.offer(5);
		queue.offer(2);
		queue.offer(8);

		System.out.println("Queue content:");
		while (!queue.isEmpty()) {
			System.out.println("Element: " + queue.poll());
		}
	}
}
