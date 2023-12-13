package com.enumAssignment;
//7.	Create public constructors in enum. And try to create object of enum with new keyword in main method.

enum Seasons1 {
    SPRING("Mild"),
    SUMMER("Hot"),
    AUTUMN("Cool"),
    WINTER("Cold");

    private String description;

    private Seasons1(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
public class Seven
{
	public static void main(String[] args) {
  
        System.out.println("Description of SPRING: " + Seasons1.SPRING.getDescription());
        System.out.println("Description of SUMMER: " + Seasons1.SUMMER.getDescription());
        System.out.println("Description of AUTUMN: " + Seasons1.AUTUMN.getDescription());
        System.out.println("Description of WINTER: " + Seasons1.WINTER.getDescription());
    }
}
