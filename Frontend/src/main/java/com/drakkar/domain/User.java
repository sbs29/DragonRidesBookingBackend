package com.drakkar.domain;


public class User extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	
	private String user;

	
	private String password;

	public User() {
	}

	
	public Long getId() {
		return super.getId();
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
