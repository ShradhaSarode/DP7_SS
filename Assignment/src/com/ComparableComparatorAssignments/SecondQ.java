package com.ComparableComparatorAssignments;

import java.util.ArrayList;
import java.util.Collections;

/*
 2.WAP to sort the elements of List that contains Integer objects.Print ArrayList.Sort using 
Collections.sort(list) method.Print ArrayList.
Note: In the above 2 assignments, sorting is achieved automatically as String as well as Wrapper 
class Integer implements Comparable interface method compareTo.
 */
class School  implements Comparable<School>
{
	private int id;
	private String name;
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public School(int id, String name) {
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
		return "School [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(School s)
	{
		if(this.getId()==s.getId())
			return 0;
		else
			if(this.getId()<s.getId())
				return -1;
			else 
				return 1;
	}
	
}
public class SecondQ
{
	public static void main(String[] args)
	{
		ArrayList<School>slist=new ArrayList<>();
		slist.add(new School(191,"St. Mary’s School"));
		slist.add(new School(141,"Army Public School"));
		slist.add(new School(171,"St. Vincent's High School, Pune"));
		slist.add(new School(121,"Abhinava Vidyalaya English Medium"));
		slist.add(new School(151,"St. Helena's School"));
		for(School s:slist)
		{
			System.out.println(s);
		}
		System.out.println("----------------------------------------");
		Collections.sort(slist);
		for(School s:slist)
		{
			System.out.println(s);
		}
	}

}
