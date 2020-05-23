package com.an.beans;

public class Toy {
	@Override
	public String toString() {
		return "Toy [id=" + id + ", name=" + name + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int id;
	private String name;


}
