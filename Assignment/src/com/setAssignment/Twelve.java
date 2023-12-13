package com.setAssignment;
//12.	WAP to get the first and last elements in a TreeSet.

import java.util.TreeSet;

public class Twelve {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Orange");
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Grapes");

        // Get the first and last elements in the TreeSet
        String firstElement = treeSet.first();
        String lastElement = treeSet.last();

        // Display the first and last elements
        System.out.println("First element in the TreeSet: " + firstElement);
        System.out.println("Last element in the TreeSet: " + lastElement);
    }
}

