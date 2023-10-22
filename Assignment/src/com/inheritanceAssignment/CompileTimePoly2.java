package com.inheritanceAssignment;
/*
 3. Create a class Teenager which extends Kid created above (#14). Implement 
readBook() differently in Teenager class. In main method, declare 2 variables k1, 
k2 of type Kid. Create objects of type BigKid and Teenager such that K1 should 
reference object of class BigKid and K2 should reference object of class Teenager. 
Call their respective readBook() methods. The output is different from both the 
method calls even if the variable type is the same i.e. Kid. This is compile time 
polymorphism example.
 */
class Kid2
{
	void readBook()
	{
		System.out.println("Kid is reading a picture book.");
	}
}
class BigKid2 extends Kid2
{
	void readBook()
	{
		super.readBook();
		System.out.println("BigKid is reading a chapter book.");
	}
}
class Teenager  extends Kid2
{
	void readBook()
	{
		super.readBook();
		System.out.println("Teenager is reading a novel.");
	}
}
public class CompileTimePoly2
{
	public static void main(String[] args)
	{
		Kid2 k1;
		k1=new BigKid2();
		k1.readBook();
		System.out.println("---------------------------------------------");
		Kid2 k2;
		k2=new Teenager();
		k2.readBook();
	}
}
