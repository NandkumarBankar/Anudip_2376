package org.practicaltest.main;

import org.practicaltest.view.DepartmentView;
import org.practicaltest.view.EmployeeView;

public class Main {

	public static void main(String[] args) {
		
		EmployeeView.EmployeeData();	
		System.out.print("EmployeeData Added Succesfully \n");
		DepartmentView.DepartmentData();
		System.out.print("DepartmentData Added Succesfully \n");
	}

}
