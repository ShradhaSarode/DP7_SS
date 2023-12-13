package com.JDBC_Story_Assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.assignmentJDBC.DBConnect;

//7.show minimum salary for each department
public class SeventhQ
{
	static Connection conn = null;
	static PreparedStatement pstmt;
	static ResultSet rs;

	public SeventhQ() {
		conn = DBConnect.getConnect();
		System.out.println("Connection done...");
	}
	public static void minSalForDept() {
		try {
			pstmt = conn.prepareStatement("select min(salary), DEPARTMENT_ID from employees group by DEPARTMENT_ID");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("employee id: "+rs.getInt(1)+", employee first_name: "+rs.getString(2));
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{
		SeventhQ s1=new SeventhQ();
		s1.minSalForDept();
	}

}
