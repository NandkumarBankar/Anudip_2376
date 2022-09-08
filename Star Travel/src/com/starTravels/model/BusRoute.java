package com.starTravels.model;

import java.util.Objects;

public class BusRoute {

	private int busId;
	private int routeId;
	private String busSourceCity;
	private String busDestinationCity;
	
	
	public BusRoute() {
		super();
			}
	
	public BusRoute(int busId, int routeId, String busSourceCity, String busDestinationCity) {
		super();
		this.busId = busId;
		this.routeId = routeId;
		this.busSourceCity = busSourceCity;
		this.busDestinationCity = busDestinationCity;
	}

	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public String getBusSourceCity() {
		return busSourceCity;
	}
	public void setBusSourceCity(String busSourceCity) {
		this.busSourceCity = busSourceCity;
	}
	public String getBusDestinationCity() {
		return busDestinationCity;
	}
	public void setBusDestinationCity(String busDestinationCity) {
		this.busDestinationCity = busDestinationCity;
	}
	@Override
	public int hashCode() {
		return Objects.hash(busDestinationCity, busId, busSourceCity, routeId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BusRoute other = (BusRoute) obj;
		return Objects.equals(busDestinationCity, other.busDestinationCity) && busId == other.busId
				&& Objects.equals(busSourceCity, other.busSourceCity) && routeId == other.routeId;
	}
	@Override
	public String toString() {
		return "BusRoute [busId=" + busId + ", routeId=" + routeId + ", busSourceCity=" + busSourceCity
				+ ", busDestinationCity=" + busDestinationCity + "]";
	}
	
}
