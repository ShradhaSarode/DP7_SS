package com.JDBC_Story_Assignment;

//5.list department which has highest no of employees
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.assignmentJDBC.DBConnect;

public class FifthQ {
	static Connection conn = null;
	static PreparedStatement pstmt;
	static ResultSet rs;

	public FifthQ() {
		conn = DBConnect.getConnect();
		System.out.println("Connection done...");
	}

	public static void highestNoOfEmp() {
		try {
			pstmt = conn.prepareStatement(
					"select count(employee_id) as total, DEPARTMENT_ID from employees GROUP BY DEPARTMENT_ID "
							+ "order by total desc limit 1");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("employee id: " + rs.getInt(1) + ", employee first_name: " + rs.getString(2));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		FifthQ f1 = new FifthQ();
		f1.highestNoOfEmp();
	}

}
