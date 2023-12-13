package com.JDBC_Story_Assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.assignmentJDBC.DBConnect;

//11.show list of region with highest no of employees
public class EleventhQ {
	static Connection conn = null;
	static PreparedStatement pstmt;
	static ResultSet rs;

	public EleventhQ() {
		conn = DBConnect.getConnect();
		System.out.println("Connection done...");
	}

	public static void regionList() {
		try {
			pstmt = conn.prepareStatement("select c.REGION_ID, count(e.EMPLOYEE_ID) "
					+ "from employees e join departments d join countries c join locations l "
					+ "on e.DEPARTMENT_ID = d.DEPARTMENT_ID and d.LOCATION_ID = l.LOCATION_ID and l.COUNTRY_ID = c.COUNTRY_ID group by c.REGION_ID");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("region id: " + rs.getInt(1) + ", employee count: " + rs.getString(2));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args)
	{
		EleventhQ e1=new EleventhQ();
		e1.regionList();
	}

}
