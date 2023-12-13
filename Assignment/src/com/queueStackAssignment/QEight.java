package com.queueStackAssignment;
/*
8.	WAP to create a Queue using generics and add user defined
 class objects in reverse order usingcomparator. Observe order when removing from queue.
 */

import java.util.PriorityQueue;
import java.util.Queue;

class Person4 {
	private String name;
	private int age;

	public Person4(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class QEight {
	public static void main(String[] args) {

		Queue<Person4> reverseQueue = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.getAge(), p1.getAge()));

		reverseQueue.add(new Person4("Alice", 25));
		reverseQueue.add(new Person4("Bob", 30));
		reverseQueue.add(new Person4("Charlie", 22));

		System.out.println("Elements in reverse order:");
		while (!reverseQueue.isEmpty()) {
			Person4 person = reverseQueue.poll();
			System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
		}
	}
}
