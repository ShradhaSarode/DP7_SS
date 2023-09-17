package com.containmentAssignment;

public class Subject
{
	private int sId;
	private String sName;
	private Branch branch;
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	 Subject()
	 {
		 
	 }
	 Subject(int sId, String sName, Branch branch) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.branch = branch;
	}
	
	public String toString()
	{
		return "Subject sId:" + sId +"\n"
				+ "sName=" + sName +"\n"
				+ "branch=" + branch +"\n";
	}
	
	

}
