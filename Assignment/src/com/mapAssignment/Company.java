package com.mapAssignment;

public class Company
{
	private int id;
	private String name;
	private String designation;
	private Employee e;
	public Company() {
		super();
	}
	public Company(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	public Company(int id, String name, String designation, Employee e) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.e = e;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee getE() {
		return e;
	}
	public void setE(Employee e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}
}
