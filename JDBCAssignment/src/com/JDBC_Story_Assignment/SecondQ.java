package com.JDBC_Story_Assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.assignmentJDBC.DBConnect;
//2.show employees with lowest salary
public class SecondQ
{
	static Connection conn = null;
	static PreparedStatement pstmt;
	static ResultSet rs;

	public SecondQ() {
		conn = DBConnect.getConnect();
		System.out.println("Connection done...");
	}
	
	public static void minSalary() {
		try {
			pstmt = conn.prepareStatement("select * from employees where SALARY =(select min(salary) from employees)");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("employee id: " + rs.getInt(1) + "\nemployee first_name: " + rs.getString(2)+"\nsalary: "+rs.getInt(8));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args)
	{
		SecondQ s1=new SecondQ();
		s1.minSalary();
	}

}
