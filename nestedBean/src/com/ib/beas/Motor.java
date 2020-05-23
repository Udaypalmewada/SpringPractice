package com.ib.beas;

public class Motor{
	private FuleTank fuleTank;

	public FuleTank getFuleTank() {
		return fuleTank;
	}

	public void setFuleTank(FuleTank fuleTank) {
		this.fuleTank = fuleTank;
	}

	@Override
	public String toString() {
		return "Motor [fiuleTank=" + fuleTank + "]";
	}

}
