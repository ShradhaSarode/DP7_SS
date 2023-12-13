package com.consoleBase;

//import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//import java.sql.Date;

public class AccountCrud {
	static Connection con = null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	static Scanner sc = new Scanner(System.in);

	public AccountCrud() {
		con = DBConnect.getConnect();
//		System.out.println("Connection done.....");
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void fetchAccountDetails() {
		try {
			rs = st.executeQuery("select * from account");

			System.out.println("--------------Users---------------------");
			while (rs.next()) {
				System.out.println("accountNum: " + rs.getLong(1) + " accountType: " + rs.getString(2) + " balance: "
						+ rs.getLong(3) + " status: " + rs.getString(4) + " creationDate: " + rs.getDate(5));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public boolean searchAccByaccountNum(long accountNum) {
		boolean isFound = false;
		try {
			pst = con.prepareStatement("select * from account where accountNum=?");
			pst.setLong(1, accountNum);
			rs = pst.executeQuery();
			while (rs.next()) {
				isFound = true;
				System.out.println("accountNum: " + rs.getLong(1) + "\naccountType: " + rs.getString(2) + "\nbalance: "
						+ rs.getLong(3) + "\nstatus: " + rs.getString(4) + "\ncreationDate: " + rs.getDate(5));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return isFound;
	}

	public void insertAccountDetails() {
		System.out.println("Enter  accountNum: ");
		long accountNum = sc.nextLong();
		System.out.println("Enter accountType: ");
		String accountType = sc.next();
		System.out.println("Enter Account balance: ");
		long balance = sc.nextLong();
		System.out.println("Enter Account status: ");
		String status = sc.next();
		System.out.println("Enter Account creationDate: ");
		String creationDate = sc.next();

		try {
			pst = con.prepareStatement("insert into account values(?,?,?,?,?)");

			pst.setLong(1, accountNum);
			pst.setString(2, accountType);
			pst.setLong(3, balance);
			pst.setString(4, status);
			pst.setString(5, creationDate);

			int noOfRowsInserted = pst.executeUpdate();
			if (noOfRowsInserted > 0) {
				System.out.println("Account Details added....");
			} else {
				System.out.println("error in AccountDetail....");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void deleteAccountDetails() {
		System.out.println("enter the accountNum to be deleted:");
		long accountNum = sc.nextLong();
		try {
			pst = con.prepareStatement("delete from account where accountNum=?");
			pst.setLong(1, accountNum);
			int noOfRowsDeleted = pst.executeUpdate();
			if (noOfRowsDeleted > 0) {
				System.out.println("accountNum " + accountNum + " is deleted");
				fetchAccountDetails();
			} else {
				System.out.println("error in deleting account....");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void updateAccountbalance() {
		System.out.println("Enter accountNum for balance updation: ");
		long accountNum = sc.nextLong();
		if (searchAccByaccountNum(accountNum)) {
			System.out.println("Enter the new balance: ");
			long balance = sc.nextLong();
			try {
				pst = con.prepareStatement("update account set balance=? where accountNum=?");
				pst.setLong(1, balance);
				pst.setLong(2, accountNum);
				int noOfRowsupdated = pst.executeUpdate();
				if (noOfRowsupdated > 0) {
					System.out.println("Balance updated...");
					searchAccByaccountNum(accountNum);
				} else {
					System.out.println("Error in updating Balance....");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		} else {
			System.out.println("Account " + accountNum + " not found...");
		}
	}

	public static void main(String[] args) {
		AccountCrud f1 = new AccountCrud();

		int choice;
		char ch;
		do {
			System.out.println("=========================================================");
			System.out.println("1. Add new Account");
			System.out.println("2. Delete Account");
			System.out.println("3. Update Account");
			System.out.println("4. View all Account ");
			System.out.println("5. View Account By accountNum");
			System.out.println("6. Exit");

			System.out.println("Enter your choice:");
			System.out.println("---------------------------------------------------");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				f1.insertAccountDetails();
				break;
			case 2:
				f1.deleteAccountDetails();
				break;
			case 3:
				f1.updateAccountbalance();
				break;
			case 4:
				f1.fetchAccountDetails();
				break;
			case 5:
				System.out.println("Enter the accountNum to be searched:");
				long accountNum = sc.nextLong();
				f1.searchAccByaccountNum(accountNum);
				break;
			case 6:
				System.out.println("------------Closing the Account application---------------");
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
