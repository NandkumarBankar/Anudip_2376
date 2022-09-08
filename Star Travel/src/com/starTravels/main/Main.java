package com.starTravels.main;
import com.starTravels.view.*;
import com.starTravels.model.*;
import com.starTravels.service.BusService;
import com.starTravels.view.*;
import java.util.Scanner;
public class Main {
	static void diplayPassDetaial() {
		System.out.println("press 1 for Passenger Detail ");
		int EnterNo=sc.nextInt();
		sc.nextLine();
		switch(EnterNo) {
		case 1:{
			boolean Result=BusView.passsengerDetail();
			break;
		}
		default:
			
		}
	}
	static void adminPanel() {
	System.out.println("Press 1 For  Add Bus ");
	System.out.println("Press 2 For Add Bus Route");
	int choiceNo=sc.nextInt();
	sc.nextLine();
	switch (choiceNo) {
	case 1: {
		boolean addResult=BusView.addBus();
	    break;   
	        }
	case 2: {
		boolean Result=BusView.addBusRoute();
	    break;
		}
	    default:
	}
	
	}
	 static void adminDetail () {
		System.out.println("Enter logIn ID ");
		int adminId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter password");
		int password=sc.nextInt();
		sc.nextLine();
		if(adminId==1234 && password==1212) {
			System.out.println("Succesfull");
			adminPanel();
			System.exit(0);
		}
		else {
			System.out.println("Wrong Detail");
		}
		
	}

	  static void displaySubMenu() {
		  System.out.println("Press 1 For Admin Panel");
		  System.out.println("Press 2 For Reservation Seat");
		  int enterNo=sc.nextInt();
		  sc.nextLine();
		  switch (enterNo) {
		  
		case 1: {
			    adminDetail ();
			    break;
		}
        case 2:{
        	   BusView.passsengerDetail();		
        	   BusView.ticketBooking();
        	   System.exit(0);
        	   break;
		}
		default:
		}
	  }
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		do {
	System.out.println("WelCome to Star Travel");
	System.out.println("Press 1  to Start App");
	System.out.println("Press 2  to Stop App");
	int choiceNo=sc.nextInt();
	switch(choiceNo) {
	case 1:
		    displaySubMenu();		  
		  break;
		  default:
			  System.out.println("invalied datail");
	      }
		}
	while(true);
	 }	
	}


