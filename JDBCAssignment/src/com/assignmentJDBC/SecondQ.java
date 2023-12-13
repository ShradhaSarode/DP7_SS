package com.assignmentJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//2.	WAP using JDBC to select and print employee names along with their manager names.
public class SecondQ
{
	static Connection con ;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	public SecondQ()
	{
		con = DBConnect.getConnect();
		System.out.println("Connection done.....");
		try {
			pst = con.prepareStatement("select e.FIRST_NAME,m.FIRST_NAME FROM employees e join employees m  where m.EMPLOYEE_ID=e.MANAGER_ID");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public void fetchManagerName() {
		try {
			rs = pst.executeQuery();

			System.out.println("--------------Employees---------------------");
			while (rs.next()) {
				System.out.println("empName: "+ rs.getString(1)+" manager name: " +rs.getString(2));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args)
	{
		SecondQ s1=new SecondQ();
		s1.fetchManagerName();
	}

}
