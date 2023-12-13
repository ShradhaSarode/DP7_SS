package com.ComparableComparatorAssignments;

import java.util.ArrayList;
import java.util.Collections;

/*
10. WAP to create a class Student with (rollNo, name and age). Create 3 Comparator implementations 
for each Student attribute (i.e. rollNo, name and age)
 */
class Student
{
	private int rollNo;
	private String name;
	private int age;
	public Student() {
		super();
		
	}
	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}
}
public class TenthQ
{
	public static void main(String[] args)
	{
		ArrayList<Student> slist= new ArrayList<>();
		slist.add(new Student(23,"ritu",18));
		slist.add(new Student(12,"nitu",21));
		slist.add(new Student(25,"bitu",20));
		slist.add(new Student(28,"ritu",22));
		slist.add(new Student(22,"ritu",18));
//		System.out.println(slist);
		System.out.println("==================");
		for(Student s:slist)
		{
			System.out.println(s);
		}
//		Collections.sort(slist, new AgeComparator());
//		Collections.sort(slist, new RollNumComparator());
		Collections.sort(slist, new NameComparator());
		
		System.out.println("==================");
		
		for(Student s:slist)
		{
			System.out.println(s);
		}
	}

}
