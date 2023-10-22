package com.ArraysContainment;

public class Department 
{
	private int dId;
	private String name;
	public Department()
	{
		super();	
	}
	public Department(int dId, String name)
	{
		super();
		this.dId = dId;
		this.name = name;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "Department [dId=" + dId + ", name=" + name + "]";
	}
}
