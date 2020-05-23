package com.bi.beans;

public class Car {
	private String id;
	private String model;
	private String manufacturer;
	private String color;
	private String Fuletype;
	private float milage;
	
	public void setId(String id) {
		this.id = id;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setFuletype(String fuletype) {
		Fuletype = fuletype;
	}
	public void setMilage(float milage) {
		this.milage = milage;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	private float price;
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", manufacturer=" + manufacturer + ", color=" + color
				+ ", Fuletype=" + Fuletype + ", milage=" + milage + ", price=" + price + "]";
	}
	
}
