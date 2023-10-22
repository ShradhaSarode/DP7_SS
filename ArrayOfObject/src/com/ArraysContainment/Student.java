package com.ArraysContainment;

public class Student 
{
	private int id;
	private String name;
	private Course c;
	public Student()
	{
		super();	
	}
	public Student(int id, String name, Course c) {
		super();
		this.id = id;
		this.name = name;
		this.c = c;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", c=" + c + "]";
	}
}
