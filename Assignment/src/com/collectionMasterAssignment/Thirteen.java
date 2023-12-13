package com.collectionMasterAssignment;

import java.util.HashMap;

public class Thirteen
{
	public static void main(String[] args) {
        // Creating a HashMap with Employee as the key and String as the value
        HashMap<EmployeeDetail, String> employeeMap = new HashMap<>();

        // Adding employees to the map
        EmployeeDetail e1 = new EmployeeDetail(104, "Sachin", 1011);
        EmployeeDetail e2 = new EmployeeDetail(104, "Sachin", 1011);

        employeeMap.put(e1, "first");
        employeeMap.put(e2, "second");

        // Displaying the contents of the map
        for (HashMap.Entry<EmployeeDetail, String> entry : employeeMap.entrySet()) {
        	EmployeeDetail key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key.getEmp_name() + " Salary: " + key.getEmp_salary() + " Value: " + value);
        }
        /*
         Key: Sachin Salary: 1011 Value: second
         */
	}
}
/*
 13. Note following code
Employee e1 = new Employee (104 , "Sachin", 1011 );
Employee e2 = new Employee (104 , "Sachin", 1011 );
HashMap map = new HashMap();
map.put(e1, "first");
map.put(e2, "second");
Write a program which avoids entry of duplicate employee in map.(by using hashcode 
and equals methods)
 */
