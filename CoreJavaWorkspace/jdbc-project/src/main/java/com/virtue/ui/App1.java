package com.virtue.ui;

import java.sql.DriverManager;
import java.sql.SQLException;

public class App1 {

	public static void main(String[] args) {
		
		try {
			// step-1 : load driver class (optional from jdk1.8)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// step-2 : establish connection
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr" ,"hr");
			System.out.println("connection established");
			
		} catch(ClassNotFoundException excep) {
			System.out.println("driver class not found");
		} catch(SQLException excep) {
			System.out.println("unable to connect");
		}
		

	}

}
