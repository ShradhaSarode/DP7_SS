package com.JDBC_Story_Assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.assignmentJDBC.DBConnect;

//9.show locations which has maximum departments
public class NinethQ
{
	static Connection conn = null;
	static PreparedStatement pstmt;
	static ResultSet rs;

	public NinethQ() {
		conn = DBConnect.getConnect();
		System.out.println("Connection done...");
	}
	public static void maxDept() {
		try {
			pstmt = conn.prepareStatement("select location_id, max(department_id) from departments group by location_id");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("employee id: "+rs.getInt(1)+", employee first_name: "+rs.getString(2));
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		NinethQ n1=new NinethQ();
		n1.maxDept();
	}

}
