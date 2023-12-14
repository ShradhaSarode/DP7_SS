package com.consoleBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TransactionCrud
{
	static Connection con = null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	static Scanner sc = new Scanner(System.in);

	public TransactionCrud() {
		con = DBConnect.getConnect();
//		System.out.println("Connection done.....");
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public void fetchTransactionDetails() {
		try {
			rs = st.executeQuery("select * from Transaction");

			System.out.println("--------------Transaction---------------------");
			while (rs.next()) {
				System.out.println("transactionType: " + rs.getString(1) +
						" accountNum: " + rs.getLong(2) +
						" transactiondate: "+ rs.getDate(3) +
						" status: " + rs.getString(4) +
						" transactionAmount: " + rs.getLong(5));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public boolean searchTransactionByaccountNum(long accountNum) {
		boolean isFound = false;
		try {
			pst = con.prepareStatement("select * from Transaction where accountNum=?");
			pst.setLong(1, accountNum);
			rs = pst.executeQuery();
			while (rs.next()) {
				isFound = true;
				System.out.println("transactionType: " + rs.getString(1) +
						"\naccountNum: " + rs.getLong(2) +
						"\ntransactiondate: "+ rs.getDate(3) +
						"\nstatus: " + rs.getString(4) +
						"\ntransactionAmount: " + rs.getLong(5));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return isFound;
	}
	
	public void insertTransactionDetails() {
		System.out.println("Enter transactionType: ");
		String transactionType = sc.next();
		System.out.println("Enter  accountNum: ");
		long accountNum = sc.nextLong();
		System.out.println("Enter transactiondate: ");
		String transactiondate = sc.next();
		System.out.println("Enter Transaction status: ");
		String status = sc.next();
		System.out.println("Enter transactionAmount: ");
		long transactionAmount = sc.nextLong();
		
		

		try {
			pst = con.prepareStatement("insert into Transaction values(?,?,?,?,?)");
			
			pst.setString(1, transactionType);
			pst.setLong(2, accountNum);
			pst.setString(3, transactiondate);
			pst.setString(4, status);
			pst.setLong(5, transactionAmount);

			int noOfRowsInserted = pst.executeUpdate();
			if (noOfRowsInserted > 0) {
				System.out.println("Transaction Details added....");
			} else {
				System.out.println("error in TransactionDetail....");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void deleteTransactionDetails() {
		System.out.println("enter the accountNum to be deleted:");
		long accountNum = sc.nextLong();
		try {
			pst = con.prepareStatement("delete from Transaction where accountNum=?");
			pst.setLong(1, accountNum);
			int noOfRowsDeleted = pst.executeUpdate();
			if (noOfRowsDeleted > 0) {
				System.out.println("accountNum " + accountNum + " is deleted");
				fetchTransactionDetails();
			} else {
				System.out.println("error in deleting transaction....");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void updateTransactionStatus() {
		System.out.println("Enter accountNum for TransactionStatus updation: ");
		long accountNum = sc.nextLong();
		if (searchTransactionByaccountNum(accountNum)) {
			System.out.println("Enter the new status: ");
			String status = sc.next();
			try {
				pst = con.prepareStatement("update Transaction set transactionStatus=? where accountNum=?");
				pst.setString(1, status);
				pst.setLong(2, accountNum);
				int noOfRowsupdated = pst.executeUpdate();
				if (noOfRowsupdated > 0) {
					System.out.println("status updated...");
					searchTransactionByaccountNum(accountNum);
				} else {
					System.out.println("Error in updating status....");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		} else {
			System.out.println("Transaction " + accountNum + " not found...");
		}
	}
	
	public static void main(String[] args)
	{
		TransactionCrud f1 = new TransactionCrud();

		int choice;
		char ch;
		do {
			System.out.println("=========================================================");
			System.out.println("1. Add new Transaction");
			System.out.println("2. Delete Transaction");
			System.out.println("3. Update Transaction");
			System.out.println("4. View all Transaction");
			System.out.println("5. View Transaction By accountNum");
			System.out.println("6. Exit");

			System.out.println("Enter your choice:");
			System.out.println("---------------------------------------------------");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				f1.insertTransactionDetails();
				break;
			case 2:
				f1.deleteTransactionDetails();
				break;
			case 3:
				f1.updateTransactionStatus();
				break;
			case 4:
				f1.fetchTransactionDetails();
				break;
			case 5:
				System.out.println("Enter the accountNum to be searched:");
				long accountNum = sc.nextLong();
				f1.searchTransactionByaccountNum(accountNum);
				break;
			case 6:
				System.out.println("------------Closing the Transaction application---------------");
				System.exit(0);
				break;

			default:
				System.out.println("Wrong input");
			}
			System.out.println("Do you want perform more operation(y-yes/n-no)");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
	}
}
