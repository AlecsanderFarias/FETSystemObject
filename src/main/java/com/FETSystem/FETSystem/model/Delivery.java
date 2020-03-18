package com.FETSystem.FETSystem.model;

import java.util.ArrayList;
import java.util.Date;

public class Delivery {
	private Long id;
	private String destination;
	private Double price;
	private Date initialDate;
	private Date finalDate;
	private ArrayList<Package> packages;
	private DeliveryStatus status = DeliveryStatus.PENDING;

	
	public Delivery(String destination, double price, Date initialDate, Date finalDate) {
		this.destination = destination;
		this.price = price;
		this.initialDate = initialDate;
		this.finalDate = finalDate;
	}
	
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
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
	public DeliveryStatus getStatus() {
		return status;
	}
	public void setStatus(DeliveryStatus status) {
		this.status = status;
	}
	
	
}
