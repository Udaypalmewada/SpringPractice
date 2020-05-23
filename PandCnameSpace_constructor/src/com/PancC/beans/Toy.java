package com.PancC.beans;

public class Toy {
	private int no;
	private String name;
	private String type;
	private Manufacture manufaturer;
	
	public Toy(int no, String name, String type, Manufacture manufaturer) {
		this.no = no;
		this.name = name;
		this.type = type;
		this.manufaturer = manufaturer;
	}

	@Override
	public String toString() {
		return "Toy [no=" + no + ", name=" + name + ", type=" + type + ", manufaturer=" + manufaturer + "]";
	}
	
}
