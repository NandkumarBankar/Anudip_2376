package question1.main;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
 static Scanner sc=new Scanner(System.in);

 
	public static void main(String[] args) throws IOException {
		
		

		System.out.println("Enter Full Name : ");
		String Name=sc.nextLine();
		
		StringTokenizer st= new StringTokenizer(Name);
		while(st.hasMoreElements()) {
			int count=st.countTokens();
		  if( count<3 && count>1 ) {
			  System.out.println(Name);
			  break;
		  }else {
			System.out.println("Invalid data");
			break;
		   }			  
			  }
		
	
	}
}