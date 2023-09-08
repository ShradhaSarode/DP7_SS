package com.lab1;

import java.util.Scanner;

public class Cube_method_calling {
	static int square(int num)
	{
		return num*num;
	}
	static int cube(int num)
	{
		return num*square(num);
	}

	public static void main(String[] args)
	{
		Scanner nc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = nc.nextInt();
		int square=square(num);
		int cube=cube(num);
		System.out.println("Square of given num :"+square);
		System.out.println("Cube of given num :"+cube);
		nc.close();

	}

}
