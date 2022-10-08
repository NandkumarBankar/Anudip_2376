package org.practicaltest.dao;

import java.util.HashMap;
import java.util.Iterator;

import org.practicaltest.model.Department;
import org.practicaltest.model.Employee;

public class EmployeeDepartmentDAO {

	static HashMap<Employee, Department> hm=new HashMap<>();
	
	public static void addEmpDepData(Employee emp,Department dep) {
		hm.put(emp, dep);
	    System.out.println(hm);
		
		
	}
	public HashMap<Employee, Department> getData(){
		return hm;
	}
}
