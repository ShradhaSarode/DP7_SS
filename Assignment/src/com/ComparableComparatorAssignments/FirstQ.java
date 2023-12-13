package com.ComparableComparatorAssignments;

import java.util.ArrayList;
import java.util.Collections;
/*
 1.WAP to sort the elements of List that contains String objects.Print ArrayList.Sort using 
Collections.sort(list) method. Print ArrayList.
 */
class Person implements Comparable<Person>
{
	private int id;
	private String name;
	
	public Person()
	{
		super();
	}
	public Person(int id, String name)
	{
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Person p)
	{
		if(this.getId()>p.getId())
			return this.getName().compareTo(p.getName());
		else
			if(this.getId()<p.getId())
				return -1;
			else 
				return 1;
	}	
}
public class FirstQ
{
	public static void main(String[] args)
	{
		ArrayList<Person> plist=new ArrayList<>();
		plist.add(new Person(101,"tina"));
		plist.add(new Person(102,"rina"));
		plist.add(new Person(103,"mina"));
		plist.add(new Person(104,"sita"));
		plist.add(new Person(105,"ram"));
		for(Person p:plist)
		{
			System.out.println(p);
		}
		System.out.println("----------------------------------------");
		Collections.sort(plist);
		for(Person p:plist)
		{
			System.out.println(p);
		}
	}

}
