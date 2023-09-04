package com.opps;

import java.util.Scanner;

public class Stud_1 {
	int sId;
	String name;
	float mark1;
	float mark2;
	float mark3;
	float percentage;
	char grade;

	void cal_percent()
	{
		percentage = (((mark1 + mark2 + mark3) / 300) * 100);
	}

	void calc_Grade()
	{
		if (percentage >= 90)
			grade = 'A';
		else if (percentage >= 75)
			grade = 'B';
		else if (percentage >= 60)
			grade = 'C';
		else if (percentage >= 40)
			grade = 'D';
		else
			grade = 'F';
	}

	void display() {
		System.out.println(
				"StudentId is:" + sId + "\n"
		      + "name:" + name + "\n"
			  + "percentage :" + percentage + "%" + "\n");
		if (grade == 'F')
			System.out.println("You have failed .... Try hard next time");
		else
			System.out.println("Congratulations!! You have passed with grade:" + grade);
	}

	public static void main(String[] args)
	{
		Scanner sd = new Scanner(System.in);
		Stud_1 s1 = new Stud_1();
		System.out.println("Enter name of student:");
		s1.name = sd.next();
		System.out.println("Enter id of student:");
		s1.sId = sd.nextInt();
		System.out.println("Enter marks of subject 1:");
		s1.mark1 = sd.nextFloat();

		System.out.println("Enter marks of subject 2:");
		s1.mark2 = sd.nextFloat();

		System.out.println("Enter marks of subject 3:");
		s1.mark3 = sd.nextFloat();

		s1.cal_percent();
		s1.calc_Grade();
		System.out.println();
		System.out.println("-----------------------------");
		s1.display();
		sd.close();

//	    Students s2=new Students();
//		s2.sId=702;
//		s2.name="riya";
//	    s2.marks=80f;
//	    s2.display();

//	    Students s3=new Students();
//		s3.sId=703;
//		s3.name="piya";
//	    s3.marks=85f;
//	    s3.display();

	}

}
