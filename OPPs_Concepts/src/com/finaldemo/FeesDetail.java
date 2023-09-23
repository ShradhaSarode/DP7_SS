package com.finaldemo;

//import java.util.Scanner;
 class Student
{
		private int id;
		private String name;
		protected float fees;
	Student()
	{
		
	}
	Student(int id,String name,float fees)
	{
		this.id=id;
		this.name=name;
		this.fees=fees;
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
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	void payFees()
	{
		fees*=1;
		System.out.println("Monthly fees:"+fees);
	}
	@Override
	public String toString()
	{
		return "Student id:" + id+ "\n"
				+ "name:" + name+ "\n"
				+ "fees:" + fees + "\n";
	}
	
}
class CollegeStudent extends Student
{
	private int semNo;
	private String collegeName;
	CollegeStudent()
	{
		
	}
	public CollegeStudent(int id,String name,float fees,int semNo, String collegeName) {
		super(id,name,fees);
		this.semNo = semNo;
		this.collegeName = collegeName;
	}
	public int getSemNo() {
		return semNo;
	}
	public void setSemNo(int semNo) {
		this.semNo = semNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	void payFees()
	{
		//super.payFees();
		fees*=6;
		System.out.println("Half yearly fees of clooege student:"+fees);
	}
	@Override
	public String toString() {
		return super.toString() 
				+"Student semNo:" + semNo+"\n"
				+ "collegeName:" + collegeName + "\n";
	}
	
}
class SchoolStudent extends Student
{
	private int std;
	private String schoolName;
	SchoolStudent()
	{
		
	}
	public SchoolStudent(int id,String name,float fees,int std, String schoolName)
	{
		super(id,name,fees);
		this.std = std;
		this.schoolName = schoolName;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	void payFees()
	{
		//super.payFees();
		fees*=3;
		System.out.println("Quertely fees of school student:"+fees);
	}
	@Override
	public String toString() {
		return super.toString()
				+"Student std:" + std+"\n"
				+ "schoolName:" + schoolName + "\n";
	}
	
}

public class FeesDetail
{
	public static void main(String[] args)
	{
		Student s;
		s=new Student(111,"Sita",3000);
		System.out.println(s.getName()+":");
		s.payFees();
		System.out.println("--------------------------------");
		s=new CollegeStudent();
		System.out.println("--------------------------------");
		CollegeStudent cs=new CollegeStudent(101,"Ritu",4500f,3,"MGM COE");
		SchoolStudent ss=new SchoolStudent(102,"Nitu",3500f,8,"Cambridge High School");
		System.out.println(cs);
		cs.payFees();
		
		System.out.println("--------------------------------");
		
		System.out.println(ss);
		ss.payFees();
	}
}