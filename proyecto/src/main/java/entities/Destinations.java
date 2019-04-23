package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Destinations {

	@Id
	private Long id;
	@Column
	private String name;
	
	public Destinations() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Destinations [id=" + id + ", name=" + name + "]";
	}
	
}
