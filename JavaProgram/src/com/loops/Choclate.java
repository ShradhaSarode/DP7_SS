package com.loops;

import java.util.Scanner;

public class Choclate {
	public static void main(String [] args)
	{
		Scanner cw=new Scanner(System.in);
		System.out.println("Enter how many repees you have:");
		int rupee=cw.nextInt();
		int chocolate=rupee;
		int wrappers = chocolate;
        int exchangedChocolates = 0;
        for(;chocolate>=3;chocolate++)
        {
        	int exchanged = wrappers / 3; 
            exchangedChocolates += exchanged; 
            wrappers = exchanged + wrappers % 3;
            System.out.println("Initially bought: " + chocolate + " chocolates");
            System.out.println("Chocolates obtained through exchange: " + exchangedChocolates);
            System.out.println("Remaining wrappers: " + wrappers);
            System.out.println("Total chocolates: " + (chocolate + exchangedChocolates));
            break;
        }
		
		cw.close();
	}

}
