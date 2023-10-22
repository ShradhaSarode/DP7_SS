package com.CustomeException;

import java.util.Scanner;

public class NameAccept {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		String name=sc.next();
		try
		{
			if(name.length()<3)
			{
				throw new InvalidNameException("name should be greater than 2 char");
			}
			System.out.println("welcome"+name);
		}
		catch(InvalidNameException e)
		{
			System.out.println(e);
		}
	}

}
