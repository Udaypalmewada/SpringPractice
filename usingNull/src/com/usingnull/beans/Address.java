package com.usingnull.beans;

public class Address {
private int hno;
private String streatname;
private String city;
private String state;
private int zip;
private String country;
public void setHno(int hno) {
	this.hno = hno;
}
public void setStreatname(String streatname) {
	this.streatname = streatname;
}
public void setCity(String city) {
	this.city = city;
}
public void setState(String state) {
	this.state = state;
}
public void setZip(int zip) {
	this.zip = zip;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "Address [hno=" + hno + ", streatname=" + streatname + ", city=" + city + ", state=" + state + ", zip=" + zip
			+ ", country=" + country + "]";
}
 
}
