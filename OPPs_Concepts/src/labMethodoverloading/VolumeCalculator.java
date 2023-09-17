/*
Volume calculator- Over Loading
Sarah got confused to calculate volume of cylinder and cuboid. Write a Java application to help Sarah to do this.
Create a class called VolumeCalculator that has the following methods
double calculateVolume(double radius,double height)
This method calculates the volume of the cylinder using the formula 3.14*radius*radius*height
double calculateVolume(int length,int breadth,int height)
This method calculates the volume of the cuboid using the formula length*breadth*height
Write a TestMain class to test the application. 
 */
package labMethodoverloading;

import java.util.Scanner;

class Volume
{
	double calculateVolume(double radius,double height)
	{
		return 3.14*radius*height;
	}
	double calculateVolume(double length,double breadth,double height)
	{
		return length*breadth* height;
		
	}
	
}
public class VolumeCalculator
{
	public static void main(String[] args)
	{
		Volume v1=new Volume();
		System.out.println("enter your choice 1 or 0:");
		System.out.println("1.find volume of cylinder:");
		System.out.println("0.find volume of cuboid:");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("enter the lenght of cylinder:");
			double length=sc.nextDouble();
			
			System.out.println("enter the height of cylinder:");
			double height=sc.nextDouble();
			
			System.out.println(" volume of cylinder:"+v1.calculateVolume(length,height ));
			
		}
		else if(choice==0)
		{
			System.out.println("enter the radius of cuboid:");
			double radius=sc.nextDouble();
			
			System.out.println("enter the  breadth of cuboid:");
			double breadth=sc.nextDouble();
			
			System.out.println("enter the height of cuboid:");
			double height=sc.nextDouble();
			
			System.out.println(" volume of cuboid:"+v1.calculateVolume(radius,breadth,height ));
			
		}
				
	sc.close();
	}
}

