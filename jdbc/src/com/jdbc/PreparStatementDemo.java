package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparStatementDemo {
	static Connection con=null;
	static String JDBC_URL="jdbc:mysql://localhost:3306/employee";
	static String UserName="root";
	static String password="root";
	public static void main(String[] args) {
		
	
		try {
				
		//load Jdbc driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//establish connection
		
		try (Connection con=DriverManager.getConnection(JDBC_URL, UserName, password)){
			
			Scanner sc=new Scanner(System.in);
			
			addData(con,3,"ex" );
			
		}
			
		} catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
		}
	}
		private static void addData(Connection con,int value1,String value2) throws SQLException {
			
	
String sqlQuery="INSERT INTO employeeDetails (empid, emp_name) VALUES (?, ?)";

PreparedStatement ps=con.prepareStatement(sqlQuery);
        ps.setInt(1, value1);
        ps.setString(2, value2);
     int rowseffected= ps.executeUpdate();
System.out.println(rowseffected);
		}


	}


