package com.springbootfieldvalidation.dto;

import com.springbootfieldvalidation.model.User;

import javax.persistence.Column;

public class LoginResponseDTO {

	private String name;


	private String username;

	private String userRole;
	public LoginResponseDTO(User user) {
		this.name = user.getName();
		this.username = user.getUsername();
		this. userRole = user.getUserRole();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
}
