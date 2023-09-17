package com.containmentAssignment;

public class SubTopic
{
	private int tId;
	private String tName;
	private Topic t;
	
	public Topic getT() {
		return t;
	}
	public void setT(Topic t) {
		this.t = t;
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	SubTopic()
	{
		
	}
	public SubTopic(int tId, String tName, Topic t) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.t = t;
	}
	public String toString() {
		return "SubTopic Id=" + tId+"\n"
				+ "tName=" + tName+"\n"
				+ "t=" + t +"\n";
	}
	
	
}
