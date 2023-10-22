package com.ArraysContainment;

public class Theater
{
	private int id;
	private String name;
	private String location;
	private Movie m;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Movie getM() {
		return m;
	}
	public void setM(Movie m) {
		this.m = m;
	}
	public Theater() 
	{
		super();
	}
	public Theater(int id, String name, String location, Movie m)
	{
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.m = m;
	}
	@Override
	public String toString()
	{
		return "Theater [id=" + id + ", name=" + name + ", location=" + location + ", m=" + m + "]";
	}
}
