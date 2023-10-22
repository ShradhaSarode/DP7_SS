package com.constructor;

class Student
{
	private int id;
	private int age;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

Student(int id,int age,String name)
{
	this.id=id;
	this.age=age;
	this.name=name;
}
public Student()
{
	
}
public String toString()
{
	return id+" "+age+" "+name;
}
}
public class Parametrised_const
{
	public static void main(String[] args)
	{
		Student s1=new Student(101,25,"ritu");
		Student s2=new Student(102,24,"nitu");
		Student s3=new Student(103,27,"sita");
		Student s4=new Student(104,26,"gita");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		Student s5=new Student();
		s5.setId(105);
		s5.setAge(28);
		s5.setName("piya");
		System.out.println(s5);

	}

}
