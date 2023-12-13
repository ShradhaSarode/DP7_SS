package com.queueStackAssignment;
//1.	WAP to check the top element in a queue

import java.util.LinkedList;
import java.util.Queue;

public class QFirst {
	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();

		queue.offer("Element 1");
		queue.offer("Element 2");
		queue.offer("Element 3");

		String topElement = queue.peek();

		if (topElement != null) {
			System.out.println("Top element in the Queue: " + topElement);
		} else {
			System.out.println("Queue is empty, no top element");
		}
	}
}
