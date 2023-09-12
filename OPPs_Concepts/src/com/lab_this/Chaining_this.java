package com.lab_this;

class Student
{
	int id;
	String name;
	int mark;
	String subject;
	Student()
	{
//		this.id=104;
//		this.name="sita";
//		this.mark=75;
//		this(104,"sita",75);
		//System.out.println("Default ");
		this("c++");
	}
	Student(String subject)
	{
	//	this();
		this.subject=subject;
	}
	Student(int id,String name,int mark)
	{
		this();
		this.id=id;
		this.name=name;
		this.mark=mark;
	}
	public String toString()
	{
		return "Student id:"+id+"\n name :"+name+"\n mark:"+mark+"\n subject:"+subject+"\n";	
	}
}
public class Chaining_this {

	public static void main(String[] args)
	{
		Student s1=new Student(101,"ritu",85);
		Student s2=new Student();
		Student s3=new Student(103,"nitu",95);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
