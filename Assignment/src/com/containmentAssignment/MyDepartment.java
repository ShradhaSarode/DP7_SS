package com.containmentAssignment;
/*
 Create Employee class which has attributes (id, name, salary, dept,
mydate). Where dept and mydate is class, dept has (dept_id, dept_name)
And mydate has (day, month, year).
Display Employee information.
Note. Containment using constructor and getter/setter

 */
public class MyDepartment
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
	MyDepartment()
	{
		
	}
	 MyDepartment(int dId, String dName)
	 {	
		this.dId = dId;
		this.dName = dName;
	}
}
