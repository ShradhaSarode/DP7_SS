package com.containmentAssignment;

public class Student
{
	private int rollNum;
	private String sName;
	private Department sDepartment;
	
	Student()
	{
		
	}
    Student(int rollNum, String sName, Department sDepartment)
	{
		super();
		this.rollNum = rollNum;
		this.sName = sName;
		this.sDepartment = sDepartment;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Department getsDepartment() {
		return sDepartment;
	}
	public void setsDepartment(Department sDepartment) {
		this.sDepartment = sDepartment;
	}

	public String toString() {
		return "Student rollNum:" + rollNum+"\n"
				+ "sName:" + sName+"\n"
				+ "sDepartment:" + sDepartment +"\n" ;
	}
	public static void main(String[] args)
	{
		Department d1=new Department(101,"IT");
		Department d2=new Department(102,"CS");
		
		Student s1=new Student(111,"ShradhaSarode",d1);
		Student s2=new Student(111,"ShreyaSarode",d2);
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
