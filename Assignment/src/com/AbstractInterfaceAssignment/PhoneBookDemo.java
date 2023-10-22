package com.AbstractInterfaceAssignment;
/*
 1)You have to build a phone book. 
 The phone book has the name and contact
 of a person. This is an openly accessible
 book so it should be designed accordingly.
Public
 */
abstract class PhoneBook
{
	String name;
	long contact;
	PhoneBook()
	{
//		this.name="Siya";
//		this.contact=99701401;
	}
	public PhoneBook(String name, long contact)
	{
		super();
		this.name = name;
		this.contact = contact;
	}
	abstract void description();

	public void print()
	 {
		System.out.println( "Person name=" + name +"\n"+ "contact=" + contact +"\n");
	}
}
class Person extends PhoneBook
{
	int id;
	String address;
	Person()
	{
		
	}
	public Person(String name, long contact,int id, String address)
	{
		super(name,contact);
		this.id = id;
		this.address = address;
	}
	@Override
	public void description()
	{
		System.out.println("Person contact detail:");
	}
	public void print()
	 {
		super.print();
		System.out.println( "Person id=" + id +"\n"+ "Address=" + address +"\n");
	}
}
public class PhoneBookDemo
{
	public static void main(String[] args)
	{
		Person p1=new Person("Ritu",99701401,101,"Nanded");
		p1.description();
		p1.print();
	}

}
