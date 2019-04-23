package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import java.sql.Time;
import java.util.Date;

@Entity
public class Flights {

	@Id
	private String flightId;
//	@Column
//	private Long flightId;
	@Column
	private Long airline;
	@Column
	private Date arrivalDate;
	@Column
	private Time arrivalTime;
	@Column
	private Long destination;
	@Column
	private Date departureDate;
	@Column
	private Time departureTime;
	@Column
	private double price;
	
	public Flights() {}
	
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public Long getAirline() {
		return airline;
	}
	public void setAirline(Long airline) {
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
	public Long getDestination() {
		return destination;
	}
	public void setDestination(Long destination) {
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

	@Override
	public String toString() {
		return "Flights [flightId=" + flightId + ", airline=" + airline + ", arrivalDate=" + arrivalDate
				+ ", arrivalTime=" + arrivalTime + ", destination=" + destination + ", departureDate=" + departureDate
				+ ", departureTime=" + departureTime + ", price=" + price + "]";
	}
	
}
