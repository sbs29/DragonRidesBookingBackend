package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Destination extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Column
	private String name;

	public Destination() {}

	@Override
	@Id
	public Long getId() {
		return super.getId();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
