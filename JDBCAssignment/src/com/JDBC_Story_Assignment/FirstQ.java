package com.JDBC_Story_Assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.assignmentJDBC.DBConnect;

//1.show employees with highest salary
public class FirstQ {
	static Connection conn = null;
	static PreparedStatement pstmt;
	static ResultSet rs;

	public FirstQ() {
		conn = DBConnect.getConnect();
		System.out.println("Connection done...");
	}

	public static void highSal() {
		try {
			pstmt = conn.prepareStatement("select * from employees where SALARY =(select max(salary) from employees)");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("employee id: " + rs.getInt(1) + "\nemployee first_name: " + rs.getString(2)
						+ "\nsalary: " + rs.getInt(8));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		FirstQ f1 = new FirstQ();
		f1.highSal();
	}

}
