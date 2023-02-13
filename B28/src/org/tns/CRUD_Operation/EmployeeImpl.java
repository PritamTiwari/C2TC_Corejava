package org.tns.CRUD_Operation;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeImpl implements EmployeeDAO {
	String username ="root";
	String password="mohan@12345";
	String url = "jdbc:mysql://localhost:3306/jdbcdemo";
	Employee e = new Employee();

	@Override
		public void getAllEmployees() {
		try
		{
			String query = "select * from Employee";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
			{		
				String id = rs.getString(1);
				e.setID(id);
				String name = rs.getString(2);
				e.setName(name);
				String sal = rs.getString(3);
				e.setSalary(sal);
				System.out.printf("|%5s|%-10s|%-10s|\n", id, name, sal);
			}
			
			rs.close();
			st.close();
			conn.close();
		}
		catch (ClassNotFoundException | SQLException e) {		
			e.printStackTrace();
			}
		}
	
		@Override
		public Employee getEmployeeById(String ID) {
			try
			{
				String query = "select * from Employee where ID="+ID;
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				Connection conn = DriverManager.getConnection(url, username, password);
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(query);
					while(rs.next())
					{					
						String i = rs.getString(1);
						e.setID(i);
						String name = rs.getString(2);
						e.setName(name);
						String salary = rs.getString(3);
						e.setSalary(salary);
						//System.out.println("Employee ID: "+i+"\tEmployee name: "+name+"\tSalary: "+salary);
						System.out.println("         Employee Data          ");
						System.out.println("-----------------------------");
						System.out.printf("|%5s|%-10s|%-10s|\n", "ID", "Name", "Salary");
						System.out.println("-----------------------------");
						System.out.printf("|%5s|%-10s|%-10s|\n", i, name, salary);
						System.out.println("-----------------------------");
					}
				
				
				rs.close();
				st.close();
				conn.close();
			}
			catch (ClassNotFoundException | SQLException e) {		
				e.printStackTrace();
			}
			return e;
		}
	
			
		@Override
		public Employee addEmployee(Employee e) {
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				Connection conn = DriverManager.getConnection(url, username, password);
		        PreparedStatement ps = conn.prepareStatement("INSERT INTO Employee VALUES (?, ?, ?)");
		       ps.setString(1, e.getID());
		       ps.setString(2, e.getName());
		       ps.setString(3, e.getSalary());
		      int i =  ps.executeUpdate();
		      if(i > 0) {
		    	  System.out.println("Employee added successfully...!");		      	     
		      }
		      else
		    	  System.out.println("Failed to add a record........!");
		      ps.close();
		      conn.close();
		    } catch (ClassNotFoundException | SQLException ex) {
		        ex.printStackTrace();
		    }
		    return null;
			
		}
	
		@Override
		public Employee delEmployee(String ID) {
			try
			{
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				Connection conn = DriverManager.getConnection(url, username, password);
				String sql = "DELETE FROM Employee WHERE ID=?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, ID);
												 
				int i = ps.executeUpdate();
				if (i > 0) {
				    System.out.println("Data deleted successfully!");
				}
				else
					System.out.println("Failed to delete data..!");
				
				ps.close();
				conn.close();
				
			}catch (ClassNotFoundException | SQLException ex) {
		        ex.printStackTrace();
		    }
			return null;
			
		}


		@Override
		public Employee updateEmployee(String ID, String name) {
			try
			{
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				Connection conn = DriverManager.getConnection(url, username, password);
				String sql = "UPDATE Employee SET Name= ? WHERE ID=?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, name);
				ps.setString(2, ID);
								 
				int i = ps.executeUpdate();
				if (i > 0) {
				    System.out.println("An existing user was updated successfully!");
				}
				else
					System.out.println("Failed to update data..!");
				
				ps.close();
				conn.close();
				
			}catch (ClassNotFoundException | SQLException ex) {
		        ex.printStackTrace();
		    }
			return null;
			
		}
}

