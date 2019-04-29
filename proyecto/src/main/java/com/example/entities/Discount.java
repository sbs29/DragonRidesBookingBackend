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
	
	private Destination destination;
	@Column
	private Long percentage;
	@Column
	private Date startdate;
	@Column
	private Date enddate;
	
	public Discount() {}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return super.getId();
	}

	public Date getStartDate() {
		return startdate;
	}

	public void setStartDate(Date date) {
		this.startdate = date;
	}
	
	public Date getEndDate() {
		return enddate;
	}

	public void setEndDate(Date date) {
		this.enddate = date;
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
