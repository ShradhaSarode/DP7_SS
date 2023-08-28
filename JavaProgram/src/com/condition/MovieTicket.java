package com.condition;

import java.util.Date;
import java.util.Scanner;

public class MovieTicket {
	public static void main(String[] args)
	{
	Scanner mt=new Scanner(System.in);
	Date dt=new Date();
	System.out.println("Enter the name of movie :");
	String name_of_movie = mt.next();
	System.out.println("Enter the rating_of_movie :");
	String rating_of_movie =mt.next();
	System.out.println("Enter price_of_ticket:");
	int price_of_ticket=mt.nextInt();
	System.out.println("Enter the coupon_code :");
	int coupon_code = mt.nextInt();
	System.out.println("Press 0 for Silver and 1 for gold:");
	if(coupon_code==0)
	{
		System.out.println("50 rs off");
		System.out.println("Your Ticket is booked at Price:"
                +(price_of_ticket=price_of_ticket-50)
                +"Enjoy your movie!!!!!!!!!");
	}
	else if(coupon_code==1)
	{
		System.out.println("100 rs off");
		System.out.println("Your Ticket is booked at Price:"
                +(price_of_ticket=price_of_ticket-100)
                +"Enjoy your movie!!!!!!!!!");
	}
	else
	{
		System.out.println("Price of ticket:"+price_of_ticket);
	}
	
	System.out.println("Name_of_movie: " + name_of_movie+"\n"
			+ " rating_of_movie: " +rating_of_movie+"\n"
			+ " price_of_ticket :"+ price_of_ticket+"\n"
			+"On Date:"+dt);
	mt.close();
}
	}

