package com.ib.beas;

public class FuleTank {
	private String fuleTankType;
	private int capacity;
	public void setFuleTankType(String fuleTankType) {
		this.fuleTankType = fuleTankType;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "FuleTank [fuleTankType=" + fuleTankType + ", capacity=" + capacity + "]";
	}

}
