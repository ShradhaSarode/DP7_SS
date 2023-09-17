package com.labInheritance;
class Animal
{
	private String species;
	private int legs;
	private String aType;
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public String getaType() {
		return aType;
	}
	public void setaType(String aType) {
		this.aType = aType;
	}
	 Animal()
	 {
		 
	 }
     Animal(String species, int legs, String aType)
     {
		super();
		this.species = species;
		this.legs = legs;
		this.aType = aType;
	}

	public String toString()
	{
		return "Animal species:" + species+"\n"
				+ "legs=" + legs+"\n"
				+ "aType=" + aType +"\n";
	}
	
}
class Dog extends Animal
{
	private String domastic;
	private String dType;
	Dog()
	{
		
	}
	 Dog(String domastic, String dType)
	 {
		super();
		this.domastic = domastic;
		this.dType = dType;
	}
	public String getDomastic() {
		return domastic;
	}
	public void setDomastic(String domastic) {
		this.domastic = domastic;
	}
	public String getdType() {
		return dType;
	}
	public void setdType(String dType) {
		this.dType = dType;
	}
	@Override
	public String toString() {
		return "Dog domastic:" + domastic+"\n"
				+ "Type=" + dType +"\n";
	}
	
}
public class SingleLevel
{

	public static void main(String[] args)
	{
		

	}

}
