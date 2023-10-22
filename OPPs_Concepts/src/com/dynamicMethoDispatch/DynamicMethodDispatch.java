package com.dynamicMethoDispatch;
class Student
{
	String name="ritu";
	void show()
	{
		System.out.println("Name of student:"+name);
	}
}
class CollegeStudent extends Student
{
	String cName="MGM COE";
	@Override
	void show()
	{
		//super.show();
		System.out.println("college name:"+cName);
	}
	void print()
	{
		System.out.println("This is Engineering college of Nanded");
	}
}
public class DynamicMethodDispatch {

	public static void main(String[] args)
	{
		Student s1;
		s1=new Student();
		s1.show();
		s1=new CollegeStudent();
		s1.show();
		//s1.print(); only override method is call
		System.out.println("--------Seprate Object of child class----------");
		CollegeStudent c1= new CollegeStudent();
		c1.show();
		c1.print();
		

	}

}
