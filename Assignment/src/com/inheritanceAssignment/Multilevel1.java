package com.inheritanceAssignment;

class ElectronicDevice
{
	String brand;
    String model;
    ElectronicDevice()
    {
    	
    }
    ElectronicDevice(String brand,String model)
    {
    	this.brand=brand;
    	this.model=model;
    }
    void displayInfo()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}
class Phone extends ElectronicDevice
{
	int storage;
	Phone()
	{
		
	}
	Phone(String brand, String model, int storage)
	{
        super(brand, model);
        this.storage = storage;
    }

    void displayInfo()
    {
        super.displayInfo();
        System.out.println("Storage: " + storage + "GB");
    }
    void makeCall(String number)
    {
        System.out.println("Calling " + number);
    }
}
class Smartphone extends Phone
{
	String os;
	Smartphone()
	{
		
	}
	Smartphone(String brand, String model, int storage, String os)
	{
        super(brand, model, storage);
        this.os = os;
    }
    void displayInfo()
    {
        super.displayInfo();
        System.out.println("Operating System: " + os);
    }
    void installApp(String appName)
    {
        System.out.println("Installing " + appName + " app.");
    }
}
public class Multilevel1
{
	public static void main(String[] args)
	{
		Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21", 128, "Android");
        smartphone.displayInfo();
        smartphone.makeCall("123-456-7890");
        smartphone.installApp("WhatsApp");
    }
}