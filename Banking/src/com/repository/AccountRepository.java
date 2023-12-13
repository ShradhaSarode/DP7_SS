package com.repository;

import java.util.HashMap;

import com.consoleBase.Account;
import com.exception.AccountNotFoundException;
import com.exception.IncorrectAmountException;
import com.exception.InsufficientBalanceException;


public class AccountRepository {

	private static HashMap<Long, Account> accountMap = new HashMap<>();

	public static void addAcount(long accountNo, Account account) {
		accountMap.put(accountNo, account);
	}

	public static void deposit(long accountNo, long amount) {
		if (amount <= 0)
			throw new IncorrectAmountException("Invalid amount : " + amount);

		if (accountMap.containsKey(accountNo)) {
			Account account = accountMap.get(accountNo);
			account.setBalance(account.getBalance() + amount);
			System.out.println("Amount deposited to account : " + accountNo);
		} else {
			throw new AccountNotFoundException(accountNo + " not found.");
		}
	}

	public static void withdraw(long accountNo, long amount) {
		if (amount <= 0)
			throw new IncorrectAmountException("Invalid amount : " + amount);

		if (accountMap.containsKey(accountNo)) {
			Account account = accountMap.get(accountNo);
			if (amount <= account.getBalance()) {
				account.setBalance(account.getBalance() - amount);
				System.out.println("Amount withdrew from account : " + accountNo);
			} else {
				throw new InsufficientBalanceException("Insufficient balance for : " + accountNo);
			}
		} else {
			throw new AccountNotFoundException(accountNo + " not found.");
		}
	}

	public static void checkBalance(long accountNo) {
		if (accountMap.containsKey(accountNo)) {
			Account account = accountMap.get(accountNo);
			System.out.println("Balance for " + accountNo + " : " + account.getBalance());
		} else {
			throw new AccountNotFoundException(accountNo + " not found.");
		}
	}

	public static void transfer(long fromAccountNo, long toAccountNo, long amount) {
		if (amount <= 0)
			throw new IncorrectAmountException("Invalid amount : " + amount);

		if (accountMap.containsKey(fromAccountNo) && accountMap.containsKey(toAccountNo)) {

			Account fromAccount = accountMap.get(fromAccountNo);
			Account toAccount = accountMap.get(toAccountNo);

			if (amount <= fromAccount.getBalance()) {
				fromAccount.setBalance(fromAccount.getBalance() - amount);
				toAccount.setBalance(toAccount.getBalance() + amount);
				System.out.println("Amount transfered from " + fromAccountNo + " to " + toAccountNo);
			} else {
				throw new InsufficientBalanceException("Insufficient balance for : " + fromAccountNo);
			}

		} else {
			throw new AccountNotFoundException("Account not found.");
		}
	}
}
