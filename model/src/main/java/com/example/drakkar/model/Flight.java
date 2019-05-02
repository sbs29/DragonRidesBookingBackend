package com.example.drakkar.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.annotation.Generated;

@Entity
public class Flight extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	private Airline airline;

	@Column
	private Date arrivalDate;

	private Destination origin;

	private Destination destination;

	@Column
	private Date departureDate;

	@Column
	private double price;

	private Flight(Builder builder) {
		this.airline = builder.airline;
		this.arrivalDate = builder.arrivalDate;
		this.origin = builder.origin;
		this.destination = builder.destination;
		this.departureDate = builder.departureDate;
		this.price = builder.price;
	}

	public Flight() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return super.getId();
	}

	@ManyToOne
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

	@ManyToOne
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setOrigin(Destination origin) {
		this.origin = origin;
	}

	@ManyToOne
	public Destination getOrigin() {
		return origin;
	}

	/**
	 * Creates builder to build {@link Flight}.
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link Flight}.
	 */
	public static final class Builder {
		private Airline airline;
		private Date arrivalDate;
		private Destination origin;
		private Destination destination;
		private Date departureDate;
		private double price;

		private Builder() {
		}

		public Builder withAirline(Airline airline) {
			this.airline = airline;
			return this;
		}

		public Builder withArrivalDate(Date arrivalDate) {
			this.arrivalDate = arrivalDate;
			return this;
		}

		public Builder withOrigin(Destination origin) {
			this.origin = origin;
			return this;
		}

		public Builder withDestination(Destination destination) {
			this.destination = destination;
			return this;
		}

		public Builder withDepartureDate(Date departureDate) {
			this.departureDate = departureDate;
			return this;
		}

		public Builder withPrice(double price) {
			this.price = price;
			return this;
		}

		public Flight build() {
			return new Flight(this);
		}
	}
}
