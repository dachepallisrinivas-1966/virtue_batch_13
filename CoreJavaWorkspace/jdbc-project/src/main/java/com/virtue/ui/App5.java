package com.virtue.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class App5 {
	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(System.in);
			// step-1 : load driver class (optional from jdk1.8)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// step-2 : establish connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr" ,"hr");
			
			String sql = 
					"SELECT employee_id, first_name, salary, department_id FROM employees WHERE department_id = ?";
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, 50);
			
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				System.out.printf("%-5d%-20s%5d%5d\n", rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
			}
			
		} catch(ClassNotFoundException excep) {
			System.out.println("driver class not found");
		} catch(SQLException excep) {
			System.out.println("unable to connect");
		}
		

	}

}
