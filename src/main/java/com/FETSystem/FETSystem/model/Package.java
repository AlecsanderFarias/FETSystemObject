package com.FETSystem.FETSystem.model;

public class Package {
	private Long id;
	private String name;
	private String buyer;
	private double weight;
	private int quantity;
	
	public Package(String name, String buyer, double weight, int quantity) {
		this.name = name;
		this.buyer = buyer;
		this.weight = weight;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
