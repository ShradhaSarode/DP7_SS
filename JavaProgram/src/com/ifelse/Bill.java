package com.ifelse;

import java.util.Scanner;

public class Bill {
	public static void main(String[] args) {
		Scanner mc=new Scanner(System.in);
		System.out.println("Enter the number of shirt bought :");
		int shirt = mc.nextInt();
		System.out.println("Enter the number of pant bought :");
		int pant = mc.nextInt();
		System.out.println("Enter the number of t_shirt bought :");
		int t_shirt = mc.nextInt();
		
	   System.out.println("BillDetails:");
       System.out.println("Number of shirt:"+ shirt);
       System.out.println("Number of pant :" +pant);
       System.out.println("Number of t_shirt:"+ t_shirt);
       System.out.println("Total Price= :"+((shirt*100)+(pant*2000)+(t_shirt*500)));
	mc.close();
	}

}
