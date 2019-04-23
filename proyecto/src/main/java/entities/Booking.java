package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {

	@Id
	private Long id;
	@Column
	private String user;
	@Column
	private String flightId;
	@Column
	private Long offer;
	
	public Booking() {}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	
	public Long getOffer() {
		return offer;
	}
	public void setOffer(Long offer) {
		this.offer = offer;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", user=" + user + ", flightId=" + flightId + ", offer=" + offer + "]";
	}
	
}
