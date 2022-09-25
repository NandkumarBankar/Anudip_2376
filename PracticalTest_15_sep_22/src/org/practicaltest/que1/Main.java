package org.practicaltest.que1;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.practicaltest.que1.Employee;
import java.util.Scanner;

public class Main {
	
   static Scanner sc=new Scanner(System.in);
   
	public static void main(String[]args)throws Exception{
		
		System.out.println("Enter Emp Id");
		int A=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Emp Name");
		String Name1=sc.nextLine();
		System.out.println("Enter Date of Joining (dd/mm/yyyy)");
		String date1=sc.nextLine();
		System.out.println("Enter Emp Id");
		int B=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Emp Name");
		String Name2=sc.nextLine();
		System.out.println("Enter Date of Joining (dd/mm/yyyy)");
		String date2=sc.nextLine();
		System.out.println("Enter Emp Id");
		int C=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Emp Name");
		String Name3=sc.nextLine();
		System.out.println("Enter Date of Joining (dd/mm/yyyy)");
		String date3=sc.nextLine();
		System.out.println("Enter Emp Id");
		int D=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Emp Name");
		String Name4=sc.nextLine();
		System.out.println("Enter Date of Joining (dd/mm/yyyy) ");
		String date4=sc.nextLine();
		System.out.println("Enter Emp Id");
		int E=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Emp Name");
		String Name5=sc.nextLine();
		System.out.println("Enter Date of Joining (dd/mm/yyyy)");
	    String date5=sc.nextLine();
		
		Employee obj1=new Employee(A, Name1,date1);
		Employee obj2=new Employee(B, Name2,date2);
		Employee obj3=new Employee(C, Name3,date3);
		Employee obj4=new Employee(D, Name4,date4);
		Employee obj5=new Employee(E, Name5,date5);
				
		Employee emp[]=new Employee[5];
	
			emp[0]=obj1;
			emp[1]=obj2;
			emp[2]=obj3;
			emp[3]=obj4;
			emp[4]=obj5;
			
		for(int i=0; i<emp.length;i++) {			
			System.out.println(emp[i]);
		}		
	}
}