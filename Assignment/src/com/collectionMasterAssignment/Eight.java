package com.collectionMasterAssignment;

import java.util.HashMap;
import java.util.Map;

/*
 8. Create a hashmap where employee is key and string is value.
Employee ( int emp_id , emp_name , emp_salary)
Implement hashcode and equals methd so that map should not allow duplicate entry of 
employees with same salary in the map

 */
public class Eight {

	public static void main(String[] args)
	{
		HashMap<EmployeeDetail, String> employeeMap = new HashMap<>();

        // Adding employees to the map
		EmployeeDetail employee1 = new EmployeeDetail(1, "John", 50000);
		EmployeeDetail employee2 = new EmployeeDetail(2, "Jane", 60000);
        EmployeeDetail employee3 = new EmployeeDetail(3, "Bob", 50000);

        employeeMap.put(employee1, "Employee 1 details");
        employeeMap.put(employee2, "Employee 2 details");
        employeeMap.put(employee3, "Employee 3 details");

        // Displaying the contents of the map
        for (Map.Entry<EmployeeDetail, String> entry : employeeMap.entrySet()) {
            EmployeeDetail key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key.getEmp_name() + " Salary: " + key.getEmp_salary()+ " Value: " + value);
        }
	}
}
