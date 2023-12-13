package com.collectionMasterAssignment;

//6. What will be output of above program:

import java.util.HashSet;

public class SixEmployee {
	public String name;

	public int hashCode() {
		return 31;
	}

	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return this.name.equals(e.name);
	}

	public static void main(String args[]) {
		Employee employeeOne = new Employee();
		Employee employeeTwo = new Employee();
		employeeOne.name = "John";
		employeeTwo.name = "Martin";
		HashSet employeeSet = new HashSet();
		employeeSet.add(employeeOne);
		employeeSet.add(employeeTwo);
		System.out.println(employeeSet.size());//2
// If size is 2 justify and if size is 1 justify
		/*
		 Explanation:

The HashSet is used to store objects of the Employee class.
In the Employee class, the equals method is overridden to compare the name attribute for equality.
In the Employee class, the hashCode method is overridden to always return the same hash code (31 in this case).
When you add employeeOne and employeeTwo to the HashSet, they have different names ("John" and "Martin"), so according to the equals method, they are considered different.
The HashSet allows both employeeOne and employeeTwo to be added because their hash codes are different (due to different names).
The System.out.println(employeeSet.size()); prints the size of the HashSet, which is 2.
		 */
	}
}
