package com.inheritanceAssignment;
class ElectricVehicle
{
	String name;
	String model;
	ElectricVehicle()
	{
		
	}
	ElectricVehicle(String name, String model)
	{
        this.name = name;
        this.model = model;
    }
    void displayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
    }
}
class ElectricScooty extends ElectricVehicle
{
	int batteryCapacity;
	int year;
	ElectricScooty()
	{
		
	}
	ElectricScooty(String name, String model,int batteryCapacity,int year)
	{
		super( name, model);
		this.batteryCapacity=batteryCapacity;
		this.year=year;
	}
	void displayInfo()
    {
		super.displayInfo();
        System.out.println("BatteryCapacity 1 charge : " + batteryCapacity);
        System.out.println("Year: " + year);
    }
}
class RentalTransaction extends ElectricScooty
{
	float rent;
	String lisence;
	RentalTransaction()
	{
		
	}
	RentalTransaction(String name, String model,int batteryCapacity,int year,float rent,String lisence)
	{
		super( name, model,batteryCapacity, year);
		this.rent=rent;
		this.lisence=lisence;
	}
	void displayInfo()
    {
		super.displayInfo();
        System.out.println("Rent of scooty: " + rent);
        System.out.println("Lisence: " + lisence);
    }
}
public class Multilevel2
{
	public static void main(String[] args)
	{
		RentalTransaction r1=new RentalTransaction("Ather Energy","Ather 450X",200,2021,4500f,"HBY253541P");
		r1.displayInfo();
	}

}
