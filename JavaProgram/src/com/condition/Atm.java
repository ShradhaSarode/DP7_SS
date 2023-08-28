package com.condition;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args)
	{
		Scanner at=new Scanner(System.in);
		System.out.print("Welcome to SBI ATM\n");
		System.out.println("Enter"
		                   +" 1.Deposit"
				           + "2.Withdrow"
		                   +"Avl_balance");
		int choice=at.nextInt();
		double Avl_balance=150000;
		System.out.print("Enter your pin:");
		int pin1 = at.nextInt();
		if(pin1==7412)
		{
			if(choice==1)
			{
			System.out.print("Enter amount to deposit:");
			double amount_of_deposit=at.nextDouble();
			
			Avl_balance=Avl_balance+amount_of_deposit;
			System.out.println("After deposit total amount is:"
			                   +Avl_balance);
			}
			else if(choice==2)
			{
				System.out.println("Enter amount_of_withdrow");
				double amount_of_withdrow=at.nextDouble();
				Avl_balance=Avl_balance-amount_of_withdrow;
				System.out.println("After deposit total amount is:"
				                   +Avl_balance);
				}
			}
		else if(choice==3)
		{
			System.out.println("Available Balance is: "
		                       +Avl_balance);
		}
		
		else
		{
			System.out.print("you enter wrong pin");
		}
		
	
		at.close();

}
}