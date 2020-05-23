package com.st.perfomance.thread;



public class work extends Thread {

	@Override
	public void run() {
		UnitConverter unit = UnitConverter.getInstance();
			
		System.out.println("Hashcode for A>>::"+unit.hashCode());
	}

}
