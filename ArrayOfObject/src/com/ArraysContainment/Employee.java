package com.ArraysContainment;

public class Employee
{
	private int eId;
	private String name;
	private int salary;
	private Department dept;
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Employee() {
		super();
	}
	public Employee(int eId, String name, int salary, Department dept)
	{
		super();
		this.eId = eId;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	@Override
	public String toString()
	{
		return "Employee [eId=" + eId + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
}
