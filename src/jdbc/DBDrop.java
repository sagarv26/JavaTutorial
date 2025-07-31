package jdbc;

import java.sql.*;

public class DBDrop {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "sagar");
			Statement stmt = conn.createStatement();
			stmt = conn.createStatement();

			String sql = "DROP DATABASE jdbc_example";
			stmt.executeUpdate(sql);
			System.out.println("Database dropped successfully...");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
