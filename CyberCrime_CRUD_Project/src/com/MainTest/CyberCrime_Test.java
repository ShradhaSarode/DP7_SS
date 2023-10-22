package com.MainTest;

import java.util.Scanner;

import com.InterfaceMethod.CyberCrime_Interface_Method;
import com.MethodImplementation.CyberCrime_Implementation;

class CyberCrime_Test
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		int choice;
		CyberCrime_Interface_Method cCrime=new CyberCrime_Implementation();
		
		do
		{
			System.out.println("Cyber Crime Office!!!!!");
			System.out.println("1 Add CyberCrime");
			System.out.println("2 Show CyberCrime");
			System.out.println("3 Update CyberCrime");
			System.out.println("4 Delete CyberCrime");
			System.out.println("5 Search CyberCrime by Section");
			System.out.println("6 Exit");
			
			System.out.println("----------------------------------------------------------");
			
			System.out.println("Enter ur choice:");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				cCrime.addCrime();
				break;
			case 2:
				cCrime.showCrime();
				break;
			case 3:
				cCrime.updateCrime();
				break;	
			case 4:
				cCrime.deleteCrime();
				break;
			case 5:
				cCrime.searchCrime();
				break;	
			case 6:
				System.exit(0);
				//System.out.println("Exit!!!!");
			}			
		}while(true);
	}
}
