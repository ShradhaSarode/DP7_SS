package com.queueStackAssignment;
//5.	WAP to check if a queue has values

import java.util.LinkedList;
import java.util.Queue;

public class Fifth {
	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();

		boolean hasValues = !queue.isEmpty();

		System.out.println("Does the Queue have values? " + hasValues);

		queue.offer("Example Element");

		hasValues = !queue.isEmpty();

		System.out.println("Does the Queue have values now? " + hasValues);
	}
}
