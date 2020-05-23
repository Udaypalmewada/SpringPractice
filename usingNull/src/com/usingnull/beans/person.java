package com.usingnull.beans;

public class person {
	private int ssno;
	private String fullName;
	private Address address;


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public person(int ssno, Address address) {
		this.ssno = ssno;
		this.address = address;
	}


	@Override
	public String toString() {
		return "person [ssno=" + ssno + ", fullName=" + fullName + ", address=" + address + "]";
	}


}
