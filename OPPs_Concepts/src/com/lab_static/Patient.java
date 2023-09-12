package com.lab_static;

public class Patient
{
	int pId;
	String pName;
	static String dName="Dr.More";
	String hName;
	static int count;
	
	static
	{
		dName="Dr.Shinde";
		count=0;
	}
	
	
	Patient()
	{
		this.dName=dName;
	}
	Patient(int pId,String pName,String hName)
	{
		this();
		this.pId=pId;
		this.pName=pName;
		this.hName=hName;
		count ++;
	}
	void display()
	{
		System.out.println( " Patient id:"+pId
				+"\n Patient Name:"+pName
				+"\n Doctor Name:"+dName+
				"\n Hospital Name:"+hName+"\n");
	}
	

	public static void main(String[] args)
	{
		Patient p1=new Patient(101,"Ritu","City Hospital");
		p1.display();
		
		Patient p2=new Patient(111,"nitu","City Hospital");
		p2.display();
		
		Patient p3=new Patient(121,"bitu","City Hospital");
		p3.display();
		
		System.out.println("Count num of patient:"+Patient.count);

	}

}
