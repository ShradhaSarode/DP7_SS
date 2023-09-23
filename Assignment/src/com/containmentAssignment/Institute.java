/* WAP to use containment for following hierarchy. Fill all data and print all
 data: (id is a integer number, name is a String)
Class Institute:-,id,name,Branch b;
Branch:id,name,Subject s;
Subject:id,name,Topic t;
Topic:id,name,Subtopic sub;
SubTopic:id,name,Question q;
Question:id,name
 */
package com.containmentAssignment;

public class Institute
{
	private int iId;
	private String iName;
	
	public int getiId() {
		return iId;
	}
	public void setiId(int id) {
		this.iId = id;
	}
	public String getiName() {
		return iName;
	}
	public void setiName(String name) {
		this.iName = name;
	}
	Institute()
	{
		
	}
	 Institute(int id, String name)
	{
		super();
		this.iId = id;
		this.iName = name;
	}
	
	public String toString()
	{
		return "Institute id:" + iId +"\n"
				+ "name:" + iName +"\n";
	}
}
