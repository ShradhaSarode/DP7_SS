package com.collectionMasterAssignment;

import java.util.ArrayList;
import java.util.Comparator;

/*
Complete following code to sort above employee object by name. Employee object 
is from same earlier program.
*/
public class SecondQEmpName implements Comparator<Employee> {
// write function to compare here

	public static void main(String[] args) {
		ArrayList<Employee> alEmp = new ArrayList<Employee>();
		Employee e1 = new Employee(3, "Ajit");
		Employee e2 = new Employee(4, "Suman");
		alEmp.add(e1);
		alEmp.add(e2);
// code to call sort function here
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}