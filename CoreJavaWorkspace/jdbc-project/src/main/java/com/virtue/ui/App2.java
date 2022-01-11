package com.virtue.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App2 {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			// step-1 : load driver class (optional from jdk1.8)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// step-2 : establish connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr" ,"hr");
			st = con.createStatement();
			String sql = 
					"INSERT INTO jobs(job_id, job_title, min_salary, max_salary) VALUES ('J1', 'Software Engineer', 30000, 75000)";
			int rowsEffected = st.executeUpdate(sql);
			if (rowsEffected == 1)
				System.out.println("row inserted.");
			else
				System.out.println("unable to insert");
			
		} catch(ClassNotFoundException excep) {
			System.out.println("driver class not found");
		} catch(SQLException excep) {
			System.out.println("unable to connect");
		} finally {
			try {
				st.close();
			} catch(SQLException excep) {
				System.out.println(excep.getMessage());
			}
			try {
				con.close();
			} catch(SQLException excep) {
				System.out.println(excep.getMessage());
			}
		}
		

	}

}
