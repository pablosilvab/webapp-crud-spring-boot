package com.udemy.model;

public class UserCredential {

	private String username;
	private String password;

	public UserCredential() {
	}

	public UserCredential(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserCredential [username=").append(username).append(", password=").append(password).append("]");
		return builder.toString();
	}
	
	

}
