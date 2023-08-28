/*Gross salary according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80% 
Basic Salary <= 20000 : HRA = 25%, DA = 90% 
Basic Salary >20000 : HRA = 30%, DA = 95% */

package com.ifelse;

import java.util.Scanner;

public class Salary_Gross {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the basic salary of employee:");
		double basic_salary =ss.nextDouble();
		double gross_salary=0;

		if (basic_salary <= 10000)
		{
			double HRA = basic_salary * 0.20;
			double DA = basic_salary * 0.80;
			gross_salary=basic_salary + HRA + DA;
			System.out.println("Gross_Salary: "+gross_salary);
		}
		else if (basic_salary <= 20000)
		{
			double HRA1 = basic_salary *0.25;
			double DA1 = basic_salary *0.90;
			gross_salary=basic_salary + HRA1 + DA1;
			System.out.println("Gross_Salary: "+gross_salary);
			
		}
		else if (basic_salary > 20000)
		{
			double HRA2 = basic_salary *0.30;
			double DA2 = basic_salary *0.90;
			gross_salary=basic_salary + HRA2 + DA2;
			System.out.println("Gross_Salary: "+gross_salary);
		}
		ss.close();
	}
}
