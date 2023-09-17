package com.containmentAssignment;

public class Topic
{
	private int tId;
	private String tName;
	private Subject topic;
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
	public Subject getTopic() {
		return topic;
	}
	public void setTopic(Subject topic) {
		this.topic = topic;
	}
	 Topic()
	 {
		 
	 }
	 Topic(int tId, String tName, Subject topic) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.topic = topic;
	}
	
	public String toString()
	{
		return "Topic tId:" + tId +"\n"
				+ "tName:" + tName+"\n"
				+ "topic=" + topic +"\n";
	}
	
	

}
