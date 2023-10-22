package com.enumDemo;

public enum MovieSeats
{
	STANDERED(300),PRIMIUM(450),RECLINER(600);
	int price;
	private MovieSeats(int price)
	{
		this.price=price;
	}
}
