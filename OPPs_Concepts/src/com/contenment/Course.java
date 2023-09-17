package com.contenment;

public class Course
{
	private int cid;
	private String name;
	private float fees;

	Course()
	{
		
	}
	Course(int cid,String name,float fees)
	{
		this.cid=cid;
		this.name=name;
		this.fees=fees;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	
	public String toString()
	{
		return "Course id:"+cid
				+"\ncourse name:"+name
				+"\nfees:"+fees+"\n";
	}

	
}
