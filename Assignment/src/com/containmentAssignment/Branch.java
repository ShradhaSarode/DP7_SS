package com.containmentAssignment;

public class Branch
{
	private int bId;
	private String bName;
	private Institute i;
	
	public Institute getI() {
		return i;
	}
	public void setI(Institute i) {
		this.i = i;
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	Branch()
	{
		
	}
	 Branch(int bId, String bName, Institute i) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.i = i;
	}
	public String toString()
	{
		return "Branch Id=" + bId+"\n"
				+ "bName=" + bName+"\n"
				+ "i=" + i +"\n";
	}
}
