/*
 WAP to have Department class created with id, name . Student class has
roll, name and Department object should have id and name. Assign and
print individual values in main method.
 */
package com.containmentAssignment;

public class Department
{
	private int id;
	private String dName;

	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getdName()
	{
		return dName;
	}
	public void setdName(String dName)
	{
		this.dName = dName;
	}
	 Department()
	 {
		 
	 }
	 Department(int id, String dName)
	 {
		super();
		this.id = id;
		this.dName = dName;
	}
	public String toString() {
		return "Department id=" + id+"\n"
				+ "dName=" + dName + "\n";
	}
//	public static void main(String[] args)
//	{
//		
//	}

}
