package com.PancC.beans;

public class Manufacture {
	private int mid;
	private String mname;
	private String maddress;
	public void setMid(int mid) {
		this.mid = mid;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public void setMaddress(String maddress) {
		this.maddress = maddress;
	}
	@Override
	public String toString() {
		return "Manufacture [mid=" + mid + ", mname=" + mname + ", maddress=" + maddress + "]";
	}
	
	

}
