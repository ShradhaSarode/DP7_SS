package com.assignmentJDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//3.	WAP using JDBC to execute Stored Procedure using Callable Statement.
public class ThirdQ {
	public Connection con = null;
	Statement st;
	ResultSet rs;
	CallableStatement cst;
	static Scanner sc = new Scanner(System.in);

	public ThirdQ() {
		con = DBConnect.getConnect();
		System.out.println("Connection done.....");
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void getEmpDetails() {

		try {
			cst = con.prepareCall("{call empDetails}");

			boolean status = cst.execute();
			if (status) {
				rs = cst.getResultSet();
				while (rs.next()) {
					System.out.println(rs.getInt(1) + "---- " + rs.getString(2) + "----" + rs.getString(3) + "----"
							+ rs.getFloat(4));
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args)
	{
		ThirdQ t1=new ThirdQ();
		t1.getEmpDetails();
	}

}
