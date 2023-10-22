package com.enumDemo;

import java.util.Scanner;

public class TicketBooking {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("choose the ticket type:");
		System.out.println("1.standart");
		System.out.println("2.permium");
		System.out.println("3.recliner");
		
		int seatType=sc.nextInt();
		System.out.println("enter num of seats: ");
		int num =sc.nextInt();
		MovieSeats ms=null;
		switch(seatType)
		{
		case 1:ms=MovieSeats.STANDERED;
		break;
		case 2: ms=MovieSeats.PRIMIUM;
		break;
		case 3: ms=MovieSeats.RECLINER;
		break;
		default:System.out.println("error");
		}
		System.out.println("ticket type: "+ms);
		System.out.println("num of ticket: "+num);
		System.out.println("total amount: "+(num*(ms.price)));
		sc.close();
	}

}
