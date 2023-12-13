package com.collectionMasterAssignment;

//7. What will be output of above program:

import java.util.HashSet;

public class SevenEmployee {
	public String name;

	@Override
	public int hashCode() {
		return 31;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

public static void main(String args[]) {
Employee employeeOne = new Employee();
Employee employeeTwo = new Employee();
employeeOne.name = "John";
employeeTwo.name = "Martin";
HashSet employeeSet = new HashSet();
employeeSet.add(employeeOne);
employeeSet.add(employeeTwo);
System.out.println(employeeSet.size());//The output of the program will be 2.
// If size is 2 justify and if size is 1 justify
/*
 Explanation:

The HashSet is used to store objects of the Employee class.
In the Employee class, the equals method is overridden to always return true. This means that any two instances of the Employee class will be considered equal.
In the Employee class, the hashCode method is overridden to always return the same hash code (31 in this case) for all instances.
As a result, when you add employeeOne and employeeTwo to the HashSet, they are considered equal according to the equals method, and their hash codes are the same. Therefore, the HashSet treats them as duplicate elements and retains only one of them.
The HashSet does not allow duplicate elements, so the final size of the set is 1.
The System.out.println(employeeSet.size()); prints the size of the HashSet, which is 1.
 */
}
}