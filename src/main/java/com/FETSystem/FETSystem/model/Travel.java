package com.FETSystem.FETSystem.model;

import java.util.ArrayList;
import java.util.Date;

public class Travel {
	private Long Id;
	private String origin;
	private String destination;
	private Date initialDate;
	private Date finalDate;
	private TravelStatus status;
	private Driver driver;
	private ArrayList<Expense> expenses;  
	private ArrayList<Delivery> deliveries;
	private  ArrayList<Locomotion> locomotion;


	public String getOrigin() {
		return origin;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public Date getInitialDate() {
		return initialDate;
	}
	
	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}
	
	public Date getFinalDate() {
		return finalDate;
	}
	
	public void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}
	
	public TravelStatus getStatus() {
		return status;
	}
	
	public void setStatus(TravelStatus status) {
		this.status = status;
	}
	
	public Driver getDriver() {
		return driver;
	}
	
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	public ArrayList<Expense> getExpenses() {
		return expenses;
	}
	
	public void setExpenses(ArrayList<Expense> expenses) {
		this.expenses = expenses;
	}
	
	public ArrayList<Delivery> getDeliveries() {
		return deliveries;
	}
	
	public void setDeliveries(ArrayList<Delivery> deliveries) {
		this.deliveries = deliveries;
	}
	
	public ArrayList<Locomotion> getLocomotion() {
		return locomotion;
	}
	
	public void setLocomotion(ArrayList<Locomotion> locomotion) {
		this.locomotion = locomotion;
	}
	
	
	
	
}
