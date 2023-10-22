package com.finaldemo;
class StudentDetail
{
	final static String aadhaarNum;
	final String name;
	int id;
	static
	{
		 aadhaarNum="991526030127";
	}
//	{
//		name="Ritu Sarode";
//	}
	StudentDetail()
	{
		this.name="Ritu Sarode";
	}
	StudentDetail(String name,int id)
	{
		super();
		//this.aadhaarNum=aadharNum;
		this.name=name;
		this.id=id;
	}
}
class SchoolStudent1 extends StudentDetail
{
	String sName;
	float fees;
	final int id;
//	{
//		id=101;
//	}
	SchoolStudent1()
	{
		id=101;
	}
	SchoolStudent1(String sName,float fees,int id)
	{
		this.sName=sName;
		this.fees=fees;
		this.id=id;
	}
}
public class FinalStudent {

	public static void main(String[] args)
	{
		StudentDetail d1=new StudentDetail();
		System.out.println(d1.aadhaarNum+"\n"
				                     +d1.name+"\n"
				                     +d1.id+"\n");
		
	}

}
