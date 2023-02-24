package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtils {
	
	final static String URL;
	final static String PASSWORD;
	final static String USERNAME;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("Fatal Error! Unable to start Application.");
			System.exit(1);
		}
		ResourceBundle bundle = ResourceBundle.getBundle("DBCrendentials");

		URL = bundle.getString("URL");
		PASSWORD = bundle.getString("PASSWORD");
		USERNAME = bundle.getString("USERNAME");
	}
    /**
     * method to get the connection            
     * @return connection
     * @throws Exception
     */
	public static Connection connectToDatabase() throws Exception {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
    /**
     * to close the connection
     * @param con
     * @throws SQLException
     */
	static void closeconnection(Connection con) throws SQLException {
		if(con != null) {
			con.close();
		}
	}

}
