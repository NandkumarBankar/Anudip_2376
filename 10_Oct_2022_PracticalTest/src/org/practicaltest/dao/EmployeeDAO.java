package org.practicaltest.dao;

import java.util.HashSet;

import org.practicaltest.model.Employee;

public class EmployeeDAO {

	
	
	public static void addEmpData(Employee emp) {
	    HashSet<Employee> hs=new HashSet<>();
		hs.add(emp);
		System.out.println(hs);
	}
	
}
