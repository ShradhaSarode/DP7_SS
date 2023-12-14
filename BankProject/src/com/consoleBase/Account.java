package com.consoleBase;

import java.util.Date;

public class Account
{
	private long accountNum;
	private String accountType;
	private long balance;
	private String status;
	private String creationDate;
	public Account() {
		super();
		
	}
	public Account(long accountNum, String accountType, long balance, String status, String creationDate) {
		super();
		this.accountNum = accountNum;
		this.accountType = accountType;
		this.balance = balance;
		this.status = status;
		this.creationDate = creationDate;
	}
	public long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	@Override
	public String toString() {
		return "[accountNum=" + accountNum + ", accountType=" + accountType + ", balance=" + balance
				+ ", status=" + status + ", creationDate=" + creationDate + "]";
	}
}
