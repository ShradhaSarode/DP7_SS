package com.JDBC_Story_Assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.assignmentJDBC.DBConnect;

//6.show top 3 list of managers who has maximum no of employees under them
public class SixthQ
{
	static Connection conn = null;
	static PreparedStatement pstmt;
	static ResultSet rs;

	public SixthQ() {
		conn = DBConnect.getConnect();
		System.out.println("Connection done...");
	}
	public static void top3Manager() {
		try {
			pstmt = conn.prepareStatement("select count(*) as count, MANAGER_ID  from employees group by "
					+ "MANAGER_ID order by count desc limit 3");
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
		SixthQ s1=new SixthQ();
		s1.top3Manager();
	}

}
