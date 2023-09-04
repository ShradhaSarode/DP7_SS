package com.opps;

public class Emp_detail {

	public static void main(String[] args)
	{
		Employee s1 = new Employee();
		
		//s1.e_id=101;:private variable
		s1.name="siya";//public variable
		s1.salary=250000;//default variable
		
		//s1.show();:private method not accessible in same package
		s1.test();//public method accessible in same package
		s1.display();// default method accessible in same package
		

	}

}
