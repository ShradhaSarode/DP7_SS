package com.contenment;
/*
 
 */

public class Department
{
	int dId;
	String dName;
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	Department()
	{
		
	}
	 Department(int dId, String dName)
	 {	
		this.dId = dId;
		this.dName = dName;
	}
}
