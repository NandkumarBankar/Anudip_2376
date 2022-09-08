package com.starTravels.DAO;
import com.starTravels.service.*;
import com.starTravels.model.Bus;
import com.starTravels.model.BusRoute;
import com.starTravels.model.Passenger;

public class busDAO {
	private static Bus busArray[]=new Bus[100];
	private static BusRoute busArray1[]=new BusRoute[10];
	private static Passenger busArray2[]=new Passenger[100];
	
	public static boolean addBus(Bus busobj2) {
		boolean result=false;
		
		for(int i=0;i<busArray.length;i++) {
			if(busArray[i]==null) {
				busArray[i]=busobj2;
				result=true;			
			}			
		}		
		System.out.println(busArray[0]);
		return result;
		}
	
	public static boolean addBusRoute(BusRoute obj) {
		
		boolean result=false;
		for(int j=0;j<busArray1.length;j++) {
			if(busArray1[j]==null) {
				busArray1[j]=obj;
				 result=true;
			  } 
			}
		 System.out.println(busArray1[0]);
		  return result;
	} 
		  public static boolean passengerDetail(Passenger pobj) {
			  boolean result=false;
			  for(int k=0;k<busArray1.length;k++) {
					if(busArray2[k]==null) {
						busArray2[k]=pobj;
						 result=true;
					  } 
			  	  
	}
			System.out.println(busArray2[0]);
			return result;
  }
}