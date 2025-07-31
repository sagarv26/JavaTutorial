package jdbc;

import java.sql.*;

public class JavaJDBC {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/place", "root", "sagar"
					);

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM district");

			while (rs.next()) {
				System.out.println(rs.getString("id_dist") + " - " +rs.getString("district_name"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}


	}

}
