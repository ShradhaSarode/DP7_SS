package com.hashmap;

public class Course
{
	private int id;
	private String cName;
	private int fees;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int id, String cName, int fees) {
		super();
		this.id = id;
		this.cName = cName;
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", cName=" + cName + ", fees=" + fees + "]";
	}
}
