package com.bi.beans;

import java.beans.ConstructorProperties;

public class Car {
	private int id;
	private String model;
	private String manufacturer;
	private String color;
	private String fuleType;
	private int milage;
	private int price;
	

	@ConstructorProperties({"id","model","manufacturer","color","fuleType","milage", "price"})

	public Car(int id, String model, String manufacturer, String color, String fuleType, int milage, int price) {
		this.id = id;
		this.model = model;
		this.manufacturer = manufacturer;
		this.color = color;
		this.fuleType = fuleType;
		this.milage = milage;
		this.price = price;
	}



	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", manufacturer=" + manufacturer + ", color=" + color
				+ ", fuleType=" + fuleType + ", milage=" + milage + ", price=" + price + "]";
	}

	}


