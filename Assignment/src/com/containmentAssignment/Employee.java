package com.containmentAssignment;
public class Employee
{
	int id;
	String name;
	float salary;
	MyDepartment dept;
	MyDate date;
	
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public MyDepartment getDept() {
		return dept;
	}
	public void setD(MyDepartment dept) {
		this.dept = dept;
	}
	public MyDate getDate() {
		return date;
	}
	public void setDate(MyDate date) {
		this.date = date;
	}
	Employee ()
	{
		
	}
	Employee (int id,String name,float salary,MyDepartment dept,MyDate date)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
		this.date=date;
	}
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		MyDepartment d1=new MyDepartment();
		MyDate dt=new MyDate();
		
		e1.setId(101);
		e1.setName("Ritu");
		e1.setSalary(55000f);
		
		e1.setD(d1);
		e1.getDept().setdId(111);
		e1.getDept().setdName("IT");
		
		e1.setDate(dt);
		e1.getDate().setDate(15);
		e1.getDate().setMonth(9);
		e1.getDate().setYear(2023);
		
		System.out.println("Employee id:"+e1.getId()+"\n"
		                              +"Name: "+e1.getName()+"\n"
		                              +"Salary:"+e1.getSalary()+"\n"
		                              +"MyDepartment id:"+e1.getDept().getdId()+"\n"
		                              +"Name:"+e1.getDept().getdName()+"\n"
		                              +"Date:"+e1.getDate().getDate()+"/"
		                              +e1.getDate().getMonth()+"/"
		                              +e1.getDate().getYear()+"\n");
		
	}

}
