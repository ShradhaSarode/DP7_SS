package com.queueStackAssignment;
//3.	Use 2 different method calls to remove elements from a queue

import java.util.LinkedList;
import java.util.Queue;

public class QThird {
	public static void main(String[] args) {
		// Create a Queue with generics
		Queue<String> queue = new LinkedList<>();

		queue.offer("Element 1");
		queue.offer("Element 2");
		queue.offer("Element 3");

		System.out.println("Queue content before removal:");
		for (String element : queue) {
			System.out.println("Element: " + element);
		}

		String removedElement1 = queue.poll();

		if (removedElement1 != null) {
			System.out.println("Removed element (using poll()): " + removedElement1);
		} else {
			System.out.println("Queue is empty, no element removed (using poll())");
		}

		String removedElement2 = null;
		try {
			removedElement2 = queue.remove();
			System.out.println("Removed element (using remove()): " + removedElement2);
		} catch (java.util.NoSuchElementException e) {
			System.out.println("Queue is empty, no element removed (using remove())");
		}

		System.out.println("Queue content after removal:");
		for (String element : queue) {
			System.out.println("Element: " + element);
		}
	}
}
