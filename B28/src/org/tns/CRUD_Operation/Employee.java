package org.tns.CRUD_Operation;



public class Employee {
	private String ID;
	private String name;
	private String salary;
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Employee(String iD, String name, String salary) {
		super();
		ID = iD;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee ID=" + ID + ", name=" + name + ", salary=" + salary;
	}
	
	
}