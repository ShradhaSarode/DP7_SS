package com.Revision;

public class Building
{
	String bName;
	Flat ft;
	Building()
	{
		
	}
	public Building(String bName, Flat ft)
	{
		super();
		this.bName = bName;
		this.ft = ft;
	}

	@Override
	public String toString() {
		return "Building Name=" + bName+ "\n" 
				+ "ft=" + ft + "\n";
	}
	public static void main(String [] args)
	{
		Flat f1=new Flat(101,10,4500000f);
		Building b1=new Building("Sukhwani Udyan",f1);
		System.out.println(b1);
	}
}
