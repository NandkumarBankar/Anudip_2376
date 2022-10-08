package org.practicaltest.service;

import org.practicaltest.dao.EmployeeDAO;
import org.practicaltest.model.Employee;

public class EmployeeService {

	public static void empServiceData(Employee emp) {
		
		EmployeeDAO.addEmpData(emp);
	}
}
