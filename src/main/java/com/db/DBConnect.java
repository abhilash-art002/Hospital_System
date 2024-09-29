package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static Connection con;
	
	public static Connection getConn() {
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_system", "root", "Tutun@002");
	    } catch (Exception e) {
	        e.printStackTrace();
	        System.out.println("Database connection failed: " + e.getMessage());
	    }
	    return con;
	}

}
