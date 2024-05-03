package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	static String userDB="root";
	static String passDB="";
	static String url="jdbc:mysql://localhost:3306/electronicgadget";
	static String driver="com.mysql.jdbc.Driver";
	 static Connection con;
	
	public static Connection dbConnect() {
		// Step 2 Load Driver 
		try {
			Class.forName(driver);
			//System.out.println("Driver Loaded");
		} catch (ClassNotFoundException e) {
			//System.out.println("Driver Not Loaded");
			e.printStackTrace();
		}
		
		// Step 3 Establish the Connection
		try {
			con = DriverManager.getConnection(url,userDB,passDB);
			//System.out.println("Connection Established");
		} catch (Exception e) {
			//System.out.println("Connection Failed");
			e.printStackTrace();
		}
		return con;
	}
	
	
	public static void dbClose() {
		try {
			con.close();
			//System.out.println("Connection Closed");
		} catch (Exception e) {
			//System.out.println("Connection could not be closed");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		DBConnection dbCon = new DBConnection();
		dbCon.dbConnect();
		dbCon.dbClose();
	}


}
