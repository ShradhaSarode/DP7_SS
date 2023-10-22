package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>
{
	private int id;
	private String name;
	private float marks;
	public Student()
	{
		super();	
	}
	public Student(int id, String name, float marks)
	{
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
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
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString()
	{
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student s)
	{
		if(this.getMarks()==s.getMarks())
		return 0;
		else
			if(this.getMarks()<s.getMarks())
				return -1;
			else
				return 1;
	}
//	public int compareTo(Student s)
//	{
//		if(this.getMarks()==s.getMarks())
//		{
//			if(this.id==s.getId())
//				return 0;
//		}
//		else
//			if(this.getMarks()<s.getMarks())
//				return -1;
//			else
//				return 1;
//	}
	public static void main(String[] args) 
	{
		ArrayList<Student> slist=new ArrayList<>();
		slist.add(new Student(101,"ritu",78.5f));
		slist.add(new Student(102,"nitu",85.5f));
		slist.add(new Student(103,"bitu",96.5f));
		slist.add(new Student(104,"kitu",65.5f));
		slist.add(new Student(105,"rita",60.5f));
		slist.add(new Student(106,"piya",88.5f));
		for(Student s:slist)
		{
//			System.out.println(s.getName()+" "+s.getMarks());
			System.out.println(s);
		}
		System.out.println("----------------------------------");
		Collections.sort(slist);
		for(Student s:slist)
		{
			System.out.println(s);
		}
	}
	
}
