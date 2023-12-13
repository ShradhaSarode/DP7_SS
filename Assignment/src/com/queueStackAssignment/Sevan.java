package com.queueStackAssignment;
//7.	WAP to create a Queue with some colors (String) &amp; using generics

import java.util.LinkedList;
import java.util.Queue;

public class Sevan {
	public static void main(String[] args) {

		Queue<String> colorQueue = new LinkedList<>();

		colorQueue.offer("Red");
		colorQueue.offer("Green");
		colorQueue.offer("Blue");

		System.out.println("Queue content:");
		while (!colorQueue.isEmpty()) {
			System.out.println("Color: " + colorQueue.poll());
		}
	}
}
