package com.inheritanceAssignment;
/*
 *2. Create a class BigKid which extends Kid created above. Implement readBook() 
differently in BigKid class. Here the method readBook() has been over-ridden in 
the child class BigKid()
 */
class Kid1
{
	int noOfBook;
	String name;
	float price;
	void readBook(int noOfBook,String name,float price) 
	{
		System.out.println("Number of book:"+noOfBook+"\nName of book:"+name+"\nPrice:"+price);
	}
}
class BigKid extends Kid
{
	void readBook()
	{
		System.out.println("BigKid is reading book of kid.");
	}
}
public class RunTimePoly
{
	public static void main(String[] args)
	{
		BigKid k=new BigKid();
		k.readBook(150, "Harry Potter", 500f);
		k.readBook();
	}

}
