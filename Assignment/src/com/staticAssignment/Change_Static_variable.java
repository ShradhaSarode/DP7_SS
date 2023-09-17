package com.staticAssignment;
//3.Create two object of Car class and change value of static variable by 1st object and print it by accessing 2nd object.
public class Change_Static_variable
{
	private String model;
    private static int totalCarSold = 0;

    public Change_Static_variable(String model) {
        this.model = model;
        totalCarSold++;
    }

    public String getModel() {
        return model;
    }

    public static int getTotalCarSold() {
        return totalCarSold;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota Camry");
        Car car2 = new Car("Honda Civic");

        System.out.println("Car 1 Model: " + car1.getModel());
        System.out.println("Car 2 Model: " + car2.getModel());

        // Change the value of totalCarSold using the first object (car1)
        Change_Static_variable.totalCarSold = 10;

        // Access and print the updated value of totalCarSold using the second object (car2)
        System.out.println("Updated Total Cars Sold (via car2): " + Change_Static_variable.getTotalCarSold());
    }

}
