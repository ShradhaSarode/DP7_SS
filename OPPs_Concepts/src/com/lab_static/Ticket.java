/*
 Ticket Price Calculation - Static
Ticket Calculation Create a class Ticket with the following private variables
int ticketid;int price;static int availableTickets;//25
Include getters and setters methods in the Ticket class.
AvailableTickets should hold only positive value. Zero and negative values are not allowed.
(This logic should be checked inside the corresponding setter method)
Write the following method in the Ticket class:
public int calculateTicketCost(int nooftickets)  this method should check the ticket availability, 
If the tickets are available, reduce the nooftickets from availableTickets and calculate the total amount as nooftickets*price  
and return the total amount.  If the tickets are not available, this method should return -1.
Write a main method in the Main class to test the application.
Sample input and output.Enter no of bookings:2.Enter the available tickets:25
Enter the ticketid:123.Enter the price:100.Enter the no of tickets:5.Available tickets: 25.Total amount:500
Available ticket after booking:20Enter the ticketid:124.Enter the price:100.Enter the no of tickets:2,Available tickets: 20,
Total amount:200,Available ticket after booking:18
 */
package com.lab_static;

import java.util.Scanner;

 class Ticket1
{
	private int ticketid;
    private int price;
    private static int availableTickets = 25;

    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getAvailableTickets() {
        return availableTickets;
    }

    public static void setAvailableTickets(int availableTickets) {
        if (availableTickets >= 0) {
            Ticket1.availableTickets = availableTickets;
        }
    }

    public int calculateTicketCost(int nooftickets) {
        if (nooftickets > 0 && nooftickets <= availableTickets) {
            availableTickets -= nooftickets;
            return nooftickets * price;
        } else {
            return -1;
        }
    }
}

public class Ticket {
    public static void main(String[] args)
    {
    	Ticket1 t1=new Ticket1();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter no of bookings: ");
        int numBookings = scanner.nextInt();

//        System.out.print("Enter the available tickets: ");
//        int availableTickets = scanner.nextInt();
//        Ticket1.setAvailableTickets(availableTickets);

        for (int i = 0; i < numBookings; i++)
        {
           // Ticket1 ticket = new Ticket1();

            System.out.print("Enter the ticketid: ");
            int ticketId = scanner.nextInt();
           // ticket.setTicketid(ticketId);
            t1.setTicketid(ticketId);

            System.out.print("Enter the price: ");
            int ticketPrice = scanner.nextInt();
           //ticket.setPrice(ticketPrice);
            t1.setPrice(ticketPrice);
            

//            System.out.print("Enter the no of tickets: ");
//            int numTickets = scanner.nextInt();

          //  int totalAmount = t1.calculateTicketCost(numTickets);
            
            int totalAmount = t1.calculateTicketCost(numBookings);
            if (totalAmount != -1)
            {
                System.out.println("Available tickets: " + Ticket1.getAvailableTickets());
                System.out.println("Total amount: " + totalAmount);
                System.out.println("Available tickets after booking: " + Ticket1.getAvailableTickets());
            } 
            else
            {
                System.out.println("Tickets not available.");
            }
        }

        scanner.close();
    }
}
