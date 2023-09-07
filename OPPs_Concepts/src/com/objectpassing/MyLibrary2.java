package com.objectpassing;

import java.util.Scanner;

import com.encapsulation.Book;

public class MyLibrary2 {
static Scanner sc= new Scanner(System.in);
	
	static void insertBook(Book b)
	{
		System.out.println("Enter book id:");
		b.setB_id(sc.nextInt());
		System.out.println("Enter book name:");
		b.setB_name(sc.next());
		System.out.println("Enter book price:");
		b.setB_price(sc.nextInt());
	}

	public static void main(String[] args)
	{
		Book b1= new Book();
		insertBook(b1);
		System.out.println(b1);
		Book b2=b1;//shallow copy
		b2.setB_price(3000);
		System.out.println("**************");
		System.out.println(b1);
		System.out.println(b2);
		
		Book b3=new Book();
		b3=b1;//shallow copy:change in one object is reflected in another
		System.out.println("**************");
		System.out.println(b1);
		b3.setB_price(5000);
		

	}

}
