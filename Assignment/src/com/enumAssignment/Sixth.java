package com.enumAssignment;
//6.	Use enums in switch statement

 enum Seasons {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER
}
public class Sixth 
{
	public static void main(String[] args) {
   
        Seasons currentSeason = Seasons.SUMMER;

        switch (currentSeason) {
            case SPRING:
                System.out.println("It's springtime!");
                break;
            case SUMMER:
                System.out.println("Welcome to summer!");
                break;
            case AUTUMN:
                System.out.println("Autumn is here!");
                break;
            case WINTER:
                System.out.println("Winter is coming!");
                break;
            default:
                System.out.println("Unknown season");
        }
    }
}
