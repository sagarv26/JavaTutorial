package jdbc;

import java.sql.*;

public class DBView {

	public static void main(String[] args) throws SQLException {
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/place", "root", "sagar"
            );

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM district");

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


	}

}
