package com.objectpassing;

import java.util.Scanner;

import com.encapsulation.Book;

public class MyLibrary {
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

	public static void main(String[] args) {
		Book b1= new Book();
		insertBook(b1);
		Book b2= new Book();
		insertBook(b2);
		Book b3= new Book();
		insertBook(b3);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		

	}

}
