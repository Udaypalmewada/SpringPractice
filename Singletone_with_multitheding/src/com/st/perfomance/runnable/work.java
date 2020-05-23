package com.st.perfomance.runnable;



public class work implements Runnable {

	@Override
	public void run() {
		UnitConverter unit = UnitConverter.getInstance();
			System.out.println("Hashcode ::"+unit.hashCode());
	}

}
