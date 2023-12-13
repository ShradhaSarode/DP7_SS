package com.service;

import java.util.Scanner;

import com.consoleBase.Account;
import com.consoleBase.User;
import com.exception.AccountNotFoundException;
import com.exception.IncorrectAmountException;
import com.exception.InsufficientBalanceException;
import com.exception.InvalidUserException;
import com.repository.AccountRepository;
import com.repository.UserRepository;

public class UserService 
{
	static Scanner sc = new Scanner(System.in);
	public static long loginAccNo = 0;

	static void register() {
		User user = new User();
		System.out.println("Enter the Account no: ");
		long accNo = sc.nextLong();
		System.out.println("Enter the name: ");
		user.setUserName(sc.next());
		System.out.println("Enter adhar card no: ");
		user.setAadharNum(sc.nextLong());
		System.out.println("Enter pan card no: ");
		user.setPanCardNum(sc.next());
		System.out.println("Enter email id: ");
		user.setEmail(sc.next());
		System.out.println("Enter phone no: ");
		user.setPhoneNum(sc.nextLong());
		sc.nextLine();
		System.out.println("Enter the address: ");
		user.setAddress(sc.nextLine());

		UserRepository.addUser(accNo, user);
		AccountRepository.addAcount(accNo, new Account());
//		System.out.println(user);
	}

	static User login() {

		System.out.println("Enter Account no: ");
		long accNo = sc.nextLong();
		System.out.println("Enter the passowrd: ");
		String password = sc.next();

		User user = UserRepository.login(accNo, password);
		if (user != null) {
			loginAccNo = accNo;
			return user;
		} else {
			throw new InvalidUserException("Invalid credentials");
		}
	}

	static void showUserMenu() {
		int choice = 0;
		while (choice != 6) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("1. Add Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Check Balance");
			System.out.println("5. Transfer");
			System.out.println("6. Logout");
			System.out.println("-------------------------------------------------------------");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				AccountService.addAccount();
				System.out.println("Account added..");
				break;
			case 2:
				System.out.println("Deposit amount: ");
				long amount = sc.nextLong();

				try {
					AccountService.deposit(UserService.loginAccNo, amount);
				} catch (AccountNotFoundException | IncorrectAmountException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("Withdraw amount: ");
				long amt = sc.nextLong();
				try {
					AccountService.withdraw(UserService.loginAccNo, amt);
				} catch (AccountNotFoundException | InsufficientBalanceException | IncorrectAmountException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				AccountService.checkBalance(UserService.loginAccNo);
				break;
			case 5:
				System.out.println("Enter to account no: ");
				long toAccountNo = sc.nextLong();

				System.out.println("Transfer amount: ");
				long transferAmount = sc.nextLong();
				try {
					AccountService.transfer(UserService.loginAccNo, toAccountNo, transferAmount);
				} catch (AccountNotFoundException | InsufficientBalanceException | IncorrectAmountException e) {
					System.out.println(e.getMessage());
				}
				break;

			default:
				break;
			}
		}
	}

}
