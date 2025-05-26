//Program to define DBUtil class for Database Connectivity
package com.tnsif.daytwentytwo.v1.usingpreparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	private static Connection con;
		
	static
	{		
		try {
			//Step 1. load the JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully...");
			
			//Step 2. Establish the connection with database
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbn08","root","alpana@123");
			System.out.println("Connection established successfully....");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public static Connection getCn()
	{
		return con;
	}
	
	
}
