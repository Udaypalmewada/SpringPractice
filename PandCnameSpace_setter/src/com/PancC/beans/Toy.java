package com.PancC.beans;

public class Toy {
	private int no;
	private String name;
	private String type;
	private Manufacture manufaturer;
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setManufaturer(Manufacture manufaturer) {
		this.manufaturer = manufaturer;
	}
	@Override
	public String toString() {
		return "Toy [no=" + no + ", name=" + name + ", type=" + type + ", manufaturer=" + manufaturer + "]";
	}
	
}
