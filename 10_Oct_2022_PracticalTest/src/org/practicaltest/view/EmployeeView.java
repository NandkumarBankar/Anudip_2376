package org.practicaltest.view;

import java.util.Scanner;

import org.practicaltest.model.Employee;
import org.practicaltest.model.Gender;
import org.practicaltest.service.EmployeeDeparmentservice;
import org.practicaltest.service.EmployeeService;

public class EmployeeView {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void EmployeeData() {
    
		
		int empId=0;
		empId++;
		System.out.println("Employee ID : "+empId);
		System.out.println("Enter Employee Name : ");
		String empName=sc.nextLine();
		System.out.println("Enter gender :");
		String var=sc.nextLine();
		String newvar=var.toUpperCase();
		Gender gender=Gender.valueOf(newvar); 
		System.out.println("Enter date of Joining In Format DD/MM/YYYY");
		String DOJ=sc.nextLine();
		
		Employee empdata=new Employee(empId,empName,gender, DOJ);
		EmployeeService.empServiceData(empdata);
		EmployeeDeparmentservice.empDepServiceData1(empdata);
	}
	
}
