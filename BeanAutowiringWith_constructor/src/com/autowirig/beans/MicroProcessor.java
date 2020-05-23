package com.autowirig.beans;

public class MicroProcessor {
private int id;
private String type;
public void setId(int id) {
	this.id = id;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "MicroProcessor [id=" + id + ", type=" + type + "]";
}

}
