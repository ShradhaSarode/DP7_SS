package com.thisuse;

public class Testify
{
	String name;
	Testify()
	{
		
	}
	Testify(String name)
		{
		this.name=name;
			
		}
	void display()
	{
		System.out.println("welcome to TQ:"+name);
	}
	Testify changeName()
	{
		name=name+"ThinkQ";
		return this;
	}
	

	public static void main(String[] args)
	{
		Testify t1=new Testify("ritu");
		t1.display();
		Testify dummy;
		dummy=t1.changeName();
		System.out.println(dummy.name);
	}

}
