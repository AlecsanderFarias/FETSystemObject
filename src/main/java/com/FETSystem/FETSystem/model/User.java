package com.FETSystem.FETSystem.model;

public class User {
	
	private Long Id;
	private String name;
	private String password;
	private String email;
	
	public User( String password, String email, String name) {
		this.name = name;
		this.password = password;
		this.email = email;
	}
	
	
}
