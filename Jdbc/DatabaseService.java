package com.jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.stream.events.EndDocument;

import com.jdbc.util.DatabaseUtil;
import com.jdbc.util.QueryUtil;
import com.tns.crud.Student;


//this class is only for interacting with Db
public class DatabaseService {
	
	
	DatabaseUtil databaseUtil=new DatabaseUtil();
	
	
	//insert operation
	public void insertStudent(Student student)  throws SQLException{
	
	try( Connection connection=  databaseUtil.getConnection();){
		
	PreparedStatement preparedStatement=connection.prepareStatement(QueryUtil.insertStudentQuery());
		
		preparedStatement.setString(1, student.getStdName());
		
		preparedStatement.setString(2, student.getDept());
		
		preparedStatement.setDouble(3, student.getGpa());
		
	int row=preparedStatement.executeUpdate();
	
	// To check the no of rows affected
	
	if (row > 0) {
		System.out.println("Record Created Successfully.");
		
	}else {
		System.out.println("Insert Record Faild...");
	}
	
	}
	
	
	}//End of insertStudent()
	
	
	public void getAllStudents() throws SQLException {
		
		try( Connection connection=  databaseUtil.getConnection();
		Statement statement=connection.createStatement();
				ResultSet resultSet=statement.executeQuery(QueryUtil.selectAllStudentQuery());){
			
			while (resultSet.next()) {
				
				printStudent(new Student(resultSet.getInt("stdId"),
						resultSet.getString("stdName"),resultSet.getString("dept"),
						resultSet.getDouble("gpa")
						));
				
			}
			
		}
		
	}// end of getAllStudents()
	
	private  void printStudent(Student student) {
		
		System.out.println("Student ID: "+student.getStdId());
		System.out.println("Student Name: "+ student.getStdName());
		System.out.println("Student Department: "+student.getDept());
		System.out.println("Student GPA: "+student.getGpa());
		System.out.println("----------------------------------------------");
		
	}

}