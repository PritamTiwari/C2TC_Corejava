package org.tns.jdbc;



import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/B28";
		String username = "root";
		String password ="pritam@12345";
		String query = "select * from student";
	Connection con = DriverManager.getConnection(url, username, password);
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(query);
	while( rs.next()) {
	
	System.out.println(rs.getInt(1));
	System.out.println(rs.getString(2));
	System.out.println(rs.getInt(3));
	}
	}
}
