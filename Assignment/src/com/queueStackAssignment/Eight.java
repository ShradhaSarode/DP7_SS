package com.queueStackAssignment;
//8.	WAP to create a Queue using generics and add user defined

//class objects which does not implement comparable interface.

import java.util.LinkedList;
import java.util.Queue;

class Person1 {
	private String name;
	private int age;

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + '}';
	}
}

public class Eight {
	public static void main(String[] args) {

		Queue<Person1> personQueue = new LinkedList<>();

		personQueue.offer(new Person1("Alice", 25));
		personQueue.offer(new Person1("Bob", 30));
		personQueue.offer(new Person1("Charlie", 22));

		System.out.println("Queue content:");
		while (!personQueue.isEmpty()) {
			System.out.println("Person: " + personQueue.poll());
		}
	}
}
