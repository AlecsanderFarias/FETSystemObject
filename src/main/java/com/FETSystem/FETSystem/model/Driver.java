package com.FETSystem.FETSystem.model;

public class Driver extends User{
	private String cpf;
	private String cnh;
	private DriverStatus status = DriverStatus.IDLE;
	
	
	public Driver(  String password,String email, String name,String cpf, String cnh) {
		super(password,email,name);
		this.cpf = cpf;
		this.cnh = cnh;
	}
	
}
