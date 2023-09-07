package com.encapsulation;

import java.util.Scanner;

public class Libarary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book b1=new Book();
		//implicit //hard core values
		b1.setB_id(101);
		b1.setB_name("Harry Potter");
		b1.setB_price(890);
		System.out.println(b1.getB_id()+"  "+b1.getB_name()+"  "+b1.getB_price()+"  ");
		System.out.println(b1);
		Book b2=new Book();
		System.out.println("Enter the book id:");
		b2.setB_id(sc.nextInt());
		System.out.println("Enter the book name:");
		b2.setB_name(sc.next());
		System.out.println("Enter the book price:");
		b2.setB_price(sc.nextInt());
		System.out.println(b2);
		sc.close();

	}

}
