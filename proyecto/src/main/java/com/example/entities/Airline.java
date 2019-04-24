package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airline {

	@Id
	private Long id;
	@Column
	private String airlineName;
	@Column
	private String airlineImage;
	
	public Airline() {}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Airlines [id=" + id + ", airlineName=" + airlineName + ", airlineImage=" + airlineImage + "]";
	}
	
}
