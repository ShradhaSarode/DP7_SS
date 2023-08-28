package com.switchstatements;

import java.util.Scanner;

public class Arthimatic {
	public static void main(String[] args)
	{
		Scanner wd=new Scanner(System.in);
		System.out.println("Enter num 1:");
		int num1=wd.nextInt();
		System.out.println("Enter num 2:");
		int num2=wd.nextInt();
		System.out.println("Select any option");
		char option=wd.next().charAt(0);
		switch(option){
		case '+':
			System.out.println("Add:"+(num1+num2));
			break;
		case '-':
			System.out.println("Sub:"+(num1-num2));
			break;
		case '*':
			System.out.println("Mul:"+(num1*num2));
			break;
		case '/':
			System.out.println("Div:"+(num1/num2));
			break;
		
			default :
				System.out.println("no option selected");
			
		}
		
		wd.close();
	}
}
