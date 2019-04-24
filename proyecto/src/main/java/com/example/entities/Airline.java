package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airline extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Column
	private String airlineName;
	@Column
	private String airlineImage;

	public Airline() {
	}

	@Override
	@Id
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
