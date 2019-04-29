package com.drakkar.domain;


public class Airline extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	
	private String airlineName;
	
	private String airlineImage;

	public Airline() {
	}

	@Override

	public Long getId() {
		return super.getId();
	}

	public String getAilineName() {
		return airlineName;
	}

	public void setAilineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getAirlineImage() {
		return airlineImage;
	}

	public void setAirlineImage(String airlineImage) {
		this.airlineImage = airlineImage;
	}

}
