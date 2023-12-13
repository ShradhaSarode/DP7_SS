package com.consoleBase;

import java.util.Date;

public class Transaction
{
	private String transactionType;
	private long accountNum;
	private Date transactiondate;
	private String status;
	private long transactionAmount;
	public Transaction() {
		super();
		
	}
	public Transaction(String transactionType, long accountNum, Date transactiondate, String status,
			long transactionAmount) {
		super();
		this.transactionType = transactionType;
		this.accountNum = accountNum;
		this.transactiondate = transactiondate;
		this.status = status;
		this.transactionAmount = transactionAmount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}
	public Date getTransactiondate() {
		return transactiondate;
	}
	public void setTransactiondate(Date transactiondate) {
		this.transactiondate = transactiondate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(long transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	@Override
	public String toString() {
		return "[transactionType=" + transactionType + ", accountNum=" + accountNum + ", transactiondate="
				+ transactiondate + ", status=" + status + ", transactionAmount=" + transactionAmount + "]";
	}
}
