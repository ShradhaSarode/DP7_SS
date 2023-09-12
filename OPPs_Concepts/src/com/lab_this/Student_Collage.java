/*
 Create a class Student with the private attributes
int studentId,String studentName, studentAddress, collegeName. 
Include appropriate getter methods.
Assume most of the students are from “TQ” college.
 So user has to give input whether the student is from TQ or not. 
If student belongs to TQ, give input as 1 and  skip input for the attribute collegeName  and create student
 object with 3-argument constructor to initilze the values for studentId, studentName and studentAddress
  and  collegeName as “TQ”.

If student belongs to other college, give input as 0 and get college name from the user
 and create student object with 4-argument constructor to initialize all the values.
  Instead of 1 / 0, if user enters different input then display 'Wrong Input' and get the input again.
Based on the above assumptions write the necessary constructors in the Student class.
Write a class StudentMain with the main method and test the application
 */

package com.lab_this;

import java.util.Scanner;

class Student1
{
	int studentId;
    String studentName;
	String	studentAddress;
	String	collegeName;
	
	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public String getCollegeName() {
		return collegeName;
	}

	Student1(int studentId, String studentName,String	studentAddress,String collegeName)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentAddress=studentAddress;
		this.collegeName=collegeName;
	}
	Student1(int studentId, String studentName,String	studentAddress)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentAddress=studentAddress;
	}
	public String toString()
	{
		return " studentId:"+studentId
				+"\n studentName:"+studentName
				+"\n studentAddress:"+studentAddress+
				"\n collegeName:"+collegeName+"\n";
	}
	
}

public class Student_Collage {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input value 0 or 1");
		int input=sc.nextInt();
		do {
		if(input==1)
		{
			Student1 s1=new Student1(111,"ritu","nanded","TQ");
			System.out.println(s1);
		break;
		}
		else if(input==0)
		{
			System.out.println("Enter the college name:");
			String collegeName=sc.next();
			Student1 s2=new Student1(112,"nitu","pune",collegeName);
			System.out.println(s2);
			break;
		}
		else
		{
			System.out.println("You enter wrong input ...................please enter only 1 and 0");
			System.out.println("Enter the input value 0 or 1");
			input=sc.nextInt();
		}
		}while(true);
	//	sc.close();

	}

}
