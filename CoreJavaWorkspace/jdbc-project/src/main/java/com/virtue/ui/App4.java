package com.virtue.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class App4 {
	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(System.in);
			// step-1 : load driver class (optional from jdk1.8)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// step-2 : establish connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr" ,"hr");
			
			
			System.out.print("Enter job id : ");
			String jobId = scan.nextLine();
			System.out.print("Enter job title : ");
			String jobTitle = scan.nextLine();
			System.out.print("Enter min salary : ");
			int minSalary = scan.nextInt();
			System.out.print("Enter max salary : ");
			int maxSalary = scan.nextInt();
			
			String sql = 
					"INSERT INTO jobs(job_id, job_title, min_salary, max_salary) VALUES (?,?,?,?)";
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, jobId);
			pst.setString(2, jobTitle);
			pst.setInt(3, minSalary);
			pst.setInt(4, maxSalary);
			
			int rowsEffected = pst.executeUpdate();
			
			if (rowsEffected == 1)
				System.out.println("row inserted.");
			else
				System.out.println("unable to insert");
			
		} catch(ClassNotFoundException excep) {
			System.out.println("driver class not found");
		} catch(SQLException excep) {
			System.out.println("unable to connect");
		}
		

	}

}
