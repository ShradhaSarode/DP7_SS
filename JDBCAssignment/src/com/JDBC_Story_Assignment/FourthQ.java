package com.JDBC_Story_Assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.assignmentJDBC.DBConnect;
//4.show employees who are hired in 2017
public class FourthQ
{
	static Connection conn = null;
	static PreparedStatement pstmt;
	static ResultSet rs;

	public FourthQ() {
		conn = DBConnect.getConnect();
		System.out.println("Connection done...");
	}
	
	public static void findEmpUsingDate() {
		try {
			pstmt = conn.prepareStatement("select employee_id, first_name from employees where year(hire_date) = 1987");
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
		FourthQ f1=new FourthQ();
		f1.findEmpUsingDate();
	}

}
