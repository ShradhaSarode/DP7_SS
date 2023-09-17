package com.contenment;

import java.util.Scanner;

public class MyLibraryUserInput
{
	static Scanner sc=new Scanner(System.in);
	void enterBookDetails(Book b)
	{
		System.out.println("enter book id:");
	   b.setBid(sc.nextInt());
		
		System.out.println("enter book name:");
		b.setBname(sc.next());
		
		System.out.println("enter book price:");
		b.setPrice(sc.nextFloat());
		
		b.setAuthor(new Author());
		
	
		System.out.println("enter  author id:");
		b.getAuthor().setAid(sc.nextInt());
		
		System.out.println("enter author name:");
		b.getAuthor().setAname(sc.next());
		
	}

	public static void main(String[] args)
	{
		MyLibraryUserInput library=new MyLibraryUserInput();
		
		Book b1=new Book();
		Book b2=new Book();
		
		library.enterBookDetails(b1);
		library.enterBookDetails(b2);
		
		System.out.println(b1);
		System.out.println(b2);
		

	}

}
