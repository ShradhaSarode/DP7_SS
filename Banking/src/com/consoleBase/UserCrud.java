package com.consoleBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserCrud {

	static Connection con = null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	static Scanner sc = new Scanner(System.in);

	public UserCrud() {
		con = DBConnect.getConnect();
//		System.out.println("Connection done.....");
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void insertUserDetails() {
		System.out.println("Enter user name: ");
		String userName = sc.next();
		System.out.println("Enter user AadharNum: ");
		long aadharNum=sc.nextLong();
		System.out.println("Enter PAN card num: ");
		String panCardNum = sc.next();
		System.out.println("Enter user email: ");
		String email=sc.next();
		System.out.println("Enter user phoneNum: ");
		long phoneNum = sc.nextLong();
		System.out.println("Enter Address: ");
		String address = sc.next();
		System.out.println("Enter Password: ");
		String password = sc.next();

		try {
			pst = con.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
			pst.setString(1, userName);
			pst.setLong(2, aadharNum);
			pst.setString(3, panCardNum);
			pst.setString(4, email);
			pst.setLong(5, phoneNum);
			pst.setString(6, address);
			pst.setString(7, password);

			int noOfRowsInserted = pst.executeUpdate();
			if (noOfRowsInserted > 0) {
				System.out.println("User Details added....");
			} else {
				System.out.println("error in userDetail....");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void fetchUserDetails() {
		try {
			rs = st.executeQuery("select * from user");

			System.out.println("--------------Users---------------------");
			while (rs.next()) {
				System.out.println( "userName: "+ rs.getString(1) +
				           " Aadhar Num: " +rs.getLong(2) +
				           " PAN Card Num: "+rs.getString(3) +
				           " Email: " +rs.getString(4)+
				           " PhoneNum: "+rs.getLong(5) + 
				           " Address: " +rs.getString(6) + 
				           " Password: " +rs.getString(7));
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void deleteUserDetails() {
		System.out.println("enter the aadharNum to be deleted:");
		long aadharNum = sc.nextLong();
		try {
			pst = con.prepareStatement("delete from user where aadharNum=?");
			pst.setLong(1, aadharNum);
			int noOfRowsDeleted = pst.executeUpdate();
			if (noOfRowsDeleted > 0) {
				System.out.println("aadharNum " + aadharNum + "is deleted");
				fetchUserDetails();
			} else {
				System.out.println("error in deleting user....");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public boolean searchUsereByAadhar(long aadharNum) {
		boolean isFound = false;
		try {
			pst = con.prepareStatement("select * from user where aadharNum=?");
			pst.setLong(1, aadharNum);
			rs = pst.executeQuery();
			while (rs.next()) {
				isFound = true;
				System.out.println("userName: "+ rs.getString(1) +
						           "\nAadhar Num: " +rs.getLong(2) +
						           "\nPAN Card Num: "+rs.getString(3) +
						           "\nEmail: " +rs.getString(4)+
						           "\nPhoneNum: "+rs.getLong(5) + 
						           "\nAddress: " +rs.getString(6) + 
						           "\nPassword: " +rs.getString(7));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return isFound;
	}

	public void updateUserphoneNum() {
		System.out.println("Enter AadharNum for phoneNum updation: ");
		long aadharNum = sc.nextLong();
		if (searchUsereByAadhar(aadharNum)) {
			System.out.println("enter the new phoneNum: ");
			long phoneNum = sc.nextLong();
			try {
				pst = con.prepareStatement("update user set phoneNum=? where aadharNum=?");
				pst.setFloat(1, phoneNum);
				pst.setLong(2, aadharNum);
				int noOfRowsupdated = pst.executeUpdate();
				if (noOfRowsupdated > 0) {
					System.out.println("phoneNum updated...");
					searchUsereByAadhar(aadharNum);
				} else {
					System.out.println("error in updating phoneNum....");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		} else {
			System.out.println("course " + aadharNum + " not found...");
		}
	}

	public static void main(String[] args) {
		UserCrud f1 = new UserCrud();

		int choice;
		char ch;
		do {
			System.out.println("=========================================================");
			System.out.println("1. Add new User");
			System.out.println("2. Delete User");
			System.out.println("3. Update User");
			System.out.println("4. View all User ");
			System.out.println("5. View User By aadharNum");
			System.out.println("6. Exit");

			System.out.println("Enter your choice:");
			System.out.println("---------------------------------------------------");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				f1.insertUserDetails();
				break;
			case 2:
				f1.deleteUserDetails();
				break;
			case 3:
				f1.updateUserphoneNum();
				break;
			case 4:
				f1.fetchUserDetails();
				break;
			case 5:
				System.out.println("Enter the User aadharNum to be searched:");
				long aadharNum = sc.nextLong();
				f1.searchUsereByAadhar(aadharNum);
				break;
			case 6:
				System.out.println("------------Closing the User application---------------");
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

