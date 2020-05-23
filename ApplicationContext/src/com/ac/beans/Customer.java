package com.ac.beans;

public class Customer {
	private int accountno;
	private String name;
	private double bal;
	
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "customer [accountno=" + accountno + ", name=" + name + ", bal=" + bal + "]";
	}

}
