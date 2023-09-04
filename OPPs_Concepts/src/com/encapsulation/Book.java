package com.encapsulation;

public class Book {
	private int b_Id;
	private String b_name;
	private float b_price;
	public void setB_id(int b_id)
	{
		this.b_Id=b_id;
	}
	public int getB_id()
	{
		return this.b_Id;
	}
	public void setB_name(String b_name)
	{
		this.b_name=b_name;
	}
	public String getB_name()
	{
		return this.b_name;
	}
	public void setB_price(int b_price)
	{
		this.b_price=b_price;
	}
	public float getB_price()
	{
		return this.b_price;
	}
	public String toString()
	{
		return "Book id is:"+b_Id+" name is:"+ b_name+" price:"+b_price;
	}

}
