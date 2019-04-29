package com.drakkar.domain;

public class Booking extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	private Flight flight;
	
	private Discount discount;
	
	private User user;

	public Booking() {
	}

	public Long getId() {
		return super.getId();
	}

	
	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	
	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
