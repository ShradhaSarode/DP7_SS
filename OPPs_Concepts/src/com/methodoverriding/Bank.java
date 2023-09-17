package com.methodoverriding;

public class Bank {

	public static void main(String[] args) {
		Account a1= new Account(1011,"ss",1000,0);
		System.out.println(a1.getAccNo()+"  "+a1.getBalance());

	}

}
