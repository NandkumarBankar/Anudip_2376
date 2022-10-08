package org.practicaltest.dao;

import java.util.HashSet;

import org.practicaltest.model.Department;
import org.practicaltest.model.Employee;

public class DeparmentDAO {

	
	public static void addDepData(Department dep) {
		
		HashSet<Department> hs=new HashSet<>();
		hs.add(dep);
		System.out.println(hs);
		}
}
