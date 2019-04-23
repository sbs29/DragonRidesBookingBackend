package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airlines {

	@Id
	private Long airlineId;
	@Column
	private String ailineName;
	@Column
	private String airlineImage;
	
	public Airlines() {}

	public Long getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(Long airlineId) {
		this.airlineId = airlineId;
	}

	public String getAilineName() {
		return ailineName;
	}

	public void setAilineName(String ailineName) {
		this.ailineName = ailineName;
	}

	public String getAirlineImage() {
		return airlineImage;
	}

	public void setAirlineImage(String airlineImage) {
		this.airlineImage = airlineImage;
	}

	@Override
	public String toString() {
		return "Airlines [airlineId=" + airlineId + ", ailineName=" + ailineName + ", airlineImage=" + airlineImage
				+ "]";
	}
	
}
