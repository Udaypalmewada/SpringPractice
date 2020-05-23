package com.pdi.beans;

public class Address {
private String addressLine1;
private String addressLine2;
private String streat;
private String city;
private int zip;
private String country;
public void setAddressLine1(String addressLine1) {
	this.addressLine1 = addressLine1;
}
public void setAddressLine2(String addressLine2) {
	this.addressLine2 = addressLine2;
}
public void setStreat(String streat) {
	this.streat = streat;
}
public void setCity(String city) {
	this.city = city;
}
public void setZip(int zip) {
	this.zip = zip;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", streat=" + streat + ", city="
			+ city + ", zip=" + zip + ", country=" + country + "]";
}

}
