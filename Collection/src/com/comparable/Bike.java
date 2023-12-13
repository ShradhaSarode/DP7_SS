package com.comparable;

public class Bike implements Comparable<Bike>
{
	private int id;
	private String name;
	private int price;
	private int modelYear;
	public Bike()
	{
		super();	
	}
	public Bike(int id, String name, int price, int modelYear) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.modelYear = modelYear;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", price=" + price + ", modelYear=" + modelYear + "]";
	}
	@Override
	public int compareTo(Bike b)
	{	
//		return b.getId()-this.getId();
		//return this.getPrice()-b.getPrice();
		if(this.getPrice()==b.getPrice())
			return this.getName().compareTo(b.getName());
			else
				if(this.getPrice()<b.getPrice())
					return -1;
				else
					return 1;
	}
}
