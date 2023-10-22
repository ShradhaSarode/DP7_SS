package com.ArrayListAssignment;

import java.util.ArrayList;
//import java.util.Scanner;
import java.util.Iterator;

//18.	WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using iterator)
public class Eighteen {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(50);
		for (int i = 1; i <= 50; i++) {
			al.add(i);
		}
		System.out.println(al);
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
				int num = itr.next();
				if (num % 2 == 0)
					System.out.println(num);
			}
	}
}
