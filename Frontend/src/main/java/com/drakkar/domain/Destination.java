package com.drakkar.domain;



public class Destination extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	
	private String name;

	public Destination() {}

	
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
