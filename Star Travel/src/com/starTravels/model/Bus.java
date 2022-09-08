package com.starTravels.model;

import java.util.Objects;

public class Bus {
	private int busId;
	private int busRegNo;
	private BusType busType;
	private int noOfSeats;
	
	public int getBusId() {
		return busId;
	}	
	public Bus() {
		super();
			}
	public Bus(int busId, int busRegNo, com.starTravels.model.BusType busType, int noOfSeats) {
		super();
		this.busId = busId;
		this.busRegNo = busRegNo;
	    this.busType= busType;
		this.noOfSeats = noOfSeats;
	}

	public int getBusRegNo() {
		return busRegNo;
	}

	public void setBusRegNo(int busRegNo) {
		this.busRegNo = busRegNo;
	}

	public BusType getBusType() {
		return busType;
	}

	public void setBusType(BusType busType) {
		busType = busType;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(busType, busId, busRegNo, noOfSeats);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bus other = (Bus) obj;
		return Objects.equals(busType, other.busType) && busId == other.busId && busRegNo == other.busRegNo
				&& noOfSeats == other.noOfSeats;
	}
	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busRegNo=" + busRegNo + ", BusType=" + busType + ", noOfSeats=" + noOfSeats
				+ "]";
	}

	
}
