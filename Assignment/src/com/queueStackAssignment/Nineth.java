package com.queueStackAssignment;
/*
9.	WAP to create a Queue using generics and add user defined
 class objects which implements comparable interface. Observe order when removing from queue.
 */

import java.util.LinkedList;
import java.util.Queue;

class Person2 implements Comparable<Person2> {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person2 otherPerson) {
        // Compare based on age
        return Integer.compare(this.age, otherPerson.age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class Nineth {
    public static void main(String[] args) {
       
        Queue<Person2> personQueue = new LinkedList<>();

        personQueue.offer(new Person2("Alice", 25));
        personQueue.offer(new Person2("Bob", 30));
        personQueue.offer(new Person2("Charlie", 22));

        System.out.println("Queue content:");
        while (!personQueue.isEmpty()) {
            System.out.println("Person removed: " + personQueue.poll());
        }
    }
}
