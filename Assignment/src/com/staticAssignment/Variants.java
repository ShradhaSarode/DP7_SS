package com.staticAssignment;
/*
 4.Check following variations:
a.	Static variable and Non-Static (Instance Variable) – Just declare and print it.
b.	See if you can access static variable in static method
c.	non static variable in static method
d.	then static variable in non-static method
e.	non static variable in non-static method Note: non static means instance variable
 */
public class Variants
{
	// Static variable
    private static int totalCarSoldStatic = 0;
    // Non-static (Instance) variable
    private int totalCarSoldInstance = 0;

    public Variants()
    {
        totalCarSoldStatic++;
        totalCarSoldInstance++;
    }

    public void nonStaticMethod()
    {
        // Access static variable in a non-static method
        System.out.println("Accessing static variable in non-static method: " + totalCarSoldStatic);
        // Access non-static (instance) variable in a non-static method
        System.out.println("Accessing non-static variable in non-static method: " + totalCarSoldInstance);
    }

    public static void staticMethod()
    {
        // Access static variable in a static method
    	
        System.out.println("Accessing static variable in static method: " + totalCarSoldStatic);
       
        // System.out.println("Accessing non-static variable in static method: " + totalCarSoldInstance);
    }

    public static void main(String[] args) {
        // Declare and print static variable
        System.out.println("Static variable: " + totalCarSoldStatic);

        // Declare and print non-static (instance) variable
        Variants car1 = new Variants();
        System.out.println("Non-static (instance) variable: " + car1.totalCarSoldInstance);

        // Access static variable in static method
        staticMethod();

        // Access non-static variable in non-static method
        car1.nonStaticMethod();
    }

}
