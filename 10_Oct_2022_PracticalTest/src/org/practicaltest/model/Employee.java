package org.practicaltest.model;

import java.util.Objects;

public class Employee {

	int    empId;
	String empName;
	Gender gender;
	String DOJ;
	
	
	
	public Employee(int empId, String empName,Gender gender, String dOJ) {
		
		this.empId = empId;
		this.empName = empName;
		this.gender=gender;
		this.DOJ = dOJ;
		
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getDOJ() {
		return DOJ;
	}


	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}


	


	@Override
	public int hashCode() {
		return Objects.hash(DOJ, empId, empName, gender);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(DOJ, other.DOJ) && empId == other.empId
				&& Objects.equals(empName, other.empName) && gender == other.gender;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", gender=" + gender + ", DOJ=" + DOJ + "]";
	}

	
	
}
