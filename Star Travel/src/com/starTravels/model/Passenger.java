package com.starTravels.model;

import java.util.Objects;

public class Passenger {

	private String passengerName;
	private long mobileNo;
	private String address;
	private Gender gender;
	public Passenger() {
		super();
			}
	
	public Passenger(String passengerName, long mobileNo, String address, Gender gender) {
		super();
		this.passengerName = passengerName;
		this.mobileNo = mobileNo;
		this.address = address;
		this.gender = gender;
	}

	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Passenger [passengerName=" + passengerName + ", mobileNo=" + mobileNo + ", address=" + address
				+ ", gender=" + gender + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, gender, mobileNo, passengerName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passenger other = (Passenger) obj;
		return Objects.equals(address, other.address) && gender == other.gender && mobileNo == other.mobileNo
				&& Objects.equals(passengerName, other.passengerName);
	}
	
	
	
}
