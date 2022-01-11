package com.virtue.ui;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class App6 {
	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(System.in);
			// step-1 : load driver class (optional from jdk1.8)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// step-2 : establish connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr" ,"hr");
			
			CallableStatement cs = con.prepareCall("{? = call fun_get_avg_salary( ? )}");
			cs.registerOutParameter(1, Types.DOUBLE);
			cs.setInt(2, 50);
			cs.execute();
			
			double output = cs.getDouble(1);
			System.out.println("Average Salary = " + output);
			
		} catch(ClassNotFoundException excep) {
			System.out.println("driver class not found");
		} catch(SQLException excep) {
			System.out.println("unable to connect");
		}
		

	}

}
