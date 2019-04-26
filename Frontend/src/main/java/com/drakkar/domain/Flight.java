package com.drakkar.domain;

import java.sql.Date;
import java.sql.Time;



public class Flight extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	private Airline airline;

	
	private Date arrivalDate;

	
	private Time arrivalTime;

	private Destination destination;

	private Destination origin;

	
	private Date departureDate;

	
	private Time departureTime;

	
	private double price;

	public Flight() {
	}

	public Long getId() {
		return super.getId();
	}

	
	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Time getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	
	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setOrigin(Destination origin) {
		this.origin = origin;
	}

	
	public Destination getOrigin() {
		return origin;
	}
}
