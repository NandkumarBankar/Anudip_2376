package org.practicaltest.que1;


public class Employee {

	private int empId;
	private String empName;
	private String date;
	
	public Employee(int empId, String empName, String date) {
		this.empId = empId;
		this.empName = empName;
		this.date = date;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}	

	public String getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", date=" + date + "]";
	}	
	
}