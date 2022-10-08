package org.practicaltest.view;

import java.util.Scanner;

import org.practicaltest.model.Department;
import org.practicaltest.model.DepartmentName;
import org.practicaltest.service.DeparmentService;
import org.practicaltest.service.EmployeeDeparmentservice;

public class DepartmentView {

	static Scanner sc=new Scanner(System.in);

	public static void DepartmentData() {
	
		int depID=0;
		depID++;
		System.out.println("\nDepartment ID : " + depID);
		
		System.out.println("Enter Department Choose One By Following Each : \n 1 FULLSTACK_DEVELOPER "
				+ "\n 2 BACKEND_DEVELOPER \n 3 FRONTEND_DEVELOPER");
		String str=sc.nextLine();
		String newstr=str.toUpperCase();
		DepartmentName depName=DepartmentName.valueOf(newstr);
		
		
		Department depData=new Department(depName, depID);
		
		DeparmentService.DepServiceData(depData);
		EmployeeDeparmentservice.empDepServiceData2(depData);
		
	}
	
}
