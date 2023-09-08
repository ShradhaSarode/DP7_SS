package com.constructor;

class School1
{
	private String name;
	private int student;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudent() {
		return student;
	}
	public void setStudent(int student) {
		this.student = student;
	}
	public String toString()
	{
		return name+" "+student;
	}
	
}

public class School {

	public static void main(String[] args)
	{
		School1 s1=new School1();
		s1.setName("ss");
		s1.setStudent(2530);
		System.out.println(s1);
		

	}

}
