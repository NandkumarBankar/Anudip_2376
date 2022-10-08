package org.practicaltest.service;

import org.practicaltest.dao.DeparmentDAO;
import org.practicaltest.model.Department;

public class DeparmentService {


	public static void  DepServiceData(Department depData) {
		DeparmentDAO.addDepData(depData);
	}
}
