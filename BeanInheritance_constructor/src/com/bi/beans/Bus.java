package com.bi.beans;

import java.beans.ConstructorProperties;

public class Bus {
	private int id;
	private String model;
	private String manufacturer;
	private String color;
	private String fuleType;
	private int milage;
	private int price;
	private int capacity;
	@ConstructorProperties({"id","model","manufacturer","color","fuleType","milage", "price","capacity"})

	public Bus(int id, String model, String manufacturer, String color, String fuleType, int milage, int price,int capacity) {
		this.id = id;
		this.model = model;
		this.manufacturer = manufacturer;
		this.color = color;
		this.fuleType = fuleType;
		this.milage = milage;
		this.price = price;
		this.capacity=capacity;
	}
	@Override
	public String toString() {
		return "Bus [id=" + id + ", model=" + model + ", manufacturer=" + manufacturer + ", color=" + color
				+ ", fuleType=" + fuleType + ", milage=" + milage + ", price=" + price + ", capacity=" + capacity + "]";
	}



	


}
