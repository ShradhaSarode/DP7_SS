package com.containmentAssignment;

public class Topic
{
	private int tId;
	private String tName;
	private Subject s;
	
	public int gettId()
	{
		return tId;
	}
	public void settId(int tId)
	{
		this.tId = tId;
	}
	public String gettName()
	{
		return tName;
	}
	public void settName(String tName)
	{
		this.tName = tName;
	}
	public Subject getS()
	{
		return s;
	}
	public void setS(Subject s)
	{
		this.s = s;
	}
	public void setTopic(Subject s)
	{
		this.s = s;
	}
	 Topic()
	 {
		 
	 }
	 Topic(int tId, String tName, Subject s) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.s = s;
	}
	
	public String toString()
	{
		return "Topic tId:" + tId +"\n"
				+ "tName:" + tName+"\n"
				+ "Subject:" + s +"\n";
	}
	
	

}
