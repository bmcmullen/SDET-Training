package com.training.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnection {
	static Connection c = null;
	public PreparedStatement ps, ps1, ps2;
	public ResultSet rs, rs1, rs2;

	public static Connection getMySqlConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost/sdetdec?useSSL=false", "root", "Hexaware@123");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	// Stubbed connections for later...
	public static Connection getOracleConnection() {
		return null;
	}

	public static Connection getPostgresConnection() {
		return null;
	}

}
