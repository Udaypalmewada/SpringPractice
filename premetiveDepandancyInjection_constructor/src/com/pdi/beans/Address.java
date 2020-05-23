package com.pdi.beans;

public class Address {
private String addressLine1;
private String addressLine2;
private String streat;
private String city;
private int zip;
private String country;
public Address(String addressLine1, String addressLine2, String streat, String city, int zip, String country) {
	super();
	this.addressLine1 = addressLine1;
	this.addressLine2 = addressLine2;
	this.streat = streat;
	this.city = city;
	this.zip = zip;
	this.country = country;
}
@Override
public String toString() {
	return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", streat=" + streat + ", city="
			+ city + ", zip=" + zip + ", country=" + country + "]";
}


}
