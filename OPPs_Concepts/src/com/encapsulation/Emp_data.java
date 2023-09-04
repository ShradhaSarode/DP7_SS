package com.encapsulation;

import java.util.Scanner;

public class Emp_data {

	public static void main(String[] args) {
		Scanner ed=new Scanner(System.in);
		Emp1 e1=new Emp1();
		e1.getE_id();
		e1.getE_name();
		e1.getE_salary();
		e1.getE_dept();
		
		System.out.println("Enter the emp id:");
		int E_id=ed.nextInt();
		System.out.println("Enter the emp name:");
		String E_name=ed.next();
		System.out.println("Enter the emp salary:");
		float E_salary=ed.nextFloat();
		System.out.println("Enter the emp department:");
		String E_dept=ed.next();
		System.out.println("Employee id :"+E_id+" name:"+E_name+" salary: "+E_salary+" department: "+E_dept);
		ed.close();
	}

}
