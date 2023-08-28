package com.switchstatements;

import java.util.Scanner;

public class Atm_Option {
	public static void main(String[] args) {
		Scanner at = new Scanner(System.in);
		System.out.print("Welcome to SBI ATM\n");
		System.out.println("Enter" + " 1.Deposit\n" + "2.Withdrow\n" + "Avl_balance\n");
		int choice = at.nextInt();
		double Avl_balance = 150000;
		System.out.print("Enter your pin:");
		int pin1 = at.nextInt();
		System.out.println("Select any option");
		int option = at.nextInt();
		if (pin1 == 7412) {

			switch (option) {

			case 1:

				System.out.print("Enter amount to deposit:");
				double amount_of_deposit = at.nextDouble();

				Avl_balance = Avl_balance + amount_of_deposit;
				System.out.println("After deposit total amount is:" + Avl_balance);
				break;
			case 2:

				System.out.println("Enter amount_of_withdrow");
				double amount_of_withdrow = at.nextDouble();
				Avl_balance = Avl_balance - amount_of_withdrow;
				System.out.println("After deposit total amount is:" + Avl_balance);

				break;
			case 3:

				System.out.println("Available Balance is: " + Avl_balance);

				break;
			default:

				System.out.print("Invalid option");

				at.close();
			}

		} else {
			System.out.println("Wrong pin");
		}
	}
}
