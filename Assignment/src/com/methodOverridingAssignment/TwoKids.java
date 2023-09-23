package com.methodOverridingAssignment;
/*
 1) WAP to create a class Kid with method readBook() and another method readBook () with 2
parameters. The method readBook here is over-loaded (same method name but different
parameters) Create a class BigKid which extends Kid created above. Implement readBook() differently in
BigKid class. Here the method readBook() has been over-ridden in the child class BigKid()
 */
class Kid
{
	void readBook()
	{
		System.out.println("Kid is reading book.........");
	}
	 void readBook(String name,String author)
	{
		System.out.println("Kid is reading book: "+name+" by author "+author);
	}
}
class BigKid extends Kid
{
	@Override
	void readBook()
	{
		System.out.println("BigKid is reading book.........");
	}
}
public class TwoKids
{
	
	public static void main(String[] args)
	{
		Kid k=new Kid();
		k.readBook();
		k.readBook("Harry Potter","J.K. Rowling");
		System.out.println("--------------------------------------------");
		BigKid bk=new BigKid();
		bk.readBook();
		bk.readBook("Harry Potter","J.K. Rowling");
		
	}

}
