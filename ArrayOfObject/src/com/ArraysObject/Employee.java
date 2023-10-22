package com.ArraysObject;

public class Employee
{
	private int id;
	private String name;
	private int salary;
	Employee()
	{
		
	}
	public Employee(int id, String name, int salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	static void highestPaid(Employee emp[])
	{
		float maxSal=Float.MIN_VALUE;
		Employee em=new Employee();
		for(Employee e:emp)
		{
			if(e.getSalary()>maxSal)
			{
				maxSal=e.getSalary();
				em=e;
			}
		}
		System.out.println("Highest Paid Emp:"+em);
	}
	static void sortSalary(Employee emp[])
	{
		Employee et=new Employee();//temp student
		for(int i=0;i<emp.length;i++)
		{
			for(int j=i+1;j<emp.length;j++)
			{
				if(emp[i].getSalary()<emp[j].getSalary())
				{
					et=emp[i];
					emp[i]=emp[j];
					emp[j]=et;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		Employee et[]=new Employee[5];
		et[0]=new Employee(1,"ritu",740000);
		et[1]=new Employee(2,"nitu",840000);
		et[2]=new Employee(3,"bitu",940000);
		et[3]=new Employee(4,"sita",640000);
		et[4]=new Employee(5,"gita",540000);
		
		for(Employee s:et)
		{
			System.out.println(s);
		}
		System.out.println("---------------------------------------------");
		for(int i=0;i<et.length;i++)
		{
			System.out.println(et[i]);
		}
		System.out.println("---------------------------------------------");
		highestPaid(et);
		System.out.println("---------------------------------------------");
		sortSalary(et);
		for(Employee s:et)
		{
			System.out.println(s);
		}
		System.out.println("---------------------------------------------");
	}

}
