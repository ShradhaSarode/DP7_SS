package com.JDBC_Story_Assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.assignmentJDBC.DBConnect;

//3.list employees who start with name 'A'
public class ThirdQ
{
	static Connection conn = null;
	static PreparedStatement pstmt;
	static ResultSet rs;

	public ThirdQ() {
		conn = DBConnect.getConnect();
		System.out.println("Connection done...");
	}
	
	public static void empNameStartA() {
		try {
			pstmt = conn.prepareStatement("select * from employees where FIRST_NAME like 'a%'");
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
		ThirdQ t1=new ThirdQ();
		t1.empNameStartA();
	}

}
