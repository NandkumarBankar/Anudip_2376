package org.practicaltest.view;
import java.util.Scanner;
import java.util.TreeSet;

import org.practicaltest.service.StudentData;

  public class StudentView {
	  
    public static Scanner sc=new Scanner(System.in);
	
    public static void main(String [] args) {
    
    TreeSet<org.practicaltest.model.Student> ts=new TreeSet<>();
    
    System.out.println("Enter Detail : Student ID , Student Name ");
    
    for(int i=1;i<=10;i++) {
    	System.out.println(i +" id :");
    	int id=sc.nextInt();
    	sc.nextLine();
    	System.out.println(i +" Name :");
    	String Name=sc.nextLine();
    	StudentData.StudentDetail(id,Name,ts);
       }
        StudentData.printStudentData(ts);
        sc.close();
     }
	
}