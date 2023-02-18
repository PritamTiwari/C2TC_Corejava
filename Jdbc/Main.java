package com.jdbc.main;

import java.util.Scanner;

import com.jdbc.service.DatabaseService;
import com.tns.crud.Student;

public class Main {

	public static void main(String[] args) {
		
		//creating the object for operations performing  class.
		DatabaseService databaseservice=new DatabaseService();
		
		
		
		//Getting the user input
		try(Scanner in=new Scanner(System.in);){
		 
			boolean isRunning=true;
			
			
		while (isRunning) {
			System.out.println("----Select Appropriate Option----");
			System.out.println("1. Insert the Data");
			System.out.println("2. Select All");
			System.out.println("3. Select Student by ID");
			System.out.println("4. Delete Student");
			System.out.println("5. Update Student");
			System.out.println("6. Exit");
			//Storing entered value by user
			
			System.out.println("<---Select option Above--->");
			int option=Integer.parseInt(in.nextLine());
			
			switch (option) {
			case 1:
				System.out.println("Enter Name,dept,gpa \n");
				
				databaseservice.insertStudent(new Student(in.nextLine(), in.nextLine(),in.nextDouble()));
				break;
				
			case 2:
				databaseservice.getAllStudents();
				break;
				
				case 3:
					System.out.println(option);
					
					break;
					
					
					case 4:
						System.out.println(option);
						break;
						
						
					case 5:
						System.out.println(option);
						
						break;
                    
					case 6:
						System.out.println("---Thank You---");
						isRunning=false;
						break;
				
			default:
				System.out.println("Not a Valid option");
				break;
			}
			
			
		}
			
		}catch (Exception e) {
			
			throw new RuntimeException("Something Went Wrong..."+ e);
		}
		
		
			
		
	}

}

