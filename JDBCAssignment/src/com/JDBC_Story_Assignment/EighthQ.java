package com.JDBC_Story_Assignment;
//8.show maximum salary for each department
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.assignmentJDBC.DBConnect;

public class EighthQ
{
	static Connection conn = null;
	static PreparedStatement pstmt;
	static ResultSet rs;

	public EighthQ() {
		conn = DBConnect.getConnect();
		System.out.println("Connection done...");
	}
	public static void maxSalForDept() {
		try {
			pstmt = conn.prepareStatement("select max(salary), DEPARTMENT_ID from employees group by DEPARTMENT_ID");
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
		EighthQ e1=new EighthQ();
		e1.maxSalForDept();
	}

}
