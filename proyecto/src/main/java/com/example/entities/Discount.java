package com.example.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Discount extends AbstractEntity{


	private static final long serialVersionUID = 1L;

	@Column
	private Long offer;
	
	private Destination destination;
	@Column
	private Long percentage;
	@Column
	private Date date;
	
	public Discount() {}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return super.getId();
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getOffer() {
		return offer;
	}
	public void setOffer(Long offer) {
		this.offer = offer;
	}
	
	@ManyToOne
	public Destination getDestination() {
		return destination;
	}
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	
	public Long getPercentage() {
		return percentage;
	}
	public void setPercentage(Long percentage) {
		this.percentage = percentage;
	}
}
