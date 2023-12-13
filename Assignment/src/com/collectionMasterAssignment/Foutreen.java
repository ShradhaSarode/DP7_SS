package com.collectionMasterAssignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
 14. Assume you have Arraylist<String> al = new ArrayList<String>();
al.add("Sun");
al.add("Mon");
al.add("Sat");
al.add("Sun ");
al.add("Mon ");
al.add("Sat ");
al.add("Sun ");
al.add("Sat ");
al.add("Sun ");
al.add("Mon ");
Write a code to remove duplicate elements from above list. Final arraylist should contain 
( Sun, Mon, Sat);
 */
public class Foutreen
{
	 public static void main(String[] args) {
	        ArrayList<String> al = new ArrayList<>();
	        al.add("Sun");
	        al.add("Mon");
	        al.add("Sat");
	        al.add("Sun");
	        al.add("Mon");
	        al.add("Sat");
	        al.add("Sun");
	        al.add("Sat");
	        al.add("Sun");
	        al.add("Mon");

	        // Create a Set to store unique elements while maintaining insertion order
	        Set<String> uniqueSet = new LinkedHashSet<>(al);

	        // Create a new ArrayList with unique elements
	        List<String> uniqueList = new ArrayList<>(uniqueSet);

	        System.out.println("Final ArrayList after removing duplicates: " + uniqueList);
	        //Final ArrayList after removing duplicates: [Sun, Mon, Sat]

}
}