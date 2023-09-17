//Create a class Car with String model and int total Car Sold as static variable in main() method
package com.staticAssignment;

public class Car
{
	private String model;
	private static int totalCarSold=0;
	
	Car(String model)
	{
        this.model = model;
        totalCarSold++;
    }
    public String getModel()
    {
        return model;
    }
    public static int getTotalCarSold()
    {
        return totalCarSold;
    }
	public static void main(String[] args)
	{
		    Car c1 = new Car("Toyota Camry");
	        Car c2 = new Car("Honda Civic");
	        Car c3 = new Car("Ford Mustang");

	        System.out.println("Car 1 Model: " + c1.getModel());
	        System.out.println("Car 2 Model: " + c2.getModel());
	        System.out.println("Car 3 Model: " + c3.getModel());
	        System.out.println("Total Cars Sold: " + Car.getTotalCarSold());
	}

}
