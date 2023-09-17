package com.contenment;

public class MyLibrary {

	public static void main(String[] args) {
		Author a1=new Author(101,"SS");
		Author a2=new Author(102,"RR");
		
		Book b1=new Book(1,"html",500f,a1);
		Book b2=new Book(2,"javaScript",800f,a2);
		
		System.out.println(b1);
		System.out.println("---------------------------------------------");
		System.out.println(b2);
		
	//	System.out.println(3,"CSS",560f,new Author(103,"TT"));

	}

}
