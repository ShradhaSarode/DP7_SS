package com.hasSet;

public class Course
{
	private String name ;
	private int id,  fees;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String name, int id, int fees) {
		super();
		this.name = name;
		this.id = id;
		this.fees = fees;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", marks=" + id + ", fees=" + fees + "]";
	}
}
