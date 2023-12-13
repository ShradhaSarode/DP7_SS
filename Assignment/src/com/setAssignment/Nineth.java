package com.setAssignment;
//9.	WAP to create a TreeSet from a HashSet.


import java.util.HashSet;
import java.util.TreeSet;

public class Nineth {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");

        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("TreeSet content:");
        for (String element : treeSet) {
            System.out.println("Element: " + element);
        }
    }
}

