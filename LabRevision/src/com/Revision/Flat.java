package com.Revision;

public class Flat
{
	int flatNo;
	int noOfMember;
	float price;
	Flat()
	{
		
	}
	public Flat(int flatNo, int noOfMember, float price) {
		super();
		this.flatNo = flatNo;
		this.noOfMember = noOfMember;
		this.price = price;
	}
	@Override
	public String toString()
	{
		return "Flat No=" + flatNo+ "\n"
				+ "noOfMember=" + noOfMember+ "\n"
				+ "price=" + price + "\n";
	}
	
}
