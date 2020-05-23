package com.PancC.beans;

public class Manufacture {
	private int mid;
	private String mname;
	private String maddress;
	
	public Manufacture(int mid, String mname, String maddress) {
		this.mid = mid;
		this.mname = mname;
		this.maddress = maddress;
	}

	@Override
	public String toString() {
		return "Manufacture [mid=" + mid + ", mname=" + mname + ", maddress=" + maddress + "]";
	}
	
	

}
