package org.tns.CRUD_Operation;


import java.util.Scanner;

public class App  {
	public static void main(String[] args) {
		int choice,num;
		
		EmployeeDAO dao = new EmployeeImpl();
		Employee e;
		
		do {
			System.out.println("<-------Menu------>");
			System.out.println("1.Get Employee by ID");
			System.out.println("2.Add Employee");
			System.out.println("3.Update Employee");
			System.out.println("4.Delete Employee");
			System.out.println("5.Get all Employees");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
		
		switch(choice)
		{
		case 1: System.out.println("Enter the ID of Employee: ");
				String id1 = sc.next();
				e = dao.getEmployeeById(id1);
			break;
			
		case 2: System.out.println("Enter Employee Details: ");
				System.out.println("Enter Employee ID: ");
				String id2 = sc.next();
				System.out.println("Enter Employee Name: ");
				String name = sc.next();
				System.out.println("Enter Salary: ");
				String salary = sc.next();
				Employee e1 = new Employee(id2, name, salary);
				e = dao.addEmployee(e1);
			break;
			
		case 3:	System.out.println("Enter the ID to change record: ");
				String id3 = sc.next();
				System.out.println("Enter the new Name: ");
				String name1 = sc.next();
				e = dao.updateEmployee(id3, name1);
			break;
			
		case 4: System.out.println("Enter the ID to delete record");
				String id4 = sc.next();
				e = dao.delEmployee(id4);
				break;
			
		case 5: System.out.println("Employee Data");
				System.out.println("-----------------------------");
				System.out.printf("|%5s|%-10s|%-10s|\n", "ID", "Name", "Salary");
				System.out.println("-----------------------------");
				dao.getAllEmployees();
				System.out.println("-----------------------------");
				break;
		default:
			System.out.println("Wrong input..!"); 
			break;
		}
		System.out.println("Enter 9 to continue..!");
		num = sc.nextInt();
		}while(num == 9);
	}
}
