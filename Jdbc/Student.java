package com.tns.crud;

public class Student {

//for data integrity
	private int stdId;
	private String stdName;
	private String dept;
	private double gpa;
	
	
public Student(String stdName, String dept, double gpa) {
		super();
		this.stdName = stdName;
		this.dept = dept;
		this.gpa = gpa;
	}
    public Student(int stdId, String stdName, String dept, double gpa) {
	super();
	this.stdId = stdId;
	this.stdName = stdName;
	this.dept = dept;
	this.gpa = gpa;
}
public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}





}