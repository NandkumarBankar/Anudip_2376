package com.starTravels.service;

import com.starTravels.DAO.busDAO;
import com.starTravels.model.Bus;
import com.starTravels.model.BusRoute;
import com.starTravels.model.Passenger;

public class BusService {

	public static boolean addBus(Bus busobj1) {
				boolean result=false;
				busDAO.addBus(busobj1);
				return result;
				
	}

	public static boolean addBusRoute(BusRoute obj1) {
		       boolean result=false;
		       
		       busDAO.addBusRoute(obj1);
		       return result;
		
	}
	public static boolean passengerDetail(Passenger pobj) {
		boolean result=false;
		busDAO.passengerDetail(pobj);
		return result;
	}
}
