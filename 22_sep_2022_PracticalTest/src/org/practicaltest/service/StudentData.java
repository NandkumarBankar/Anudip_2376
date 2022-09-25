package org.practicaltest.service;
import java.util.TreeSet;
import java.util.NoSuchElementException;
import java.util.Iterator;
import org.practicaltest.model.Student;
import org.practicaltest.view.StudentView;



  public class StudentData {
	
	 public static void StudentDetail(int id ,String Name,TreeSet<Student>ts) {
		 Student std=new Student(id,Name);
		 
		 ts.add(std);
		 System.out.println("Data added succesfully"); 
	 }
	public static void printStudentData(TreeSet<Student>ts) {
	  
		 Iterator<Student> itr=ts.iterator();
		Student s=null;
		try {
			while((s=itr.next())!=null) {
				System.out.println(s);
			}
		}catch(NoSuchElementException e) {
			System.out.println("Done");
	}
  }
} 
