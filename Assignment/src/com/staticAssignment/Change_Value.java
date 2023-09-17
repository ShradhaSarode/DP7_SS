//2.	Change the value of variable by class name then Print it.
package com.staticAssignment;

public class Change_Value
{
	private String model;
	private static int totalCarSold=0;
	
	Change_Value(String model)
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
	        
	        Change_Value.totalCarSold = 10;
	        System.out.println("Updated Total Cars Sold: " + Change_Value.getTotalCarSold());
	}
}
