package jdbc;

import java.sql.*;

public class TableDescription {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/place", "root", "sagar");
			System.out.println("Table Description :");
			Statement stmt=conn.createStatement();  
			ResultSet rs = stmt.executeQuery("DESCRIBE district");
		    ResultSetMetaData md = rs.getMetaData();
		    int col = md.getColumnCount();
		    for (int i = 1; i <= col; i++) {
		      String col_name = md.getColumnName(i);
		      System.out.print(col_name+"\t");
		    }
		    System.out.println("");
		    
		    DatabaseMetaData dbm = conn.getMetaData();
		    ResultSet rs1 = dbm.getColumns(null, "%", "district", "%");
		    while (rs1.next()) {
		      String col_name = rs1.getString("COLUMN_NAME");
		      String data_type = rs1.getString("TYPE_NAME");
		      int data_size = rs1.getInt("COLUMN_SIZE");
		      int nullable = rs1.getInt("NULLABLE");
		      System.out.print(col_name + "  " + data_type + "(" + data_size + ")");
		      if (nullable == 1) {
		        System.out.println(" NULL");
		      } else {
		        System.out.println(" NOT NULL");
		      }
		    }
		    
		   
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
