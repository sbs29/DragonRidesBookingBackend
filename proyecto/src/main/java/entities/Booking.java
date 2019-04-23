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

	@Override
	public String toString() {
		return "Booking [id=" + id + ", user=" + user + "]";
	}

	
	
}
