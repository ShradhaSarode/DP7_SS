package com.queueStackAssignment;
//5.	Use 2 different method calls to remove non-existing elements from a queue

import java.util.LinkedList;
import java.util.Queue;

public class QFifth {
	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();

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
