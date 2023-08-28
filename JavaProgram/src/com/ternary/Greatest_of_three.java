package com.ternary;

import java.util.Scanner;

public class Greatest_of_three {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num1:");
		int num1 = sc.nextInt();
		System.out.println("Enter the value of num2:");
		int num2 = sc.nextInt();
		System.out.println("Enter the value of num2:");
		int num3 = sc.nextInt();
		int max;
		max=(num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);
		System.out.println(max+" :is greater");
		int max1=(num1>num2&&num1>num3?num1:num2>num3?num2:num3);
		System.out.println(max1+" is greater");
		sc.close();
		}
}
