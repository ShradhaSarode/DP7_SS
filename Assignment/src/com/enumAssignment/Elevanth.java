//package com.enumAssignment;
////11.	Try to extend a class in enum.
//
//interface Description {
//    String getDescription();
//}
//
//    public void display() {
//        System.out.println("Displaying from BaseClass");
//    }
//}
//
//// Define the Seasons enum implementing the Description interface
// enum Seasons5 implements Description {
//    SPRING("Mild"),
//    SUMMER("Hot"),
//    AUTUMN("Cool"),
//    WINTER("Cold");
//
//    private String description;
//
//    private Seasons5(String description) {
//        this.description = description;
//    }
//
// // Getter method for the instance variable
////    public String getDescription() {
////        return description;
////    }
//    @Override
//    public String getDescription() {
//        return description;
//    }
//}
//public class Elevanth
//{
//	public static void main(String[] args) {
// 
//        for (Seasons5 season : Seasons5.values()) {
//            System.out.println("Description of " + season.name() + ": " + season.getDescription());
//        }
//    }
//}
