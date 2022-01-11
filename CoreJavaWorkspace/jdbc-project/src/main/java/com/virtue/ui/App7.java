package com.virtue.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App7 {
	public static void main(String[] args) {
		
		try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr" ,"hr");
			 Scanner scan = new Scanner(System.in);){
						
			Statement st = con.createStatement();
			
			System.out.print("Enter job id : ");
			String jobId = scan.nextLine();
			System.out.print("Enter job title : ");
			String jobTitle = scan.nextLine();
			System.out.print("Enter min salary : ");
			int minSalary = scan.nextInt();
			System.out.print("Enter max salary : ");
			int maxSalary = scan.nextInt();
			
			String sql = 
					"INSERT INTO jobs(job_id, job_title, min_salary, max_salary) VALUES ('" + jobId + "','" + jobTitle +  "'," + minSalary + "," + maxSalary + ")";
			int rowsEffected = st.executeUpdate(sql);
			if (rowsEffected == 1)
				System.out.println("row inserted.");
			else
				System.out.println("unable to insert");
			
		} catch(SQLException excep) {
			System.out.println("unable to connect");
		}
		

	}

}
