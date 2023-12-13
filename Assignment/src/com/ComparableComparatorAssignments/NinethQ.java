package com.ComparableComparatorAssignments;

import java.util.ArrayList;
import java.util.Collections;

/*
 9. Add Profile(state,country) object in Employee object. Do sorting of employees on the country basis.
 */
class Employee1 implements Comparable<Employee1>
{
	private String state;
	private String country;
	public Employee1() {
		super();
		
	}
	public Employee1(String state, String country) {
		super();
		this.state = state;
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Employee1 [state=" + state + ", country=" + country + "]";
	}
	@Override
public int compareTo(Employee1 e)
	{	
		if(this.country==e.country)
			return this.country.compareTo(e.country);
//		else
//			if(this.country==e.country)
//				return -1;
			else
				return 1;
	}
	
}
public class NinethQ
{
	public static void main(String[] args)
	{
		ArrayList<Employee1>elist=new ArrayList<>();
		elist.add(new Employee1("Berlin","Germany"));
		elist.add(new Employee1("New Delhi","India"));
		elist.add(new Employee1("Rome","Italy"));
		elist.add(new Employee1("Tokyo","Japan"));
		elist.add(new Employee1("Male","Maldives"));
		for(Employee1 e:elist)
		{
			System.out.println(e);
		}
		System.out.println("--------------------------------");
		Collections.sort(elist);
		for(Employee1 e:elist)
		{
			System.out.println(e);
		}
	}

}
