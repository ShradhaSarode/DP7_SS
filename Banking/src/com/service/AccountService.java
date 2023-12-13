package com.service;

import java.util.Scanner;

import com.consoleBase.Account;
import com.repository.AccountRepository;

public class AccountService {

	static void addAccount() {
		Account account = new Account();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account no: ");
		account.setAccountNum(sc.nextLong());
		System.out.println("Enter account type: ");
		account.setAccountType(sc.next());
		System.out.println("Enter balance: ");
		account.setBalance(sc.nextLong());
		System.out.println("Enter status: ");
		account.setStatus(sc.next());
		System.out.println("Enter date: ");
		account.setCreationDate(sc.next());

		AccountRepository.addAcount(account.getAccountNum(), account);
	}

	static void deposit(long accountNo, long amount) {
		AccountRepository.deposit(accountNo, amount);
	}

	static void withdraw(long accountNo, long amount) {
		AccountRepository.withdraw(accountNo, amount);
	}

	static void checkBalance(long accountNo) {
		AccountRepository.checkBalance(accountNo);
	}

	static void transfer(long fromAccountNo, long toAccountNo, long amount) {
		AccountRepository.transfer(fromAccountNo, toAccountNo, amount);
	}
}