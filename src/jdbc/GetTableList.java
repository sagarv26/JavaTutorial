package jdbc;

import java.sql.*;

public class GetTableList {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String db = "place";
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db, "root", "sagar");
			
			ResultSet rs = null;
			DatabaseMetaData meta = conn.getMetaData();
			rs = meta.getTables(null, null, null, new String[] { "TABLE" });
			
			int count = 0;
			System.out.println("List of tables in database: "+db);
			while (rs.next()) {
				String tblName = rs.getString("TABLE_NAME");
				System.out.println(tblName);
				count++;
			}
			System.out.println(count + " Rows in set ");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
