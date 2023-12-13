package com.queueStackAssignment;
//4.	Use 2 different method calls to add elements to a queue.

import java.util.LinkedList;
import java.util.Queue;

public class Fourth {
	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();

		queue.offer("Element 1");
		queue.offer("Element 2");

		queue.add("Element 3");
		queue.add("Element 4");

		System.out.println("Queue content:");
		for (String element : queue) {
			System.out.println("Element: " + element);
		}
	}
}
