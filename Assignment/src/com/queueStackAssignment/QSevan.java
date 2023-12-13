package com.queueStackAssignment;
/*
7.	WAP to create a Queue using generics and add user defined class
 objects which does not implementcomparable interface
  yet element are added in sorted in natural order. Observe order whenremoving from queue
 */

import java.util.PriorityQueue;
import java.util.Queue;

class Person3 {
	private String name;
	private int age;

	public Person3(String name, int age) {
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

public class QSevan {
	public static void main(String[] args) {

		Queue<Person3> sortedQueue = new PriorityQueue<>((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));

		sortedQueue.add(new Person3("Alice", 25));
		sortedQueue.add(new Person3("Bob", 30));
		sortedQueue.add(new Person3("Charlie", 22));

		System.out.println("Elements in natural order:");
		while (!sortedQueue.isEmpty()) {
			Person3 person = sortedQueue.poll();
			System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
		}
	}
}
