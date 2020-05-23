package com.ac.beans;

public class Bank {
	private Customer customer;

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Bank [customer1=" + customer + "]";
	}
	

}
