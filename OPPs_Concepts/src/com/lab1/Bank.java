package com.lab1;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner cd=new Scanner(System.in);
		char ch;
		float bal=0;
		Customer c1=new Customer();
		c1.setC_id(101);
		c1.setC_name("Siya");
		c1.setC_acc_num(622459589);
		//c1.setC_acc_bal(0);
		//System.out.println(c1);:-Override value 
		System.out.println("Id of customer:"+c1.getC_id()+"\n"
		                   +"Name of customer:"+c1.getC_name()+"\n"
				           +"Account Number is:"+c1.getC_acc_num()+"\n"
		                   +"Available balance is:"+c1.getC_acc_bal());
		
		System.out.println("Which transaction do u want c or d:");
		ch=cd.next().charAt(0);
		if(ch=='c')
		{
			System.out.println("Enter the amoun u want to credit:");
			float credit =cd.nextFloat();
			bal =credit+c1.getC_acc_bal();
			System.out.println("Available balance after credit is:"+bal);
		}
		if(ch=='d')
		{
			System.out.println("Enter the amoun u want to dedit:");
		    float debit =cd.nextFloat();
			bal =100000-debit;
		    System.out.println("Available balance after debit is:"+bal);
			
		}
		System.out.println("After credit or debit:"+bal);
		cd.close();

	}

}
