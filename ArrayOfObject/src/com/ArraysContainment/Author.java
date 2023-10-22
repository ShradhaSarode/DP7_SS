package com.ArraysContainment;

public class Author
{
	private int aid;
	private String aname;
	
	Author()
	{
		
	}
	Author(int aid,String name)
	{
		this.aid=aid;
		this.aname=name;
	}
	public int getAid()
	{
		return aid;
	}
	public void setAid(int aid)
	{
		this.aid = aid;
	}
	public String getAname()
	{
		return aname;
	}
	public void setAname(String aname)
	{
		this.aname = aname;
	}
	
	public String toString()
	{
		return "Author id:"+aid+"\nAuthor name:"+aname+"\n";
	}
}
