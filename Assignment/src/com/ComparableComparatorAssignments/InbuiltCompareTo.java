package com.ComparableComparatorAssignments;
//7.Now do descending sort of Employee.id in Employee arraylist using inbuilt compareTo technique.
import java.util.ArrayList;
import java.util.Collections;

class Emp implements Comparable<Emp>
{
	private Integer id;
	private String name;
	private String designation;
	public Emp() {
		super();
	}
	public Emp(Integer id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}
	@Override
	public int compareTo(Emp e)
	{
		return Integer.compare(this.getId(), e.getId());
	}
}
public class InbuiltCompareTo
{

	public static void main(String[] args)
	{
		ArrayList<Emp>elist=new ArrayList<>();
		elist.add(new Emp(106,"ritu","developer"));
		elist.add(new Emp(103,"nitu","tester"));
		elist.add(new Emp(101,"kitu","manager"));
		elist.add(new Emp(105,"bitu","CEO"));
		elist.add(new Emp(102,"gita","analyst"));
		elist.add(new Emp(104,"sita","teamLead"));
		for(Emp e:elist)
		{
			System.out.println(e);
		}
		System.out.println("--------------------------------");
		Collections.sort(elist);
		for(Emp e:elist)
		{
			System.out.println(e);
		}
		
	}

}
