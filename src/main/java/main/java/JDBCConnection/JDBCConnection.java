package main.java.JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {

	public static Connection conn = null;
	
	public static Connection getConnection() {
		
		try {
			
			if (conn == null) {
			
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String endpoint = "jdbc:oracle:thin:@tomerepodb.ck6g9esnobwt.us-west-2.rds.amazonaws.com:1521:ORCL";
				String username = "admin";
				String password = "password";
				
				conn = DriverManager.getConnection(endpoint, username, password);
				return conn;
				
				//Database no longer active.
				//return DriverMananger.getConnection
				//("jdbc:oracle:thin:
				//@tomerepodb.ck6g9esnobwt.us-west-2.rds.amazonaws.com
				//:1521:ORCL", "admin", "password");
				
			} else {
				
				return conn;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
			return null;
	}
}
//This main method is for testing the connection.
//	public static void main(String[] args) {
//	
//		Connection conn1 = getConnection();
//		Connection conn2 = getConnection();
//		Connection conn3 = getConnection();
//		
//		System.out.println(conn1);
//		System.out.println(conn2);
//		System.out.println(conn3);
//		
//		}

