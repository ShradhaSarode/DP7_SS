package com.p1;

import com.opps.Employee;
//import com.opps.*;  all class will be imported

public class Emp_1 {
	public static void main(String[] args)
	{
		Employee s1 = new Employee();
		
		//s1.e_id=101; ::private variable
		
		s1.name="siya";//public variable
		
		//s1.salary=250000;:default variable
		
		//s1.show();::private method not accessible in diff package
		
		s1.test();//public method accessible in diff package
		
		//s1.display();:default method not accessible in diff package
		

	}

}
