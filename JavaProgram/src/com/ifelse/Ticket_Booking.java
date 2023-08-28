/*
 Discount = Original Price × Discount Percentage

Let's use your example of a 10% discount on a salary of $10,000:

Discount Percentage = 10% = 0.10
Original Price = $10,000

Now, plug these values into the formula:

Discount = $10,000 × 0.10 = $1,000
 */
package com.ifelse;

import java.util.*;

public class Ticket_Booking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		{
			Date dt=new Date();
			System.out.println("Enter the name_of_Airline :");
			String name_of_Airline = sc.next();
			System.out.println("Enter the name_of_Passanger :");
			String name_of_Passanger = sc.next();
			System.out.println("Enter the depart_place :");
			String depart_place = sc.next();
			System.out.println("Enter the destination_place :");
			String destination_place = sc.next();
			System.out.println("Enter the coupon_code if you have:");
			int coupon_code = sc.nextInt();
			double Ticket_price = 135000;

			if (coupon_code == 99701) {
				System.out.println("We are providing you 10% discount on your ticket");
				double Discount = Ticket_price * 0.10;
				System.out.println("Your discount ticket price is:" + Discount);
				Ticket_price = Ticket_price - Discount;
				System.out.println("Your final ticket price is:" + Ticket_price);
			} else {
				System.out.println("no such coupan code is available");
				System.out.println("Your final ticket price is:" + Ticket_price);
			}
			System.out.println("Your ticket is booked...Enjoy your holiday!!!!!!!!!!!!");
			
			System.out.println("Name_of_Airline: " + name_of_Airline+"\n"
					+ " name_of_Passanger: " +name_of_Passanger+"\n"
					+ " depart_place :"+ depart_place+"\n"
					+ " destination_place:" + destination_place+"\n"
					+"On Date:"+dt);
		}
		sc.close();
	}
}