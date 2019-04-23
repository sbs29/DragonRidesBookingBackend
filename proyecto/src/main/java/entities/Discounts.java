package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Discounts {

	@Id
	private Long id;
	@Column
	private Long offer;
	@Column
	private Long destination;
	@Column
	private Long percentage;
	
	public Discounts() {}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getOffer() {
		return offer;
	}
	public void setOffer(Long offer) {
		this.offer = offer;
	}
	public Long getDestination() {
		return destination;
	}
	public void setDestination(Long destination) {
		this.destination = destination;
	}
	public Long getPercentage() {
		return percentage;
	}
	public void setPercentage(Long percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Discounts [id=" + id + ", offer=" + offer + ", destination=" + destination + ", percentage="
				+ percentage + "]";
	}
	
}
