package com.queueStackAssignment;
//2.	WAP to remove an element from a queue

import java.util.LinkedList;
import java.util.Queue;

public class QSecond {
	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();

		queue.offer("Element 1");
		queue.offer("Element 2");
		queue.offer("Element 3");

		System.out.println("Queue content before removal:");
		for (String element : queue) {
			System.out.println("Element: " + element);
		}

		String removedElement = queue.poll();

		if (removedElement != null) {
			System.out.println("Removed element: " + removedElement);
		} else {
			System.out.println("Queue is empty, no element removed");
		}

		System.out.println("Queue content after removal:");
		for (String element : queue) {
			System.out.println("Element: " + element);
		}
	}
}
