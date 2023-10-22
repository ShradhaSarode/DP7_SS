package com.opps;

import java.util.Scanner;

public class Employee {

	private int e_id;
	public String name;
	float salary;
	private void show()
	{
		System.out.println(e_id);
	}
	public void test()
	{
		System.out.println(name);
	}

	void display()
	{
		System.out.println("Employee id is:" + e_id + "\n" + "name:" + name + "\n" + "salary :" + salary + "%" + "\n");
	}

	public static void main(String[] args)
	{
		Scanner ed = new Scanner(System.in);
		Employee s1 = new Employee();
		
		s1.e_id=101;
		s1.name="siya";
		s1.salary=250000;
		
		s1.show();
		s1.test();
		s1.display();
		ed.close();
//inside the class everything is accessible
	}

}
