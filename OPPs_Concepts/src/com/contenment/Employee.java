package com.contenment;

public class Employee 
	{
		int id;
		String name;
		float salary;
		Department dept;
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
		public Department getDept() {
			return dept;
		}
		public void setD(Department dept) {
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
		Employee (int id,String name,float salary,Department dept,MyDate date)
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
			Department d1=new Department();
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
			
			System.out.println("Employee:"+e1.getId()
			                              +" "+e1.getName()
			                              +" "+e1.getSalary()
			                              +""+e1.getDept().getdId());
		}
	}


