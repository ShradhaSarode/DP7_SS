package com.assignmentJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 2.WAP using JDBC to transfer employees from manager 
 with id 10 to manager with id 1. Delete employee with id 10. 
 Do all using commit and rollback.*/
public class SixthQ {
	static Connection con;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;

	public SixthQ() {
		con = DBConnect.getConnect();
		System.out.println("Connection done.....");
		try {
//			con.setSavepoint();
			con.setAutoCommit(false);
			st=con.createStatement();
//			pst = con.prepareStatement("update employees set MANAGER_ID=101    where MANAGER_ID=100");
			con.commit();
			pst = con.prepareStatement("delete from employees   where MANAGER_ID=100");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void updateEmp() {
		try {
			rs=st.executeQuery("update employees set MANAGER_ID=101    where MANAGER_ID=100");
			System.out.println("--------------Employees---------------------");
			pst = con.prepareStatement("select * from employees");
			rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println("empId:" + rs.getDouble(1) + " firstName: " + rs.getString(2) + " lastName: "
						+ rs.getString(3) + " email: " + rs.getString(4) + " phoneNum: " + rs.getString(5) + " hireDate: "
						+ rs.getDate(6) + " job_id: " + rs.getString(7) + " salary: " + rs.getDouble(8)
						+ " commission_pct: " + rs.getDouble(9) + " manager_id: " + rs.getDouble(10) + " department_id: "
						+ rs.getDouble(11));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void deleteEmp() {
		try {
			int i = pst.executeUpdate();
			System.out.println(i);
			System.out.println("--------------Employees---------------------");
			pst = con.prepareStatement("select * from employees");
			rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println("empId:" + rs.getDouble(1) + " firstName: " + rs.getString(2) + " lastName: "
						+ rs.getString(3) + " email: " + rs.getString(4) + " phoneNum: " + rs.getString(5) + " hireDate: "
						+ rs.getDate(6) + " job_id: " + rs.getString(7) + " salary: " + rs.getDouble(8)
						+ " commission_pct: " + rs.getDouble(9) + " manager_id: " + rs.getDouble(10) + " department_id: "
						+ rs.getDouble(11));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		SixthQ f1 = new SixthQ();
		f1.updateEmp();
//		f1.deleteEmp();
	}

}
