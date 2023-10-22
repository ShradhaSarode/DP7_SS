package com.ArraysContainment;

public class EmpConstructor
{
	static void countEmpDeptWise(Employee [] ep, Department[] de)
	{
		int count;
		for(Department d:de)
		{
			count=0;
			System.out.println(d.getName()+":");
			for(Employee e:ep)
			{
				if(e.getDept().equals(d))
				{
					count++;
					System.out.println(e.getName()+":");
				}
			}
			System.out.println(d+":"+"Dept count:"+count);
		}
	}
	public static void main(String[] args)
	{
		Department dept[]=new Department[3];
		dept[0]=new Department(101,"IT");
		dept[1]=new Department(102,"CS");
		dept[2]=new Department(103,"ETC");
		
		Employee emp[]=new Employee[6];
		
		emp[0]=new Employee(1,"ritu",5536900,dept[0]);
		emp[1]=new Employee(2,"nitu",3536900,dept[1]);
		emp[2]=new Employee(3,"bitu",6536900,dept[2]);
		emp[3]=new Employee(4,"kitu",8536900,dept[1]);
		emp[4]=new Employee(6,"sita",9536900,dept[2]);
		emp[5]=new Employee(6,"gita",7536900,dept[2]);
		
		for(Employee e:emp)
		{
			System.out.println(e);
		}
		System.out.println("---------------------------------------------------------");
		countEmpDeptWise(emp,dept);
	}

}
