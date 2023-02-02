package org.tns.CRUD_Operation;

public interface EmployeeDAO {
	public void getAllEmployees();
	public Employee getEmployeeById(String ID);
	public Employee addEmployee(Employee e);
	public Employee delEmployee(String ID);
	public Employee updateEmployee(String ID, String name);
	
}
