package com.labcontainment;

public class Supplier
{
	private int id;
	private String name;
	private Item i;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Item getI()
	{
		return i;
	}
	public void setI(Item i)
	{
		this.i = i;
	}
	Supplier()
	{
		
	}
	
	Supplier(int id, String name, Item i)
	{
		this.id = id;
		this.name = name;
		this.i = i;
	}

	public String toString() {
		return "Supplier id:" + id+"\n"
				+ "name:" + name+"\n"
				+ "i:" + i +"\n";
	}
	public static void main(String[] args)
	{
		

	}

}
