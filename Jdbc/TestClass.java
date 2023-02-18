package com.Tns.jdbc;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestClass {
	
	
	public static void main(String[] args) {
		
		
		//Establishing the Connection
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","MyNewPass");
		//Creating the Statement
			Statement st=con.createStatement();
			
			//sql commands for data retrieval
			String str="select Name,Price,Quality from cources";
			System.out.println("The sql statement is "+str+"\n");
			//execute the query
			ResultSet rs=st.executeQuery(str);
			System.out.println("The records are:");
			int rowCount=0;
			while(rs.next()) {
				
				String title=rs.getString("Name");
				double price=rs.getDouble("Price");
				int qlt=rs.getInt("Quality");
				System.out.println("title   |"+title+ " |"+" |price "+price+ "| "+ " |qlt "+qlt);
				++rowCount;
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}