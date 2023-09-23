package com.methodOverridingAssignment;
/*
 8)WAP to create class Person with method readScript().
 create class Actor which extends Person implement readScript() differently in child.
 */
class Person
{
	void readScript()
	{
		System.out.println("Person is reading the script.");
	}
}
class Actor  extends Person
{
	void readScript()
	{
		super.readScript();
		System.out.println("Actor is studying the script and rehearsing lines.");
	}
}
public class ReadScript
{
	public static void main(String[] args)
	{
		 Person p1 = new Person();
		 p1.readScript();
		 System.out.println("---------------------------------------------------------");
	     Actor a1 = new Actor();
	     a1.readScript();
	}

}
