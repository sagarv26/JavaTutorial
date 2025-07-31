package jdbc;

import java.sql.*;

public class DBCreation {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "sagar");
			Statement stmt = conn.createStatement();
			stmt = conn.createStatement();

			String sql = "CREATE DATABASE jdbc_example";
			stmt.executeUpdate(sql);
			System.out.println("Database created successfully...");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
