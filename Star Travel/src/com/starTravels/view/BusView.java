   package com.starTravels.view;
   import com.starTravels.model.*;
   import com.starTravels.service.BusService;

   import java.util.Scanner;
   
    public class BusView {
	static Scanner sc=new Scanner(System.in);

	public static boolean addBus() {
		boolean addResult=false;
		
		System.out.println("Enter Bus Id");
		int busId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Bus Reg No");
		int busRegNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Bus Type");
		String newvarr=sc.nextLine();
		BusType busType = BusType.valueOf(newvarr);
		System.out.println("Enter no of Seats");
		int noOfSeats=sc.nextInt();
		sc.nextLine();
		
		Bus busobj=new Bus(busId,busRegNo,busType,noOfSeats);
		BusService.addBus(busobj);
		return addResult;
	  
	  }
	public static boolean addBusRoute() {
	    boolean result=false;
	    	
	    System.out.println("Enter Bus Id");
	    int busId=sc.nextInt();
	    sc.nextLine();
	    System.out.println("Enter Route Id ");
	    int routrId=sc.nextInt();
	    sc.nextLine();
	    System.out.println("Enter Source City");
	    String sourceCity=sc.nextLine();
	    System.out.println("Enter Bus Destination City");
	    String busDestinationCity=sc.nextLine();
	    	
	    BusRoute obj=new BusRoute(busId,routrId,sourceCity,busDestinationCity);
	    BusService.addBusRoute(obj);
	    
	    return result;
	    }
	
	public static boolean passsengerDetail() {
		boolean result=false;
		System.out.println("Enter Passenger Name");
		String passengerName=sc.nextLine();
		System.out.println("Enter mobile No");
		long mobileNo=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Address");
		String address=sc.nextLine();
		System.out.println("Enter Gender");
		String newvarr1=sc.nextLine();
		Gender gender=Gender.valueOf(newvarr1);
		
		
		Passenger pobj=new Passenger(passengerName,mobileNo,address,gender);
		BusService.passengerDetail(pobj);
		
		return result;
	}
	public static boolean ticketBooking() {
		boolean result=false;
		System.out.println("Enter Bus ID :");
		int busId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Route ID : ");
		int routeId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter No Of Seat : ");
		int noOfSeats=sc.nextInt();
		sc.nextLine();
		if(noOfSeats<=50) {
			System.out.println("Seats Are Available :");
			for(int i=0;i<=noOfSeats;i++) {
				int charges=noOfSeats*150;
				System.out.println("Your charges RS = " + charges );
				break;
			}
		  }
			else {
				System.err.println("Seats are Not Available");
			}
		
		return result;
	}
	}      

