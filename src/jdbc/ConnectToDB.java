package jdbc;

import java.sql.*;

public class ConnectToDB {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/place", "root", "sagar");

			if (conn.isClosed()) {
				System.out.print("Connection is Closed");
			} else {
				System.out.print("Connection Open");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
