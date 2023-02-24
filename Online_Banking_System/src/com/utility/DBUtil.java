package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	final static String url = "jdbc:mysql://localhost:3306/appdata";
	final static String password = "qazwsx";
	final static String username = "root";

	 static Connection connectToDatabase() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			System.err.println("Fatal Error! Unable to start Application.");
			System.exit(1);
		}
		try{
			con = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.print(e.getMessage());
		} finally {
			if(con != null) {
				System.out.println("done");
			}
		}
		return con;
	}
	 public static void main(String[] args) {
		System.out.println(DBUtil.connectToDatabase());
	}
}
