package com.inheritanceAssignment;
/*
 1. WAJP2 create a class Kid with method readBook() and another method 
readBook () with 2 parameters. The method readBook here is over-loaded (same 
method name but different parameters) 
 */
class Kid
{
	int noOfBook;
	String name;
	float price;
	void readBook()
	{
		System.out.println("Without Parameter readbook method");
	}
	void readBook(int noOfBook,String name,float price)
	{
		System.out.println("Number of book:"+noOfBook+"\nName of book:"+name+"\nPrice:"+price);
	}
}
public class CompileTimePoly
{
	public static void main(String[] args)
	{
		Kid k=new Kid();
		k.readBook();
		k.readBook(150, "Harry Potter", 500f);
	}
}
