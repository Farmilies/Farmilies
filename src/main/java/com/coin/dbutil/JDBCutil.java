package com.coin.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCutil {
	
	static Connection conn;
	
	static {
		String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
        String USER = "system";
        String PASS = "1234";
        
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
	        conn = DriverManager.getConnection(URL, USER, PASS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
	}
	
	public static Connection getConnection() throws Exception {
		if(conn != null) {
			return conn;
		}else {
			throw new Exception();
		}
	}
	
	public static void close(Connection con, PreparedStatement ps, ResultSet rs) {
		
		try {
			if(rs != null) rs.close();
			if(ps != null) ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
