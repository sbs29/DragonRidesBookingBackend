package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airlines {
	
	@Id
	private Long AirlineId;

	@Column
	private String AirlineName;
	
	@Column
	private String AirlineImage;
	
	public Airlines() {
	}

	public Long getAirlineId() {
		return AirlineId;
	}
	
	public void setAirlineId(Long AirlineId) {
		this.AirlineId = AirlineId;
	}

	public String getAirlineName() {
		return AirlineName;
	}

	public void setAirlineName(String AirlineName) {
		this.AirlineName = AirlineName;
	}

	public String getAirlineImage() {
		return AirlineImage;
	}

	public void setAirlineImage(String AirlineImage) {
		this.AirlineImage = AirlineImage;
	}

	@Override
	public String toString() {
		return "Airlines [AirlineId=" + AirlineId + ", AirlineName=" + AirlineName + ", AirlineImage=" + AirlineImage + "]";
	}
	
}
