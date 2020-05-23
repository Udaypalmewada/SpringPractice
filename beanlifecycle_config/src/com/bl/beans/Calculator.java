package com.bl.beans;

public class Calculator {
	private int i;
	private int j;
	private int sum;

	public Calculator(int i) {
		this.i = i;

	}

	public void setJ(int j) {
		this.j = j;
	}

	public void setSum(int sum) {
		this.sum = this.i + this.j;
	}
public void startup() {
	this.sum=this.i+this.j;
}
public void cleanup() {
	System.out.println("Destroying.....");
	
}
	@Override
	public String toString() {
		return "Calculator [i=" + i + ", j=" + j + ", sum=" + sum + "]";
	}

}
