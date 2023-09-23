package com.containmentAssignment;
/*
 3. Create class Person which has attributes (name, gender, age, Address).
Address is class which has attributes (city, state, country). Display Persons
data
Note. Containment using constructor and getter/setter

 */
public class Person
{
	private String name;
	private char gender;
	private int age;
	private Address a;
	
	Person()
	{
		
	}
	 Person(String name, char gender, int age, Address a)
	 {	
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getA() {
		return a;
	}
	public void setA(Address a) {
		this.a = a;
	}
	public static void main(String[] args)
	{
		Person p1=new Person();
		Address a1=new Address();
		p1.setName("Shradha sarode");
		p1.setGender('f');
		p1.setAge(26);
		
		p1.setA(a1);
		
		p1.getA().setCity("Nanded");
		p1.getA().setState("Maharashtra");
		p1.getA().setCountry("India");
		
		System.out.println("Person name:"+p1.getName()+"\n"
				                    +"Gender:"+p1.getGender()+"\n"
				                   +"Age:" +p1.getAge()+"\n"
				                    +"Address City:"+p1.getA().getCity()+"\n"
				                    +"State:"+p1.getA().getState()+"\n"
				                    +"Country:"+p1.getA().getCountry()+"\n");
	}	
}
