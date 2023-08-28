package com.ifelse;

import java.util.Scanner;

public class Speed {
	public static void main(String[] args)
	{
		Scanner mc=new Scanner(System.in);
		System.out.println("Enter the distance in km :");
		double distance = mc.nextDouble();
		System.out.println("Enter the time in hour :");
		double time = mc.nextDouble();
		double speed=distance/time;
	System.out.println("The speed is:"+speed+"km/hr");
	mc.close();
	}

}
