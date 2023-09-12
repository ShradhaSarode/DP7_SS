package com.staticDemo;
class  Student2
{
	private int id;
	String name;
	float mark;
	String scName;
	static int sCount=0;
	
	Student2()
	{
		scName="Cambridge";
		
	}
	Student2(int id,String name,float mark)
	{
		this.id=id;
		this.name=name;
		this.mark=mark;
	}
	public String toString()
	{
		return id+" "+name+" "+mark;
	}
	
}

public class StudentTest2 {
	public static void main(String[] args) {
		Student2 s1=new Student2();
		System.out.println(s1.scName);

	}

}
