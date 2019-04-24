package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Airline extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Override
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return super.getId();
	}

	@Column
	private String airlineName;

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getAirlineImage() {
		return airlineImage;
	}

	public void setAirlineImage(String airlineImage) {
		this.airlineImage = airlineImage;
	}

	@Column
	private String airlineImage;

	public Airline() {
	}

}
