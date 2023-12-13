package com.queueStackAssignment;
//3.	WAP to create a Queue with user defined class objects &amp; using generics

import java.util.LinkedList;
import java.util.Queue;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + '}';
	}
}

public class Third {
	public static void main(String[] args) {

		Queue<Person> personQueue = new LinkedList<>();

		personQueue.offer(new Person("Alice", 25));
		personQueue.offer(new Person("Bob", 30));
		personQueue.offer(new Person("Charlie", 22));

		System.out.println("Queue content:");
		while (!personQueue.isEmpty()) {
			System.out.println("Person: " + personQueue.poll());
		}
	}
}
