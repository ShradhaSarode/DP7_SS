package com.containmentAssignment;

public class Question
{
	private int qId;
	private String qName;
	private SubTopic st;
	
	public SubTopic getSt() {
		return st;
	}
	public void setSt(SubTopic st) {
		this.st = st;
	}
	public int getqId() 
	{
		return qId;
	}
	public void setqId(int qId)
	{
		this.qId = qId;
	}
	public String getqName()
	{
		return qName;
	}
	public void setqName(String qName)
	{
		this.qName = qName;
	}
	public Question(int qId, String qName, SubTopic st) {
		super();
		this.qId = qId;
		this.qName = qName;
		this.st = st;
	}
	
	public String toString()
	{
		return "Question Id=" + qId+"\n"
				+ " qName=" + qName+"\n"
				+ " st=" + st +"\n";
	}
}
