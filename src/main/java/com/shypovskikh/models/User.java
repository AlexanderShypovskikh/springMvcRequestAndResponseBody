package com.shypovskikh.models;

import javax.validation.constraints.Size;

public class User {
	
	@Size(min = 6, message="Name can not be less then 6 characters")
	private String email;
	@Size(min = 5, max = 10, message = "Password can not be less then 6 characters")
	private String password;
	private boolean admin;
	
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	
	

}
