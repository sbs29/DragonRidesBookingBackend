package com.example.drakkar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Booking extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	private Flight flight;
	private Discount discount;

	private User user;

	private Booking(Builder builder) {
		this.flight = builder.flight;
		this.discount = builder.discount;
		this.user = builder.user;
	}

	public Booking() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return super.getId();
	}

	@ManyToOne
	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	/**
	 * Creates builder to build {@link Booking}.
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link Booking}.
	 */
	public static final class Builder {
		private Flight flight;
		private Discount discount;
		private User user;

		private Builder() {
		}

		public Builder withFlight(Flight flight) {
			this.flight = flight;
			return this;
		}

		public Builder withDiscount(Discount discount) {
			this.discount = discount;
			return this;
		}

		public Builder withUser(User user) {
			this.user = user;
			return this;
		}

		public Booking build() {
			return new Booking(this);
		}
	}

}
