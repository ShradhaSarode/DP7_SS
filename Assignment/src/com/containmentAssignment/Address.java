package com.containmentAssignment;

public class Address
{
	private String city;
	private String state;
	private String country;
	//private Person p;
	Address()
	{
		
	}
	public Address(String city, String state, String country, Person p) 
	{
		this.city = city;
		this.state = state;
		this.country = country;
		//this.p = p;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
//	public Person getP() {
//		return p;
//	}
//	public void setP(Person p) {
//		this.p = p;
//	}

}
